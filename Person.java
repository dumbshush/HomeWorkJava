import java.util.Scanner;

public class Person {
    public String[] getInputData() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
            return scanner.nextLine().split(" ");
        }
    }
}
