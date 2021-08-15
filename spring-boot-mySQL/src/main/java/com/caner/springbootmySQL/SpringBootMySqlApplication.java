package com.caner.springbootmySQL;

import com.caner.springbootmySQL.model.Product;
import com.caner.springbootmySQL.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMySqlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMySqlApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception{

		productRepository.save(new Product("Television", "Electronics"));
		productRepository.save(new Product("MacM1", "Electronics"));
		productRepository.save(new Product("GucciJean", "Fashion"));
		productRepository.save(new Product("Pencil", "stationary"));

	}

}
