package com.heitech.bms.dao;

import com.heitech.bms.entity.Book;

import java.util.List;

public interface BookDAO {

    public void saveBook(Book book);

    public List<Book> listBook();
}
