package com.hascode.matcher;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import com.hascode.entity.Book;

public class BookMatcher {
	public static Matcher<Book> hasIsbn(final String isbn) {
		return new TypeSafeMatcher<Book>() {

			@Override
			public void describeTo(final Description description) {
				description.appendText("expected result from getIsbn(): ")
						.appendValue(isbn);
			}

			@Override
			public boolean matchesSafely(final Book book) {
				return isbn.equals(book.getIsbn());
			}

			@Override
			public void describeMismatchSafely(final Book book,
					final Description mismatchDescription) {
				mismatchDescription.appendText(" but was ").appendValue(
						book.getIsbn());
			}

		};
	}

	public static Matcher<Book> hasId(final Long id) {
		return new TypeSafeMatcher<Book>() {

			@Override
			public void describeTo(final Description description) {
				description.appendText("expected result from getId(): ")
						.appendValue(id);
			}

			@Override
			protected boolean matchesSafely(final Book book) {
				return id == book.getId();
			}
		};
	}
}
