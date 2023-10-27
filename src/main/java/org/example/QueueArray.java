package org.example;

public class QueueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;
    private int size;

    QueueArray() {
        arr = new int[100];
        capacity = 100;
        front = 0;
        rear = -1;
        count = 0;
        size = 0;
    }

    //deepcopy
    QueueArray(QueueArray other) {
        this.arr = new int[other.arr.length];
        this.capacity = other.capacity;
        this.front = other.front;
        this.rear = other.rear;
        this.count = other.count;
        this.size = other.size;
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            System.exit(1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(1);
        } else {
            System.out.println("Removing " + arr[front]);

            front = (front + 1) % capacity;
            count--;
        }
    }

    void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(1);
        } else {
            System.out.print("Elements in Queue: ");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    void makeEmpty() {
        front = 0;
        rear = -1;
        count = 0;
    }

    boolean isEmpty() {
        return (size() == 0);
    }

    boolean isFull() {
        return (size() == capacity);
    }

    int size() {
        return count;
    }

    void copy(QueueArray source) {
        this.arr = new int[source.arr.length];
        this.capacity = source.capacity;
        this.front = source.front;
        this.rear = source.rear;
        this.count = source.count;
        this.size = source.size;
    }
}

