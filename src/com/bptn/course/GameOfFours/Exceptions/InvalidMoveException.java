package com.bptn.course.GameOfFours.Exceptions;

    public class InvalidMoveException extends ArrayIndexOutOfBoundsException {

        public InvalidMoveException(String errMessage) {
            super(errMessage);
        }
    }

