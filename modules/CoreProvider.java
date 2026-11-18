public class SmartService {
    private int state;

    public SmartService(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 10) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        SmartService obj = new SmartService(10);
        System.out.println(obj.dispatch(10));
    }
}
