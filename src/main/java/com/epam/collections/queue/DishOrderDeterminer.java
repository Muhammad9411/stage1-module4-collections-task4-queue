package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        List<Integer> result = new ArrayList<>();
        if (numberOfDishes == 0) {
            return result;
        }

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int m = 0;
        while (queue.size() > 2) {
            Iterator itr = queue.iterator();
            while (itr.hasNext()) {
                m++;
                Integer next_val = (Integer) itr.next();
                if (m % everyDishNumberToEat == 0) {
                    result.add(next_val);
                }
            }

            for (Integer a : result) {
                queue.remove(a);
            }
            m = m % everyDishNumberToEat;
            continue;
        }

        if ((everyDishNumberToEat - m) % 2 == 0) {
            result.add(queue.pollLast());
            result.add(queue.pollFirst());
        } else {
            result.add(queue.pollFirst());
            result.add(queue.pollLast());
        }
        return result;
    }
}
