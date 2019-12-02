package com.booksystem.dao;

import com.booksystem.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookDao {
    //查询全部图书
    public List<Book> getAllBooks();
}
