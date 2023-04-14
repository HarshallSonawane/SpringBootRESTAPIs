package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.api.book.bootrestbook.entities.books;

@Service
public class bookServices {

    private static List<books> list = new ArrayList<>();

    // DB_ITEMS
    static {

        list.add(new books(02, "OOPS Concepts", "Amey Dhuri"));
        list.add(new books(03, "DBMS Concepts", "Himanshu Bhatia"));
        list.add(new books(02, "CN Concepts", "Harshal Sonawane"));

    }

    // CREATE
    public books addBook(books obj) {

        books obj1 = obj;
        list.add(obj);
        return obj1;
    }

    // READ
    public List<books> getBooks() {
        return list;
    }

    // UPDATE
    public books updateBook(books book, int bId) {

        list = list.stream().map(b -> {
            if (b.getId() == bId) {
                b.setAuthor(b.getAuthor());
                b.setTitle(b.getTitle());
            }
            return b;
        }).collect(Collectors.toList());

        // for (books bk : list) {
        // if (bk.getId() == bId) {
        // bk.setAuthor(bk.getAuthor());
        // bk.setTitle(bk.getTitle());
        // }
        // }
        return book;
    }

    // DELETE
    public void deleteBook(int bId) {

        list = list.stream().filter(books -> books.getId() != bId).collect(Collectors.toList());
        System.out.println("RECORD WITH ID " + bId + " DELETED");
    }

}
