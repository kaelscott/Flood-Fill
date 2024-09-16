public class Queue {
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    private int[] data = new int[10];

    public Queue(int capacity) {
//        data = new int[capacity];
        data = new int[10];
        head = 0;
        tail = 0;
        size = 0;
    }

}


