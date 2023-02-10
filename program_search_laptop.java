import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program_search_laptop {
    public static void main(String[] args) {

        laptop laptop_1 = new laptop(1, "Acer", "XB7573", "Windows", "Black", 128, 32, 11000);
        laptop laptop_2 = new laptop(2, "Samsung", "125ZY", "Linux", "Gold", 512, 700, 25000);
        laptop laptop_3 = new laptop(3, "Xiaomi", "SUPER56BT", "Windows", "White", 256, 128, 17000);
        laptop laptop_4 = new laptop(4, "Apple", "Ipro13", "IOS", "Red", 128, 32, 11000);
        laptop laptop_5 = new laptop(5, "Asus", "VF3573", "Windows", "Black", 128, 32, 11000);
        laptop laptop_6 = new laptop(6, "Acer", "TR765", "Linux", "Pink", 128, 32, 11000);
        laptop laptop_7 = new laptop(7, "Apple", "Ipro15", "IOS", "Black", 128, 32, 11000);
        laptop laptop_8 = new laptop(8, "Samsung", "SAMS73", "Windows", "White", 128, 32, 11000);
        laptop laptop_9 = new laptop(9, "Toshiba", "TB432", "Windows", "Green", 128, 32, 11000);
        laptop laptop_10 = new laptop(10, "Apple", "Ipro17", "IOS", "Black", 128, 32, 11000);

        Set<laptop> laptops = new HashSet<laptop>(
                Arrays.asList(laptop_1, laptop_2, laptop_3, laptop_4, laptop_5, laptop_6,
                        laptop_7, laptop_8, laptop_9, laptop_10));

        Scanner scanner = new Scanner(System.in, "cp866");
        String menu = "Добро пожаловать в каталог ноутбуков! Выберите действие:\n 1 - Печать всех товаров\n 2 - Поиск по каталогу\n 0 - Выход";
        System.out.println(menu);
        int serchNumber = scanner.nextInt();

        switch (serchNumber) {
            case 1:
                System.out.println(laptops.toString());
                break;
            case 2:
                System.out.println(laptop.getLaptopByColor(laptops, "Red"));
                break;
            case 0:

                break;
            default:
                break;
        }

        scanner.close();
    }
}
