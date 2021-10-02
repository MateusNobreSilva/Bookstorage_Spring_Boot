package com.mateusnobre.bookstoragemanager.repository;

import com.mateusnobre.bookstoragemanager.enity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
