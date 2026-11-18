public class BatchWorker {
    private int state;

    public BatchWorker(int seed) {
        this.state = seed;
    }

    public int sync(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 95) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        BatchWorker obj = new BatchWorker(95);
        System.out.println(obj.sync(95));
    }
}
