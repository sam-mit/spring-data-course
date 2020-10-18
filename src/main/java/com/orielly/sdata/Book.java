package com.orielly.sdata;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "BOOK")
@Data
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "BOOK_ID")
  private Long bookId;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "PUBLISH_DATE")
  private Date publishDate;

  @Column(name = "PAGE_COUNT")
  private int pageCount;

  @Column(name = "PRICE")
  private BigDecimal price;

  public Book(String title, Date date, int pages, BigDecimal price) {
    this.setTitle(title);
    this.setPublishDate(date);
    this.setPageCount(pages);
    this.setPrice(price);
  }
}
