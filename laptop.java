
import java.util.Set;

/**
 Создать класс Ноутбук для магазина техники.
Добавить атрибуты класса с соответствующими типами.
Например,
- идентификатор
- производитель
- название модели
- RAM
- объем HD
- операционная система
- цена
- и т.д.
Добавить конструктор класса.
Добавить необходимые методы класса.
 */
public class laptop {
    int id;
    String producer, modelName, operatingSystem, color;
    int ram, memory, price;
    
    public laptop(int id, String producer, String modelName, String operatingSystem, String color, int ram, int memory,int price ) {
                        this.id = id;
                        this.producer = producer;
                        this.modelName = modelName;
                        this.operatingSystem = operatingSystem;
                        this.color = color;
                        this.ram = ram;
                        this.memory = memory;
                        this.price = price;
    
    }
    public String toString(){
        return "laptop number: " + id + "\n" +
        "producer: " + producer + "\n" +
        "modelName: " + modelName + "\n" +
        "operatingSystem: " + operatingSystem + "\n" +
        "Color: " + color + "\n" +
        "ram: " + ram + "\n" +
        "memory: " + memory + "\n" +
        "price:" + price +"\n"+ "______" + "\n";
    }
    @Override
    public int hashCode() {
       
        return id;
    }
  
    public static StringBuilder getLaptopByColor(Set<laptop> laptops,String color){
        StringBuilder result = new StringBuilder();
        for (laptop i : laptops) {
            if (i.color == color) {
                result.append(i.producer);
                result.append(" ");
            }
        }
        return result;
    }
}
