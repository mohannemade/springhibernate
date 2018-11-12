package model;

import org.hibernate.Session;

import java.util.List;

public class ProductDAO {
	private DBConfig dbc;
	private Session sess;
	public ProductDAO()
	{
		dbc=new DBConfig();
	}
	
	public void insertProduct(Product product)
	{	try 
		{
		sess=dbc.getSession();
		sess.beginTransaction();
		sess.save(product);
		sess.getTransaction().commit();
		
		}
		catch(Exception e)
		{
			sess.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	public List<Product> getProducts()
	{
		List<Product> l=null;
		try
		{
			sess=dbc.getSession();
			sess.beginTransaction();
			l=sess.createQuery("FROM Product",Product.class).getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}

}
