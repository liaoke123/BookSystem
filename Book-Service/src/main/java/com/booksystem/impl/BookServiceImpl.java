package com.booksystem.impl;

import com.booksystem.dao.BookDao;
import com.booksystem.entity.Book;
import com.booksystem.impl.com.booksystem.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
   private BookDao bookDao;
    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> getAllBook() {
        return bookDao.getAllBooks();
    }


}
