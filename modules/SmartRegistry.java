public class SecureHandler {
    private int state;

    public SecureHandler(int seed) {
        this.state = seed;
    }

    public int encode(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 65) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        SecureHandler obj = new SecureHandler(65);
        System.out.println(obj.encode(65));
    }
}
