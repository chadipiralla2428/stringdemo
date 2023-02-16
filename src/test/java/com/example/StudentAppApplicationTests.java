package com.example;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		classes=StudentAppApplication.class
		)
@AutoConfigureMockMvc
class StudentAppApplicationTests {
	@Autowired
	MockMvc mockMvc;
	@Test
	void contextLoads() throws Exception {
	MvcResult mock=	mockMvc.perform(
				MockMvcRequestBuilders.get("/student/fetch")
				.accept(MediaType.APPLICATION_JSON)).andReturn();
	System.out.println(mock);
	}

}
