package com.Adityabhosale;

import jakarta.persistence.*;

public class SelectStudent {
    public static void main(String[] args) {
       EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPU");
       EntityManager manager = factory.createEntityManager();
//       Student student = em.find(Student.class, 102);
//       if(student != null){
//           System.out.println("Roll number:"+student.getRoll());
//           System.out.println("Name:"+student.getName());
//           System.out.println("Marks:"+student.getMarks());
//       }else
//           System.out.println("Student not found");
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        if (student != null) {
//
//            System.out.println("Student found");
//            em.remove(student);
//            tx.commit();
//            System.out.println("student deleted");
//
//        }else{
//            System.out.println("student not found");
//        }

        EntityTransaction tx = manager.getTransaction();
        tx.begin();

//        if (student != null) {
//
//            System.out.println("Student found");
//            student.setName("Adam");
//            student.setMarks(58);
//            em.merge(student);
//            tx.commit();
//            System.out.println("student updated");
//
//        }else{
//            System.out.println("student not found");
//        }


        Student s1 = new Student(101,"abcd",97);
        manager.persist(s1);
        tx.commit();
        System.out.println("Student inserted successfully");




       manager.close();
        factory.close();
    }
}
