// Напишите программу, чтобы перевернуть строку с помощью рекурсии
package task;

public class task3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("строка что бы перевернуть");
        isReversRecurs(sb);
    }
    static StringBuilder isReversRecurs(StringBuilder sb){
        if (sb.length() == 1){
            System.out.println(sb.charAt(sb.length() - 1));
            return sb;
        }
        System.out.print(sb.charAt(sb.length() - 1));
        return isReversRecurs(sb.deleteCharAt(sb.length() - 1));
    }
}
