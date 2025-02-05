package com.sangrahalay.models;

public class IssuedBook {
    private int bookId, memberId;

    public IssuedBook(int bookId, int memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
    }

    public int getBookId() { return bookId; }
    public int getMemberId() { return memberId; }
}
