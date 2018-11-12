package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Product;
import model.ProductDAO;
import model.Supplier;

@Controller
public class ProductController {

	@RequestMapping(value="/addProduct",method=RequestMethod.GET)
	public String productsPage() {
		return "product";
	}
	
	@RequestMapping(value="/success", method=RequestMethod.POST)
	public String productSuccess(@ModelAttribute("product1") Product p,@ModelAttribute("supplier1") Supplier s)
	{
		ProductDAO pd = new ProductDAO();
		p.setSupplier(s);
		pd.insertProduct(p);
		return "success";
	}
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	@ResponseBody   //tells that the list or data is to be stored in json format
	public List<Product> getInfo()
	{
		List<Product> lp=null;
		ProductDAO pd=new ProductDAO();
		try
		{
			lp = (List<Product>)pd.getProducts();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lp;
	}
	
	@RequestMapping(value="/listProd",method=RequestMethod.GET)
	public String listProducts()
	{
		return "listProduct";
	}
	
}

