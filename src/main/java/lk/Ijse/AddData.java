package lk.Ijse;

import lk.Ijse.config.FactoryConfiguration;
import lk.Ijse.embed.FullName;
import lk.Ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddData {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        Student student = new Student(1,new FullName("Madusha","Pullaperuma"),"Horana");


//        open transaction
        Transaction transaction = session.beginTransaction();

        session.save(student);
       // session.update(student);
        transaction.commit();
        session.close();
    }
}