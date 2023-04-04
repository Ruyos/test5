
package test1;
import java.util.Scanner;
public class CatchError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("请输入被除数: ");
            int num1 = Integer.parseInt(input.nextLine());

            System.out.println("请输入除数: ");
            int num2 = Integer.parseInt(input.nextLine());

            float result = num1 / num2;
            System.out.println(result);
        }
        catch (NumberFormatException e) {
            System.err.println("输入的不是数字！");
        } catch (ArithmeticException e) {
            System.err.println("除数不能为0！");
        }
    }
}