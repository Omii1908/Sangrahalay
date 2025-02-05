package com.sangrahalay.gui;

import com.sangrahalay.managers.IssueManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ReturnBookDialog extends JDialog {
    private JTextField bookIdField, memberIdField;

    public ReturnBookDialog(JFrame parent) {
        super(parent, "Return Book", true);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Book ID:"));
        bookIdField = new JTextField();
        add(bookIdField);

        add(new JLabel("Member ID:"));
        memberIdField = new JTextField();
        add(memberIdField);

        JButton returnButton = new JButton("Return");
        returnButton.addActionListener(this::returnBook);
        add(returnButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> dispose());
        add(cancelButton);

        setSize(300, 150);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    private void returnBook(ActionEvent e) {
        int bookId = Integer.parseInt(bookIdField.getText());
        int memberId = Integer.parseInt(memberIdField.getText());

        if (IssueManager.returnBook(bookId, memberId)) {
            JOptionPane.showMessageDialog(this, "Book returned successfully!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to return book.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
