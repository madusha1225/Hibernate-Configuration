package lk.Ijse;

import lk.Ijse.config.FactoryConfiguration;
import lk.Ijse.embed.FullName;
import lk.Ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        Student student = new Student();
        student.setId(1);
        student.setName(new FullName("madusha","lakmina"));
        student.setAddress("colombo");
        session.save(student);
//        open transaction
        Transaction transaction = session.beginTransaction();
        Object saved = session.save(student);
        transaction.commit();
        session.close();
        System.out.println(saved);
    }
}