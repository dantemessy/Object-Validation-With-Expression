package com.test.practice;


import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Validation {


    public static boolean validate(Object obj , String condition){
        ExpressionParser expressionParser = new SpelExpressionParser();
        return (boolean) expressionParser.parseExpression(condition).getValue(obj);
    };
}
