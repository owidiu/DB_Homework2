package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Student> studenti = new TreeSet();

        Map<Integer, TreeSet<Student>> gradeMap=new HashMap<>();

        Student s1 = new Student("Ciprian",3.33f);
        Student s2 = new Student("Ovidiu",2.6f);
        Student s3 = new Student("Dinu",9.8f);
        Student s4 = new Student("Radu",7.81f);
        Student s5 = new Student("Malin",6.81f);
        Student s6 = new Student("Gabi",7.11f);
        Student s7 = new Student("Ana",6.51f);
        Student s8 = new Student("Cosmin",10f);
        Student s9 = new Student("Mihai",3.49f);
        Student s10 = new Student("Matei",8.31f);
        Student s11 = new Student("Alex",9.99f);
        Student s12 = new Student("Catalina",7.11f);

        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        studenti.add(s4);
        studenti.add(s5);
        studenti.add(s6);
        studenti.add(s7);
        studenti.add(s8);
        studenti.add(s9);
        studenti.add(s10);
        studenti.add(s11);
        studenti.add(s12);

        int k;
        for(Student a :studenti){
            k=Math.round(a.getGrade());
            if(!gradeMap.containsKey(k)){
                gradeMap.put(k,new TreeSet<>());

            }
            gradeMap.get(k).add(a);
        }
        for(Map.Entry<Integer, TreeSet<Student>> m:gradeMap.entrySet()){
            System.out.println("-------------------------------------------");
            System.out.print(m.getKey()+"\t");
            for(Student a:m.getValue()){
                System.out.println("\t"+a);
            }
        }


    }
}
