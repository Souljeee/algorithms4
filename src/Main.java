import java.util.*;

public class Main {
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;

        //задание 1
        System.out.println("Задание 1");
        Stack<Cat> stack = new Stack<>();
        stack.push(new Cat("Барсик",5));
        stack.push(new Cat("Пушок",2));

        startTime = System.nanoTime();
        stack.push(new Cat("Рыжик",4));
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода Push: "+(endTime-startTime));

        startTime = System.nanoTime();
        Cat cat = stack.peek();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода Peek: "+(endTime-startTime));

        startTime = System.nanoTime();
        stack.pop();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода Pop: "+(endTime-startTime));
        System.out.println();



        //задание 2
        System.out.println("Задание 2");
        Queue<Cat> queue = new LinkedList<>();
        queue.add(new Cat("Барсик",5));
        queue.add(new Cat("Пушок",2));

        startTime = System.nanoTime();
        queue.add(new Cat("Рыжик",4));
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода add: "+(endTime-startTime));

        startTime = System.nanoTime();
        Cat cat2 = queue.element();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода element: "+(endTime-startTime));

        startTime = System.nanoTime();
        queue.remove();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода remove: "+(endTime-startTime));
        System.out.println();





        //задание 3
        System.out.println("Задание 3");
        Deque<Cat> deque = new LinkedList<>();

        startTime = System.nanoTime();
        deque.addFirst(new Cat("Барсик",5));
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода addFirst: "+(endTime-startTime));

        startTime = System.nanoTime();
        deque.addLast(new Cat("Пушок",2));
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода addLast: "+(endTime-startTime));

        startTime = System.nanoTime();
        deque.add(new Cat("Рыжик",4));
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода add: "+(endTime-startTime));

        startTime = System.nanoTime();
        Cat cat3 = deque.element();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода element: "+(endTime-startTime));


        startTime = System.nanoTime();
        deque.remove();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода remove: "+(endTime-startTime));
        System.out.println();



        //задание 3
        System.out.println("Задание 3");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(15);
        priorityQueue.add(36);
        priorityQueue.add(12);
        priorityQueue.add(3);

        startTime = System.nanoTime();
        priorityQueue.add(432);
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода add: "+(endTime-startTime));

        startTime = System.nanoTime();
        int x = priorityQueue.peek();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода peek: "+(endTime-startTime));

        startTime = System.nanoTime();
        priorityQueue.remove(36);
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода remove: "+(endTime-startTime));
        System.out.println();



        //задание 5
        System.out.println("Задание 5");
        System.out.println("Стек");
        MyStack myStack = new MyStack();

        startTime = System.nanoTime();
        myStack.push(50);
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода push: "+(endTime-startTime));

        startTime = System.nanoTime();
        myStack.pop();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода pop: "+(endTime-startTime));

        startTime = System.nanoTime();
        boolean p = myStack.isEmpty();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода isEmpty: "+(endTime-startTime));
        System.out.println();

        System.out.println("Очередь");
        MyQueue myQueue = new MyQueue();

        startTime = System.nanoTime();
        myQueue.insert(50);
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода insert: "+(endTime-startTime));

        startTime = System.nanoTime();
        myQueue.delete();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода delete: "+(endTime-startTime));

        startTime = System.nanoTime();
        myQueue.isEmpty();
        endTime = System.nanoTime();
        System.out.println("Время выполнения метода isEmpty: "+(endTime-startTime));
        System.out.println();
    }
}
