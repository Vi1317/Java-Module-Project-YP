import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 0; i < 3; i++) {
            String name = "";
            while (name.isEmpty()) {
                System.out.println("Введите название машины №: " + (i + 1));
                name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Вы ввели пустую строку!");
                }
            }

            int speed = 0;
            boolean isCorrectSpeed = false;
            while (!isCorrectSpeed) {
                System.out.println("Введите скорость машины №: " + (i + 1));
                if (!scanner.hasNextInt()) {
                    scanner.nextLine();
                    System.out.println("Вы ввели некорректную скорость!");
                    continue;
                }
                speed = scanner.nextInt();
                isCorrectSpeed = speed > 0 && speed <= 250;
                if (!isCorrectSpeed) {
                    System.out.println("Вы ввели некорректную скорость!");
                }
            }
            scanner.nextLine();

            Car car = new Car(name, speed);
            race.calculateWinner(car);
        }

        System.out.println("Победитель гонки: " + race.getWinnerName());
    }
}
