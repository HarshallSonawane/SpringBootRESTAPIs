package com.api.book.bootrestbook.components;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.book.bootrestbook.entities.books;
import com.api.book.bootrestbook.services.*;

@RestController
public class bookController {

    @Autowired
    private bookServices bookServices;

    @GetMapping("/books")
    public List<books> getBooks() {
        // books obj = new books(01, "Think Java", "Harshal");
        return this.bookServices.getBooks();
    }

    @PostMapping("/books")
    public books addBook(@RequestBody books b) {

        books book = this.bookServices.addBook(b);
        System.out.println(book);
        return book;

    }

}
