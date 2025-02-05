package com.sangrahalay.managers;

import com.sangrahalay.models.IssuedBook;
import java.util.ArrayList;
import java.util.List;

public class IssueManager {
    private static final List<IssuedBook> issuedBooks = new ArrayList<>();

    public static boolean issueBook(int bookId, int memberId) {
        return issuedBooks.add(new IssuedBook(bookId, memberId));
    }

    public static boolean returnBook(int bookId, int memberId) {
        return issuedBooks.removeIf(ib -> ib.getBookId() == bookId && ib.getMemberId() == memberId);
    }
}
