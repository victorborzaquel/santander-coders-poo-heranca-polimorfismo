package Ex03.iphones;

import Ex03.iphones.concretos.Iphone13Mini;
import Ex03.iphones.concretos.Iphone9;
import Ex03.iphones.concretos.IphoneX;

public class IphoneFactory {
    public static Iphone cadastrarIphone(TypeIphoneEnum typeIphoneEnum) {
        return switch (typeIphoneEnum) {
            case IPHONE_X -> new IphoneX();
            case IPHONE_9 -> new Iphone9();
            case IPHONE_13_MINI -> new Iphone13Mini();
        };
    }
}
