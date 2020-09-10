package com.test.practice;


public class Example {

    private int start;
    private int end;

    private Nested nested;

    public Example(int start, int end, Nested nested) {
        this.start = start;
        this.end = end;
        this.nested = nested;
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

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }

    @Override
    public String toString() {
        return "Example{" +
                "start=" + start +
                ", end=" + end +
                ", nested=" + nested +
                '}';
    }
}
