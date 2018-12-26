//Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 …
public class Main {

    public static void main(String[] args) {
        int p = 95;
        for (int i = 95; i > 0; i--) {
            if (p >= i) {
                p = i - 5;
                System.out.print(" " + p);
            }
        }
    }
}
