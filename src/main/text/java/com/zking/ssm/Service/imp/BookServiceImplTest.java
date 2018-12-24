package com.zking.ssm.Service.imp;


import com.zking.ssm.Service.IBookService;
import com.zking.ssm.model.Book;
import com.zking.ssm.util.PageBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BookServiceImplTest extends BaseTestCat{
    @Autowired
    private IBookService bookService;

    @Override
    public void sub() {
        super.sub();
    }

    @Test
    public void insert() {
        book.setBookname("wertyuio");
        book.setBooktype("tyuiop");
        book.setPrice(10000f);
        bookService.insert(book);
    }

    @Test
    public void queryBookPager() {
        PageBean pageBean=new PageBean();
        pageBean.setPage(2);

        List<Book> books = bookService.queryBookPager(book, pageBean);

        for (Book book1 : books) {
            System.out.println(book1);
        }
    }

    @Test
    public void sel() {
        Book books = bookService.selectByPrimaryKey(520);
        System.out.println(books);
        System.out.println("------------------");
        Book books2= bookService.selectByPrimaryKey(520);
        System.out.println(books2);
    }
}