package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.add(123);
        ll.add(321);
        ll.add(23);
        ll.add(4);
        ll.reverse();
        System.out.println(ll.remove(2));
        System.out.println(ll.find(123));
        ll.print();
        MyArrayList<Integer> al = new MyArrayList<>();
        al.add(123);
        al.add(321);
        al.add(23);
        al.add(4);
        al.reverse();
        System.out.println(al.remove(2));
        System.out.println(al.find(123));
        for(Object x : (Object[])al.getArr()) {
            System.out.println(x);
        }
    }
}
