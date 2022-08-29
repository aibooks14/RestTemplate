package com.example.demo.Blogging;





import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class StudentController {

	public static void main(String[] args) throws RestClientException {
		RestTemplate restTemplate = new RestTemplate() ;
		
		URI url = null ;
		try {
			url = new URI("https://reqres.in/api/users") ;
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		Student student = new Student("sagar", "Programmer", 98121, "Delhi");
		RequestEntity<Student> request = RequestEntity.post(url).accept(MediaType.APPLICATION_JSON).body(student);
		ResponseEntity<Student> response = new  RestTemplate().exchange(request, Student.class);
		System.out.println(response);

	}

}
//https://b1san-blog.com/post/spring/spring-rest-template/

