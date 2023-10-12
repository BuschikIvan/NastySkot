import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите сумму для конвертации: ");
        double evrei = scanner.nextDouble();
        
        System.out.print("Введите курс обмена: ");
        double myrka = scanner.nextDouble();
        
        double sosika = evrei * myrka;
        System.out.println("Конвертированная сумма: " + sosika);
    }
}
