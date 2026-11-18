public class BatchManager {
    private int state;

    public BatchManager(int seed) {
        this.state = seed;
    }

    public int run(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 53) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        BatchManager obj = new BatchManager(53);
        System.out.println(obj.run(53));
    }
}
