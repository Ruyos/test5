package test5;

public class goodsException extends Exception {
    public void toPrint() {
        System.out.println("该物品是违禁品");
    }
}
