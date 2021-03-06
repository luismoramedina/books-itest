package com.github.luismoramedina.booksitest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BooksItestApplicationTests {
	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	public void testGet() {
		ResponseEntity<Book> forEntity = testRestTemplate.getForEntity("/books/1", Book.class);
		assertEquals("Ubik", forEntity.getBody().getName());
	}

}
