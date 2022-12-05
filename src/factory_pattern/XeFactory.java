package factory_pattern;

public class XeFactory {
    public Xe getXe(String type){
        if(type == "XE_MAY")
            return new XeMay();
        if(type == "XE_DAP")
            return new XeDap();
        return null;
    }
}
