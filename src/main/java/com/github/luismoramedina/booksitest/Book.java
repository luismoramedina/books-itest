package com.github.luismoramedina.booksitest;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author luismoramedina
 */
@Data
@Entity
@Table(name="books")
public class Book {
  @Id
  private String id;
  private String name;
  private String author;
}
