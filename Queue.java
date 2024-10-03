public class Queue {
    int head = 0;
    private int tail = 0;
    int size = 0;
    int[] data = new int[10];

    public Queue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero");
        }
        this.data = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalArgumentException("A Fila está cheia");
        }
        data[tail] = value;
        tail = (tail + 1) % data.length;
        size++;

    }

    public int dequeue(){
        if (isEmpty()){
            throw new IllegalArgumentException("A fila esta vazia");
        }
        int removedValue = data[head];
        head = (head + 1) % data.length;
        size--;
        return removedValue;
    }

    boolean isFull(){
        return size == data.length;
    }
    boolean isEmpty(){
        return size == 0;
    }




}


