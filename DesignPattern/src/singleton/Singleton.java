package singleton;



public class Singleton {
    private static Singleton instance;
    private int index;
    private Singleton(int index){
        this.index = index;
    }
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    int index = (int) Math.floor(Math.random()*4);
                    instance = new Singleton(index);
                }
            }
        }
        return instance;
    }

    public void sayHi(){
        System.out.println("Hello number: "+ index);
    }
}
