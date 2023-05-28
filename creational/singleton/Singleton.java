public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton get() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
