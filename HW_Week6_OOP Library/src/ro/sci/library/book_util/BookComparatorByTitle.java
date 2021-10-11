package ro.sci.library.book_util;

import ro.sci.library.books.Book;

import java.util.Comparator;

public class BookComparatorByTitle implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getTitle().compareToIgnoreCase(book2.getTitle()) == 0) {
            if (book1.getAuthor().compareToIgnoreCase(book2.getAuthor()) == 0) {
                return book1.getClass().getSimpleName().compareToIgnoreCase(book2.getClass().getSimpleName());
            } else {
                return book1.getAuthor().compareToIgnoreCase(book2.getAuthor());
            }
        } else {
            return book1.getTitle().compareToIgnoreCase(book2.getTitle());
        }

    }
}
