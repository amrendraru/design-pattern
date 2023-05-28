public class DoubleCheckLocking {

    private static DoubleCheckLocking doubleCheckLocking = null;

    private DoubleCheckLocking() {
    }

    public static DoubleCheckLocking get() {
        if (doubleCheckLocking == null) {
            synchronized (DoubleCheckLocking.class) {
                if (doubleCheckLocking == null) {
                    doubleCheckLocking = new DoubleCheckLocking();
                }
            }
        }
        return doubleCheckLocking;
    }
}
