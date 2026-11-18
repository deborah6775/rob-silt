public class SimpleService {
    private int state;

    public SimpleService(int seed) {
        this.state = seed;
    }

    public int encode(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 36) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SimpleService obj = new SimpleService(36);
        System.out.println(obj.encode(36));
    }
}
