package com.heitech.bms.controller;

import com.heitech.bms.dao.BookDAO;
import com.heitech.bms.entity.Book;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BookController extends MultiActionController {

    private BookDAO bookDAO;

    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public ModelAndView add(HttpServletRequest request,
                            HttpServletResponse response, Book book) throws Exception {
        bookDAO.saveBook(book);
        return new ModelAndView("redirect:list.htm");
    }

    public ModelAndView list(HttpServletRequest request,
                             HttpServletResponse response) throws Exception {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("bookList", bookDAO.listBook());
        modelMap.addAttribute("book", new Book());
        return new ModelAndView("bookForm", modelMap);
    }
}
