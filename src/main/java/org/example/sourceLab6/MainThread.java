package org.example.sourceLab6;

import java.util.ArrayList;

public class MainThread {
    public synchronized ArrayList<Integer> arraySum(ArrayList<Integer> vector1, ArrayList<Integer> vector2) throws InterruptedException {
        ArrayList<Integer> vector3 = new ArrayList<Integer>();
        for (int i = 0; i < vector1.size(); i++) {
            MyThread thread = new MyThread();
            thread.setInt(vector1.get(i), vector2.get(i));
            thread.start();
            thread.join();
            vector3.add(thread.getSum());
        }
        return vector3;
    }
}