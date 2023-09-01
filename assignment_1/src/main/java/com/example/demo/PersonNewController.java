package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class PersonNewController
{
	@GetMapping("person")
	public String before()
	{
 		return "personNew";
	}
	
	/*
	 * @PostMapping("book") public String afterSubmit(HttpServletRequest request) {
	 * // old way to read request parameter
	 * 
	 * Book book=new Book(); book.setBookName(request.getParameter("bookname"));
	 * book.setPrice(Long.parseLong(request.getParameter("price")));
	 * request.setAttribute("mb",book); return "success"; }
	 */
	
	@PostMapping("person")
	public String afterSubmit(@RequestParam("name") String name,@RequestParam("age") int age,@RequestParam("address") String address ,Model model) 
	{
		// new way to read request parameter
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setAddress(address);
		model.addAttribute("person", person);
		return "success";
	}
}
