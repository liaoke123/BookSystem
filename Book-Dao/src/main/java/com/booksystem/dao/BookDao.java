package com.booksystem.dao;

import com.booksystem.entity.Book;

public interface BookDao {
    //查询全部图书
    public Book[] getAllBooks();
}
