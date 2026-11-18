public class AsyncParser {
    private int state;

    public AsyncParser(int seed) {
        this.state = seed;
    }

    public int run(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 82) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        AsyncParser obj = new AsyncParser(82);
        System.out.println(obj.run(82));
    }
}
