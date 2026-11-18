public class HybridBuffer {
    private int state;

    public HybridBuffer(int seed) {
        this.state = seed;
    }

    public int resolve(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 24) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        HybridBuffer obj = new HybridBuffer(24);
        System.out.println(obj.resolve(24));
    }
}
