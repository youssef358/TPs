package TP2;

public class CustomStack {
    private Object[] customStack;
    private int top = -1;
    private int capacity = 10;

    public CustomStack(int capacity){
        this.capacity = capacity;
        customStack = new Object[this.capacity];
    }

    public void push(Object obj){
        if(this.top == this.capacity -1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            customStack[top] = obj;
        }
    }

    public Object pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            Object temp = customStack[top];
            top--;
            return temp;
        }
    }

    public Object tete(){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        else{
            return customStack[top];
        }
    }

    public int size(){
        return this.top + 1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

}
