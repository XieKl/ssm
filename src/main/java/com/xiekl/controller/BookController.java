package com.xiekl.controller;

import com.xiekl.pojo.Book;
import com.xiekl.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {


    @Autowired
    @Qualifier("BookServicesImpl")
    private BookServices bookServices;

//    public void setBookServices(BookServices bookServices) {
//        this.bookServices = bookServices;
//    }

    @RequestMapping("/books")
    public String findAllBooks(Model model){
        List<Book> bookList = bookServices.findAllBooks();
        model.addAttribute("books",bookList);
        return "books";
    }
}
