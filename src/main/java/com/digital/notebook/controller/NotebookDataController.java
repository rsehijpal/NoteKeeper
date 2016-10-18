package com.digital.notebook.controller;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.notebook.model.Note;
import com.google.gson.Gson;

@RestController
@RequestMapping("/api")
public class NotebookDataController {
	
	
	
	@RequestMapping(value = "/note", method = RequestMethod.POST)
	@ResponseBody
	public String addNote(@RequestBody String msg){
		return "Success"+msg;

	}
	
	@RequestMapping(value = "/note", method = RequestMethod.GET)
	@ResponseBody
	
	public String getNotes(){
		
		Gson gson = new Gson();
		ArrayList<Note> notes = new ArrayList<>();
		
		notes.add(new Note("Hello,"));
		notes.add(new Note("Hello, note"));
		notes.add(new Note("Hello, 4) create a xml file named springrest-servlet.xml in /WEB-INF/ folder."
				+ "Please change context:component-scan if you want to use different "
				+ "package for spring to search for controller.Please refer to spring mvc hello world examplefor more understanding."
));
		notes.add(new Note("This is first note"));
		return gson.toJson(notes);
		

	}


}
