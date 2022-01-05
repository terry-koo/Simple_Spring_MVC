package com.koo.terry;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	public ModelAndView create() {
		return new ModelAndView("book/create");
	}

}
