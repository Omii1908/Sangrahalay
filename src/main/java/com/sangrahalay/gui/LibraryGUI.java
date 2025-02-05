package com.sangrahalay.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LibraryGUI extends JFrame {
    public LibraryGUI() {
        setTitle("Sangrahalay - Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 20, 20));

        JButton addBookBtn = new JButton("Add Book");
        addBookBtn.addActionListener(this::openAddBook);
        add(addBookBtn);

        JButton addMemberBtn = new JButton("Add Member");
        addMemberBtn.addActionListener(this::openAddMember);
        add(addMemberBtn);

        JButton issueBookBtn = new JButton("Issue Book");
        issueBookBtn.addActionListener(this::openIssueBook);
        add(issueBookBtn);

        JButton returnBookBtn = new JButton("Return Book");
        returnBookBtn.addActionListener(this::openReturnBook);
        add(returnBookBtn);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void openAddBook(ActionEvent e) { new AddBookDialog(this); }
    private void openAddMember(ActionEvent e) { new AddMemberDialog(this); }
    private void openIssueBook(ActionEvent e) { new IssueBookDialog(this); }
    private void openReturnBook(ActionEvent e) { new ReturnBookDialog(this); }
}
