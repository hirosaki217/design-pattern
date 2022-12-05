package singleton_pattern;

public class ConnectDB {
    private static ConnectDB INSTANCE;
    public boolean isConnected = false;
    private ConnectDB(){
        this.isConnected = true;
    }



    public static ConnectDB getInstance(){
        if(INSTANCE == null)
            INSTANCE = new ConnectDB();
        return INSTANCE;
    }
}
