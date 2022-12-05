import abstract_factory_pattern.FactoryProducer;
import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.factory.AbstractFactory;
import abstract_factory_pattern.factory.ColorFactory;
import abstract_factory_pattern.shape.Shape;
import adapter_pattern.Customer;
import adapter_pattern.User;
import adapter_pattern.UserToCustomer;
import builder_pattern.Video;
import builder_pattern.VideoBuilder;
import factory_pattern.Xe;
import factory_pattern.XeFactory;
import observer_pattern.VideoData;
import observer_pattern.notifier.FacebookNotifier;
import observer_pattern.notifier.YoutubeNotifier;
import singleton_pattern.ConnectDB;

public class Main {
    public static void main(String[] args) {
//        sigleton
//        ConnectDB connectDB = ConnectDB.getInstance();
//        ConnectDB connectDB1 = ConnectDB.getInstance();
//        System.out.println(connectDB.hashCode() == connectDB1.hashCode());
//        XeFactory xeFactory = new XeFactory();
//        Xe xeMay = xeFactory.getXe("XE_MAY");
//        xeMay.create();
//        Xe xeDap = xeFactory.getXe("XE_DAP");
//        xeDap.create();
//        FactoryProducer factoryProducer = new FactoryProducer();
//        AbstractFactory colorFactory =  factoryProducer.getFactory("COLOR");
//        Color red = colorFactory.getColor("RED");
//        red.fill();
//
//        AbstractFactory shapeFactory =  factoryProducer.getFactory("SHAPE");
//        Shape circle =  shapeFactory.getShape(Shape.TYPE.CIRCLE);
//        circle.draw();


//        Video video = new VideoBuilder().title("fun").description("123").url("abc.rq").build();
//        System.out.println(video.toString());

//        User user = new User("tran hieu", 22);
//        Customer customer = new UserToCustomer(user).get();
//        System.out.println(customer.toString());
        VideoData videoData = new VideoData("a", "b", "c");
        FacebookNotifier facebookNotifier = new FacebookNotifier(videoData);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(videoData);
        videoData.setTitle("b");

    }
}