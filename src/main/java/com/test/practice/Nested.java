package com.test.practice;

public class Nested {

    private int nestedStart;
    private int nestedEnd;

    public Nested(int nestedStart, int nestedEnd) {
        this.nestedStart = nestedStart;
        this.nestedEnd = nestedEnd;
    }

    public int getNestedStart() {
        return nestedStart;
    }

    public void setNestedStart(int nestedStart) {
        this.nestedStart = nestedStart;
    }

    public int getNestedEnd() {
        return nestedEnd;
    }

    public void setNestedEnd(int nestedEnd) {
        this.nestedEnd = nestedEnd;
    }

    @Override
    public String toString() {
        return "Nested{" +
                "nestedStart=" + nestedStart +
                ", nestedEnd=" + nestedEnd +
                '}';
    }
}
