import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
     public void writeToFile(String lastName, String firstName, String middleName, String birthDate, long phoneNumber, char gender) throws IOException {
        try (FileWriter writer = new FileWriter(lastName + ".txt", true)) {
            writer.write(lastName + " " + firstName + " " + middleName + " " + birthDate + " " + phoneNumber + " " + gender + "\n");
        }
    }
}
