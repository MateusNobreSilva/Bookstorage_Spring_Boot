package com.mateusnobre.bookstoragemanager.controller;


import com.mateusnobre.bookstoragemanager.dto.MessageResponseDTO;
import com.mateusnobre.bookstoragemanager.enity.Book;
import com.mateusnobre.bookstoragemanager.repository.BookRepository;
import com.mateusnobre.bookstoragemanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

@Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //Cadastro de Livros
    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        return bookService.create(book);
    }
}
