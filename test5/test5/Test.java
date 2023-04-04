package test5;

public class Test {
    public static void main(String[] args) {
        Goods explosive = new Goods();
        explosive.setName("爆炸物");
        explosive.setIsDanger(true);

        try {
            Tool.checkGoods(explosive);
        } catch (goodsException e) {
            e.toPrint();
        }
    }
}//makkkkkkkkke