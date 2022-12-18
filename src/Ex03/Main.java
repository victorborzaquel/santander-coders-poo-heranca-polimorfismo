package Ex03;

import Ex03.iphones.Iphone;
import Ex03.iphones.IphoneFactory;
import Ex03.iphones.TypeIphoneEnum;

public class Main {
    public static void main(String[] args) {
        Iphone iphoneX = IphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_X);
        Iphone iphone9 = IphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_9);
        Iphone iphone13Mini = IphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_13_MINI);

        iphoneX.exibirDetalhes();
        iphone9.exibirDetalhes();
        iphone13Mini.exibirDetalhes();
    }
}
