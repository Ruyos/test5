package test4;

public class  Calculator {
    public static void main(String[]args) {
        ToCompute multi = new ToCompute() {
            @Override
            public int compute(int a, int b) {
                System.out.println(a*b);
                return a*b;
            }
        };
        ToCompute Sum=new ToCompute() {
            @Override
            public int compute(int a, int b) {
                System.out.println(a+b);
                return a*b;
            }
        };
       multi.compute(3,4);
       Sum.compute(3,4);
    }
}
