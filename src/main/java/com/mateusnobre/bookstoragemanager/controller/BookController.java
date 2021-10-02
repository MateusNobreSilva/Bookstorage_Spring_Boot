package com.mateusnobre.bookstoragemanager.controller;


import com.mateusnobre.bookstoragemanager.dto.MessageResponseDTO;
import com.mateusnobre.bookstoragemanager.enity.Book;
import com.mateusnobre.bookstoragemanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //Cadastrod e Livros
    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
      Book savedBook =   bookRepository.save(book);
      return MessageResponseDTO.builder()
              .message("Book Created with ID: " + savedBook.getId())
              .build();
    }
}