public class LiteRouter {
    private int state;

    public LiteRouter(int seed) {
        this.state = seed;
    }

    public int sync(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 37) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        LiteRouter obj = new LiteRouter(37);
        System.out.println(obj.sync(37));
    }
}
