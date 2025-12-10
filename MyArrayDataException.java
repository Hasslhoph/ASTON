package com.homework;

public class MyArrayDataException extends Exception {
    private final int row;
    private final int col;

    public MyArrayDataException(String message, int row, int col) {
        super(message + " в ячейке [" + row + "][" + col + "]");
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
