public class Queue {
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    private int[] data = new int[10];

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
        data[tail] = value; //add elemento na posicao do tail
        tail = (tail + 1) % data.length;  // Circular
        size++;

    }

    public int dequeue(){
        if (isEmpty()){
            throw new IllegalArgumentException("A fila esta vazia");
        }
        int removedValue = data[head];
        head = (head + 1) % data.length; // movimenta o head de forma circular
        size--;
        return removedValue;
    }

    boolean isFull(){
        return size == data.length;
    }
    boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            int index = (head + i) % data.length;
            sb.append(data[index]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}


