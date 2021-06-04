package org.example.sourceLab6;

public class MyThread extends Thread {

    public int number1;
    public int number2;
    public int sum;

    public void setInt(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        sum = number1 + number2;
    }
}