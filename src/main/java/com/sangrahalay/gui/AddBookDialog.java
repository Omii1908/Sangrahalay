package com.sangrahalay.gui;

import com.sangrahalay.managers.BookManager;
import com.sangrahalay.models.Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AddBookDialog extends JDialog {
    private JTextField titleField, authorField, isbnField;

    public AddBookDialog(JFrame parent) {
        super(parent, "Add Book", true);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Title:"));
        titleField = new JTextField();
        add(titleField);

        add(new JLabel("Author:"));
        authorField = new JTextField();
        add(authorField);

        add(new JLabel("ISBN:"));
        isbnField = new JTextField();
        add(isbnField);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(this::addBook);
        add(addButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> dispose());
        add(cancelButton);

        setSize(300, 200);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    private void addBook(ActionEvent e) {
        String title = titleField.getText();
        String author = authorField.getText();
        String isbn = isbnField.getText();

        if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Book newBook = new Book(title, author, isbn);
        if (BookManager.addBook(newBook)) {
            JOptionPane.showMessageDialog(this, "Book added successfully!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add book.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
