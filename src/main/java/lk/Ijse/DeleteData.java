package lk.Ijse;

import lk.Ijse.config.FactoryConfiguration;
import lk.Ijse.embed.FullName;
import lk.Ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteData {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        Student student = new Student(1,new FullName("madusha","lakmina"),"colombo");

        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
        session.close();
    }
}