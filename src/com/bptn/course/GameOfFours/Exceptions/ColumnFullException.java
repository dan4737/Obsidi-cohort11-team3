package com.bptn.course.GameOfFours.Exceptions;

public class ColumnFullException extends ArrayIndexOutOfBoundsException {

    public ColumnFullException(String errMessage) {
        super(errMessage);
    }
}
