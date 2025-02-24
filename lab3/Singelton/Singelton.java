class Singleton {
    private static Singleton instance;
    private static int counter = 0; 

    private Singleton() {

           }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        counter++; 
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println("Access Count: " + obj1.getCounter());
        
        Singleton obj2 = Singleton.getInstance();
        System.out.println("Access Count: " + obj2.getCounter());
    }
}
