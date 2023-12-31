package TP1;

public class CustomArrayList{
    private int capacity = 10;
    private Object[] ArrayList;
    private int size = 0;


    public CustomArrayList(int s){
        this.capacity = s;
        ArrayList = new Object[this.capacity];
    }

    public void add(Object obj) {
        if(this.size == this.capacity -1){
            System.out.println("Capacity is full");
        }
        else{
            size++;
            ArrayList[size] = obj;
        }
    }

    public Object get(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return this.ArrayList[i];
    }

    public int size() {
        return size;
    }
    public int find(Object obj){
        for(int i = 0; i < this.size; i++){
            if(this.ArrayList[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    public void remove(Object obj) {
        int index = find(obj);
        if (index == -1) {
            System.out.println("Object not found");
        } else {
            for (int i = index; i < this.size; i++) {
                this.ArrayList[i] = this.ArrayList[i + 1];
            }
            this.size--;
        }
    }
}
