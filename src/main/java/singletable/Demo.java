package singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class Demo {


    public static void main(String[] args) {

        A a=new A();
        a.setId(101);
        a.setName("abc");

        B b=new B();
        b.setId(102);
        b.setName("def");
        b.setValueOne("b1");

        C c=new C();
        c.setId(103);
        c.setName("ghi");
        c.setValueTwo("c1");

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("sampleapp");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(a);
        em.persist(b);
        em.persist(c);

        tx.commit();
        em.close();
        emf.close();

    }


}
