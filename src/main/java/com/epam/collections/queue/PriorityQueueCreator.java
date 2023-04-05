package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        if (!firstList.isEmpty()) {
            queue.addAll(firstList);
        }

        if (!secondList.isEmpty()) {
            queue.addAll(secondList);
        }

        return queue;
    }
}
