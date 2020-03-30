package test;

import javax.persistence.*;
import javax.transaction.Transaction;
import javax.persistence.EntityTransaction;
import java.util.List;

public class Demo{

    public static void main(String args[]){
//        search data
//        Student s = searchData(106);
//        System.out.println(s);

      //  save data
        Student s = new Student();
        //id auto generated
        s.setName("johar");
        s.setMarks(500);
        saveData(s);

        //update data
        //updateData(1,"kj");

       // delete data
       // removeData(3);

//        List<Student> list = getAllData();
//        for(Student s: list){
//            System.out.println(s);
//        }


    }

    static EntityManagerFactory emf= Persistence.createEntityManagerFactory("sampleapp");

    static void saveData(Student s){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(s);

        tx.commit();
        em.close();
        emf.close();
    }

    static Student searchData(int id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Student s = em.find(Student.class,id);

        tx.commit();
        em.close();
        emf.close();

        return s;
    }

    static void updateData(int id,String name){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Student s = em.find(Student.class,id);
        s.setName(name);
        tx.commit();
        em.close();
        emf.close();
    }

    static void removeData(int id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Student s = em.find(Student.class,id);
        em.remove(s);
        tx.commit();
        em.close();
        emf.close();
    }

    static List<Student> getAllData(){

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();;

        Query q = em.createQuery("select p from Student p where p.id > 105");
        List<Student> list = q.getResultList();

        tx.commit();
        em.close();
        emf.close();

        return list;
    }




}


//package test;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Demo {
//    public static void main(String[] args) {
//
//
//    }
//    static EntityManagerFactory emf= Persistence.createEntityManagerFactory("sampleapp");
//
////    Student s=new Student();
//
//    static void saveData(Student s)
//    {
//        EntityManager em=emf.createEntityManager();
//        EntityTransaction tx=em.getTransaction();
//        tx.begin();
//
//        em.persist(s);
//
//        tx.commit();
//        em.close();
//        emf.close();
//    }
//
//    static Student searchData(int id)
//    {
//        EntityManager em=emf.createEntityManager();
//        EntityTransaction tx=em.getTransaction();
//        tx.begin();
//
//        Student s=em.find(Student.class,id);
//
//        tx.commit();
//        em.close();
//        emf.close();
//        return s;
//    }
//
//
//
//
//
//}
//
//
