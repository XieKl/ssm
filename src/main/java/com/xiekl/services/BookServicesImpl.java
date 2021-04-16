package com.xiekl.services;

import com.xiekl.dao.BookMapper;
import com.xiekl.pojo.Book;

import java.util.List;

public class BookServicesImpl implements BookServices {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> findAllBooks() {
        List<Book> bookList = bookMapper.findAllBooks();
        return bookList;
    }

    @Override
    public Book findBookByID(int id) {

        return  bookMapper.findBookByID(id);
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookByID(int id) {
        return bookMapper.deleteBookByID(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }
}
