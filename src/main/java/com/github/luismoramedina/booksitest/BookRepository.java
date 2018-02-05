package com.github.luismoramedina.booksitest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author luismoramedina
 */
@Repository
public interface BookRepository extends CrudRepository<Book, String> {}
