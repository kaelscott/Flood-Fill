public class Queue {
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    private int[] data = new int[10];

    public Queue(int capacity) {
        //data = new int[capacity];
        data = new int[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalArgumentException("A Fila está cheia");
        }
        data[tail] = value; //add elemento na posicao do tail
        tail++;
        size++;

    }

    public void dequeue(){
        if (isEmpty()){
            throw new IllegalArgumentException("A fila esta vazia");
        }
        int removedValue = data[head];
        data[head] = 0;
        head++;
        size--;
    }

    private boolean isFull(){
        return size == data.length;
    }
    private boolean isEmpty(){
        return size == 0;
    }
}


