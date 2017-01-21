/**
 * 
 */
/**
 * @author Ravi
 *
 */
package controllerimpl;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
@Entity
@Table(name="form")
public class implementation{
	public void save(String name, String rollnumber){
		System.out.println("am in implementation class");
		Configuration configuration=new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory ss=configuration.buildSessionFactory();
		Session session = ss.openSession();
		
		Transaction t= session.beginTransaction();
		SQLQuery query=session.createSQLQuery("insert into form(name,rollnumber) values(?,?)");
		t.commit();
	}
	
}