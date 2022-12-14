//Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
// Используем метод StringBuilder.append().

package task;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(appenDStr(3, 30)));
    }
    static String[] appenDStr(int x, int y){
        String[] result = new String[3];
        StringBuilder summ = new StringBuilder();
        summ.append(x);
        summ.append(" + ");
        summ.append(y);
        summ.append(" = ");
        summ.append(x+y);
        StringBuilder minus = new StringBuilder();
        minus.append(x);
        minus.append(" - ");
        minus.append(y);
        minus.append(" = ");
        minus.append(x-y);
        StringBuilder umn = new StringBuilder();
        umn.append(x);
        umn.append(" * ");
        umn.append(y);
        umn.append(" = ");
        umn.append(x*y);

        result[0] = summ.toString();
        result[1] = minus.toString();
        result[2] = umn.toString();

        return result;


    }
}
