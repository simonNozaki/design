public class Singleton {

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {
        System.out.println("Singleton instance generated.");
    }


}