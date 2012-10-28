package com.hascode.entity;

import static com.hascode.matcher.BookMatcher.hasId;
import static com.hascode.matcher.BookMatcher.hasIsbn;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class BookTest {
	@Test
	public void testBookIsbn() {
		Book book = new Book(1l, "5555", "A book");
		assertThat(book, hasIsbn("1234"));
	}

	@Test
	public void testBookId() {
		Book book = new Book(23l, "5555", "A book");
		assertThat(book, hasId(3l));
	}
}
