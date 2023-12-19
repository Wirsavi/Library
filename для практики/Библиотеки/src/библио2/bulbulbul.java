package библио2;
import java.util.Scanner;

public class bulbulbul {

	public static void main(String[] args) {
		System.out.println("Ведите операцию: ");
		System.out.print("1. Сложение");
		System.out.print("2. Вычитание");
		System.out.print("3. Умножени ");
		System.out.print("4. Деление ");
		// Соколов Александр Александровичк Дкип-401
		Scanner scanner = new Scanner(System.in);
		int operation = scanner.nextInt();
		
		System.out.println("Введите первое число: ");
		int x = scanner.nextInt();
		System.out.println("Ведите второе число: ");
		int y = scanner.nextInt();
		
		int result = 0;
		
		if (operation == 1)
			result = x + y;
		else if (operation == 2)
			result = x - y;
		else if (operation == 3)
			result = x * y;
		else if (operation == 4)
			result = x / y;
		System.out.println("Результат = " + result);
		System.out.println("Соколов Александр Александрович Дкип-401");
	}
}
