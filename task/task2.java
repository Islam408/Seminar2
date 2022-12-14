// Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.

package task;

public class task2 {
    public static void main(String[] args) {
        String stringFirst = "найти наименьшее окно в строчке";
        String stringSecond = "екчортс в онко еешьнемиан итйан";
        StringBuilder sb = new StringBuilder(stringFirst);
        String stringT = sb.reverse().toString();
        System.out.println(stringSecond.compareTo(stringT) == 0);
    

    
    }
}
