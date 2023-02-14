package OOP.HW.HW_1;

import OOP.Sem.Sem_1.Product;
import java.util.ArrayList;

public class VendingMachine {

  public void getProduct(ArrayList<HotDrink> hotDrinks) {
    System.out.println("Сегодня в продаже: ");
    for (HotDrink item: hotDrinks) {
      System.out.println(item.getName());
    }

  }

  public void getProduct(String name, int volume, int temperature) {
    System.out.printf("Будьте оторожны, самый горячий напиток: " + name + ", его температура составляет " + temperature + ", объем напитка: " + volume);
  }


}
