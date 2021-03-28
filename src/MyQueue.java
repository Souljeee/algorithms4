public class MyQueue {
    private MyLinkedList queue;
    public MyQueue(){
        queue = new MyLinkedList();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void insert(int k){
        queue.insert(k);
    }
    public void delete(){
        queue.deleteFirst();
    }
    public void display(){
        queue.display();
    }
}
