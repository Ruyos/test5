package test5;

public class Goods {
    private boolean isDanger = false;
    private String name;

    public void setIsDanger(boolean b) {
        this.isDanger = b;
    }

    public boolean isDanger() {
        return this.isDanger;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}
