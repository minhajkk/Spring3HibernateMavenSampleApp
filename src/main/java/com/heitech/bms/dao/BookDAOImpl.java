package com.heitech.bms.dao;

import com.heitech.bms.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;


public class BookDAOImpl implements BookDAO {

    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }


    public void saveBook(Book book) {
        hibernateTemplate.saveOrUpdate(book);
    }

    public List<Book> listBook() {
        return hibernateTemplate.find("from Book");
    }

}
