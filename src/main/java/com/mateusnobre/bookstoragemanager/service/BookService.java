package com.mateusnobre.bookstoragemanager.service;

import com.mateusnobre.bookstoragemanager.dto.MessageResponseDTO;
import com.mateusnobre.bookstoragemanager.enity.Book;
import com.mateusnobre.bookstoragemanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){
        Book savedBook =  bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book Created with ID: " + savedBook.getId())
                .build();
    }
}
