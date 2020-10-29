package com.orielly.sdata;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    try(AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(DataConfiguration.class)){
      BookService service = context.getBean(BookService.class);
      Book book = new Book("First Book", new Date(), 33, new BigDecimal("26.00"));
      service.save(book);

      BookRepository repository = context.getBean(BookRepository.class);

      Optional<Book> book1 = repository.findById(1L);

      Optional<Book> book2 = repository.findById(2L);
      System.out.println("***********************************\n");
      book1.ifPresent(System.out::println);
      System.out.println("***********************************\n");
      book2.ifPresent(System.out::println);
      System.out.println("***********************************\n");
    }
  }

}
