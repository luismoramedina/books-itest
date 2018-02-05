package com.github.luismoramedina.booksitest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luismoramedina
 */
@RestController
@RequestMapping("books")
public class BookController {

  @Autowired
  private BookRepository bookRepository;

  @RequestMapping( method = RequestMethod.GET, value = "/{id}")
  public ResponseEntity<Book> book(@PathVariable(value="id") String id) {
    Book one = bookRepository.findOne(id);
    if (one != null) {
      return new ResponseEntity<>(one, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @RequestMapping( method = RequestMethod.GET)
  public ResponseEntity<Iterable<Book>> books() {
    Iterable<Book> all = bookRepository.findAll();
    return new ResponseEntity<>(all, HttpStatus.OK);
  }

}
