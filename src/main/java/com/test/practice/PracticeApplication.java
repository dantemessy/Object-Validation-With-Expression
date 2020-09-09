package com.test.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParserContext;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

//@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {


//		SpringApplication.run(PracticeApplication.class, args);

		Example example = new Example(22 ,2, "55 > 5");
		Example example2 = new Example();

		System.out.println(example.toString());
		System.out.println(example2.toString());
		StandardEvaluationContext context = new StandardEvaluationContext(example);


		ExpressionParser expressionParser = new SpelExpressionParser();

		Expression expression = expressionParser.parseExpression("start < end ? start : end");

		System.out.println(expression.getValue(example));
//		System.out.println(expressionParser.parseExpression( , example).getValue());


	}

}
