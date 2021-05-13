package com.company;

public class MyLinkedList<T> {
    private MyNode<T> head;

    public MyLinkedList() {
        head = null;
    }

    public void add(T val) {
        if (head == null) {
            head = new MyNode<>(val, null);
        } else {
            MyNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new MyNode<T>(val, null);
        }
    }

    public int find(T val) {
        if (head == null) {
            return -1;
        }
        int index = 0;
        MyNode<T> node = head;
        while (node != null) {
            if (node.val == val) {
                return index;
            }
            node = node.next;
            index += 1;
        }
        return -1;
    }

    public T remove(int index) {
        if (head == null) {
            return null;
        }
        MyNode<T> node = head;
        while (node != null) {
            if (index == 1) {
                MyNode<T> next = node.next.next;
                MyNode<T> temp = node.next;
                node.next = next;
                return temp.val;
            }
            node = node.next;
            index -= 1;
        }
        return null;
    }

    private T pop() {
        if (head == null) {
            return null;
        }
        MyNode<T> node = head;
        if(node.next == null) {
            MyNode<T> temp = node;
            head = null;
            return temp.val;
        }
        while (node.next.next != null) {
            node = node.next;
        }
        MyNode<T> temp = node.next;
        node.next = null;
        return temp.val;
    }

    public void reverse() {
        MyLinkedList<T> temp = new MyLinkedList<>();
        T val;
        while ((val = this.pop()) != null) {
            temp.add(val);
            System.out.println(val);
        }
        this.head = temp.head;
    }

    public void print() {
        if (head == null) {
            System.out.println("Nothing here");
            return;
        }
        MyNode<T> node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.print("\n");
    }
}