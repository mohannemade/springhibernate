package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value="/", method=RequestMethod.GET)
	public String getHome()
	{
		return "Home";
	}

    @RequestMapping(value="/error", method=RequestMethod.GET)
	public String error()
	{
		return "error";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout()
	{
		return "logout";
	}
}
