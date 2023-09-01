package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.repositories.PersonRepository;
import com.example.services.PersonService;



@SpringBootTest
@ExtendWith(MockitoExtension.class)

class PersonServiceTest {

	@Mock
	private PersonRepository prepository;
	
	
	private PersonService pservice;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetAllPersons() {
		//Person p=new Person();
		pservice.getAllPersons();
		verify(prepository).findAll();
	}

}
