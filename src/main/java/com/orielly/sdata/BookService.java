package com.orielly.sdata;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

  private final BookRepository repo;

  public void save(Book book){
    repo.save(book);
  }
}
