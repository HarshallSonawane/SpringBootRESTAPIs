package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.api.book.bootrestbook.entities.books;

@Service
public class bookServices {

    private static List<books> list = new ArrayList<>();

    static {

        list.add(new books(02, "OOPS Concepts", "Amey Dhuri"));
        list.add(new books(03, "DBMS Concepts", "Himanshu Bhatia"));
        list.add(new books(02, "CN Concepts", "Harshal Sonawane"));

    }

    public List<books> getBooks() {
        return list;
    }

    public books addBook(books obj){

        books obj1 = obj;
        list.add(obj);
        return obj1;
    }
}
