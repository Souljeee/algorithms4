public class MyStack {
    private MyLinkedList list;
    public MyStack(){
        list = new MyLinkedList();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void push(int k){
        list.insert(k);
    }
    public void pop(){
        list.deleteFirst();
    }
    public void display(){
        list.display();
    }
}
