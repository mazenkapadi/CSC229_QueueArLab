package org.example;

public class Main {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.show();

        queue.dequeue();
        queue.dequeue();

        queue.show();

        queue.makeEmpty();

        queue.show();
    }
}
