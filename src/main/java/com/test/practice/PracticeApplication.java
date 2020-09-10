package com.test.practice;


//@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {


//		SpringApplication.run(PracticeApplication.class, args);
		Nested nested = new Nested(10 , 100);
		Example example = new Example(22 ,22, nested);

		System.out.println(example.toString());

		System.out.println(Validation.validate(example, "start == end"));


	}

}
