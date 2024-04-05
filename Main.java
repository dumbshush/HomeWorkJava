
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        DataValidator validator = new DataValidator();
        FileWrite fileWriter = new FileWrite();

        try {
            String[] data = person.getInputData();
            validator.validateData(data);

            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDate = data[3];
            int phoneNumber = Integer.parseInt(data[4]);
            char gender = data[5].charAt(0);

            System.out.println("Фамилия: " + lastName);
            System.out.println("Имя: " + firstName);
            System.out.println("Отчество: " + middleName);
            System.out.println("Дата рождения: " + birthDate);
            System.out.println("Номер телефона: " + phoneNumber);
            System.out.println("Пол: " + gender);

            fileWriter.writeToFile(lastName, firstName, middleName, birthDate, phoneNumber, gender);
            System.out.println("Данные успешно записаны в файл.");
        } catch (InvalidDataFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат номера телефона.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}