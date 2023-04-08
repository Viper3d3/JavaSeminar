package Seminar4;

import java.util.LinkedList;
// Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.
public class LinkedMetods {
    private LinkedList<LinkedMetods> list = new LinkedList<>();

    public void enqueue(LinkedMetods item) {
        list.addLast(item);
    }

    public LinkedMetods dequeue() {
        return list.pollFirst();
    }

    public LinkedMetods first() {
        return list.getFirst();
    }
}
