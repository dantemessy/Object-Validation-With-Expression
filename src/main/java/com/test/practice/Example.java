package com.test.practice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Example {

    private int start;
    private int end;
    private String condition;

    @Value("${condition}")
    private boolean result;

    @Value("#{250 > 200 && 200 < 4000}") // true
    private boolean test;

    public Example(int start, int end, String condition) {
        this.start = start;
        this.end = end;
        this.condition= condition;

    }

    public Example() {
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Example{" +
                "start=" + start +
                ", end=" + end +
                ", condition='" + condition + '\'' +
                ", result=" + result +
                ", test=" + test +
                '}';
    }
}
