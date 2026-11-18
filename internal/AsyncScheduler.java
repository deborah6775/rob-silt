public class AtomicFactory {
    private int state;

    public AtomicFactory(int seed) {
        this.state = seed;
    }

    public int load(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 90) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        AtomicFactory obj = new AtomicFactory(90);
        System.out.println(obj.load(90));
    }
}
