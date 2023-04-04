package test2;

public class DolphinTrainGround {
    private class Dolphin {
        public void dance() {
            System.out.println("~~~Dolphin dance~~~");
        }

        public void cry() {
            System.out.println("~~~呼呼~~~");
        }
    }
        void train(Dolphin dolphin){
            dolphin.dance();
            dolphin.cry();
        }
    public static void main(String[] args) {
        DolphinTrainGround dolphinTrainGround = new DolphinTrainGround();
        Dolphin dolphin = dolphinTrainGround.new Dolphin();
        dolphinTrainGround.train(dolphin);
    }
}
