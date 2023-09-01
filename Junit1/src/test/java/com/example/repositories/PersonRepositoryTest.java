package com.example.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.Person;
import com.example.repositories.PersonRepository;

class PersonRepositoryTest {
	@Autowired
	private PersonRepository repository;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	void testIsPersonExistsById() {
		Person p=new Person();
	//	p.setId(100);
		p.setName("Abc");
		p.setCity("Mumbai");
		repository.save(p);
		
		boolean result=repository.isPersonExistsById(p.getId());
		assertThat(result).isTrue();
	}

}
