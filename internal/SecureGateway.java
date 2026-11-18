public class SmartResolver {
    private int state;

    public SmartResolver(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 78) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        SmartResolver obj = new SmartResolver(78);
        System.out.println(obj.decode(78));
    }
}
