package com.booksystem.dao;
import com.booksystem.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

//指定bean注入的配置文件
@ContextConfiguration("/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class) //使用标准的junit
@Transactional //事务管理
@Rollback(true) //是否回滚
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;
    @Test
    public void getAllBooks(){
        Book[] allBooks = bookDao.getAllBooks();
        for (Book book : allBooks) {
            System.out.println("书:" +book);
        }

    }
}
