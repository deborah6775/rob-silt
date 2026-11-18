public class SecureManager {
    private int state;

    public SecureManager(int seed) {
        this.state = seed;
    }

    public int sync(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 91) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SecureManager obj = new SecureManager(91);
        System.out.println(obj.sync(91));
    }
}
