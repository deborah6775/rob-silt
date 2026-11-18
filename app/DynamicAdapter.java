public class SharedDispatcher {
    private int state;

    public SharedDispatcher(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 83) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        SharedDispatcher obj = new SharedDispatcher(83);
        System.out.println(obj.collect(83));
    }
}
