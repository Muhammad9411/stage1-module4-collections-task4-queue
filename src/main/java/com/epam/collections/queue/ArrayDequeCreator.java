package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> result = new ArrayDeque<>();

        result.add(firstQueue.poll());
        result.add(firstQueue.poll());
        result.add(secondQueue.poll());
        result.add(secondQueue.poll());

        while (firstQueue.size() != 0) {
            if (!firstQueue.isEmpty()) {
                firstQueue.offer(result.pollLast());
            }
            result.add(firstQueue.poll());
            result.add(firstQueue.poll());

            if (!secondQueue.isEmpty()) {
                secondQueue.offer(result.pollLast());
            }
            result.add(secondQueue.poll());
            result.add(secondQueue.poll());
        }
        return result;
    }
}
