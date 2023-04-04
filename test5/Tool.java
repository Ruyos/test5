package test5;

public class Tool {
    public static void checkGoods(Goods g) throws goodsException {
        if (g.isDanger()) {
            throw new goodsException();
        }
    }
}
