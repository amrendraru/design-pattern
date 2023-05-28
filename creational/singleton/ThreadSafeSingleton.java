public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton get() {
        synchronized (ThreadSafeSingleton.class) {
            if(threadSafeSingleton== null) {
                threadSafeSingleton = new ThreadSafeSingleton();
            }
            return  threadSafeSingleton;
        }
    }
}
