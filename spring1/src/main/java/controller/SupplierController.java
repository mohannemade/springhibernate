package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Supplier;
import model.SupplierDAO;

@Controller
public class SupplierController {
	
	@RequestMapping(value="/supplier",method=RequestMethod.GET)
	public String suppliersuccess()
	{
		return "supplier";
	}
	
	@RequestMapping(value="/addsupplier",method=RequestMethod.POST)
	public String getsuccess(@Valid @ModelAttribute("supplier1") Supplier s,BindingResult result)
	{	
		SupplierDAO sd = new SupplierDAO();
		sd.insertSupplier(s);
		if(result.hasErrors())
			return "supplier";
		else
			return "success";
	}

}
