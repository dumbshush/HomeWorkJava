public class DataValidator {
    public void validateData(String[] data) throws InvalidDataFormatException {
        if (data.length != 6) {
            throw new InvalidDataFormatException("Неверное количество данных.");
        }

        // Проверка формата даты рождения
        String birthDate = data[3];
        String[] components = birthDate.split("\\.");

        if (components.length != 3) {
            throw new InvalidDataFormatException("Неверный формат даты рождения. Ожидается dd.mm.yyyy.");
        }

        try {
           int day = Integer.parseInt(components[0]);
           int month = Integer.parseInt(components[1]);
           int year = Integer.parseInt(components[2]);

           if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900 || year > 2100) {
            throw new InvalidDataFormatException("Неверный формат даты рождения. Проверьте диапазоны дней, месяцев и годов.");
            }
        } catch (NumberFormatException e) {
            throw new InvalidDataFormatException("Неверный формат даты рождения. Ожидается целое число.");
        }

        // Проверка формата номера телефона
        String phoneNumber = data[4];
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!Character.isDigit(c)) {
                throw new InvalidDataFormatException("Неверный формат номера телефона. Ожидается целое число.");
            }

        // Проверка значения пола
        String gender = data[5];
        if (!gender.equals("f") && !gender.equals("m")) {
            throw new InvalidDataFormatException("Неверное значение пола. Ожидается 'f' или 'm'.");
        }
    }
}
}
