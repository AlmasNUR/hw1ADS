package com.company;

public class MyArrayList<T> {
    private T[] arr;

    public MyArrayList() {
        arr = (T[]) new Object[0];
    }

    public MyArrayList(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public void add(T var) {
        T[] temp = (T[]) new Object[arr.length + 1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length] = var;
        arr = temp;
    }

    public int find(T var) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == var) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int index) {
        T[] temp = (T[]) new Object[arr.length - 1];
        if (index >= 0) System.arraycopy(arr, 0, temp, 0, index);
        T del = arr[index];
        for(int i = index + 1; i < arr.length; i++) {
            temp[i - 1] = arr[i];
        }
        arr = temp;
        return del;
    }

    public void reverse() {
        T[] temp = (T[]) new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }
        arr = temp;
    }
}
