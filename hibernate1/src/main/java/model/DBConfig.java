package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConfig {
	private Configuration cfg;
	private SessionFactory sf;
	private Session session;
	
	public DBConfig()
	{
		cfg =new Configuration();
		sf=cfg.configure("Hibernate.cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
			
	}
	
	public Session getSession()
	{
		session=sf.getCurrentSession();
		return session;
	}
}
