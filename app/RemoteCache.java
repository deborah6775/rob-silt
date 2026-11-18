public class DynamicGateway {
    private int state;

    public DynamicGateway(int seed) {
        this.state = seed;
    }

    public int fetch(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 37) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        DynamicGateway obj = new DynamicGateway(37);
        System.out.println(obj.fetch(37));
    }
}
