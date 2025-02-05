package com.sangrahalay.gui;

import com.sangrahalay.managers.IssueManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class IssueBookDialog extends JDialog {
    private JTextField bookIdField, memberIdField;

    public IssueBookDialog(JFrame parent) {
        super(parent, "Issue Book", true);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Book ID:"));
        bookIdField = new JTextField();
        add(bookIdField);

        add(new JLabel("Member ID:"));
        memberIdField = new JTextField();
        add(memberIdField);

        JButton issueButton = new JButton("Issue");
        issueButton.addActionListener(this::issueBook);
        add(issueButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> dispose());
        add(cancelButton);

        setSize(300, 150);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    private void issueBook(ActionEvent e) {
        int bookId = Integer.parseInt(bookIdField.getText());
        int memberId = Integer.parseInt(memberIdField.getText());

        if (IssueManager.issueBook(bookId, memberId)) {
            JOptionPane.showMessageDialog(this, "Book issued successfully!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to issue book.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
