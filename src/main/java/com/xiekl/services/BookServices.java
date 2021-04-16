package com.xiekl.services;

import com.xiekl.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookServices {
    List<Book> findAllBooks();
    Book findBookByID(@Param("bookID") int id);
    int addBook(Book book);
    int deleteBookByID(@Param("bookID") int id);
    int updateBook(Book book);

}
