package ua.lemekh.test;

class Singleton{
    private static Singleton instance;
    int i;
    private Singleton() {}

    public static Singleton getInstance(){
        if (instance == null) instance = new Singleton();
        return instance;
    }

}
class Test {
    public static void main(String[] args) {
        Singleton asd = Singleton.getInstance();
        asd.i=5;
        System.out.println(asd.i);
        Singleton asd2 = Singleton.getInstance();

        System.out.println(asd2.i);

    }
}
