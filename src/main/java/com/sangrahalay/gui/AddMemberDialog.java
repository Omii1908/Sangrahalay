package com.sangrahalay.gui;

import com.sangrahalay.managers.MemberManager;
import com.sangrahalay.models.Member;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AddMemberDialog extends JDialog {
    private JTextField nameField, emailField;

    public AddMemberDialog(JFrame parent) {
        super(parent, "Add Member", true);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(this::addMember);
        add(addButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> dispose());
        add(cancelButton);

        setSize(300, 150);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    private void addMember(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();

        if (name.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Member newMember = new Member(name, email);
        if (MemberManager.addMember(newMember)) {
            JOptionPane.showMessageDialog(this, "Member added successfully!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add member.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
