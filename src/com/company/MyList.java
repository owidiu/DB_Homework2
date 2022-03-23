package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Comparable> {
    ArrayList<T> list;

    public MyList(int size) {
        list = new ArrayList<T>(size);
    }

    public void add (T student){
        list.add(student);
    }

    public void print(){
        System.out.println("MyList{" +
                "list=" + list +
                '}');
    }

    public boolean lookup(T student){
        return list.contains(student);
    }

    public void orderByGrade(){
        Collections.sort(list);
    }
}
