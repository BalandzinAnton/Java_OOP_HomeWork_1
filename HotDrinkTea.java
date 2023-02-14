package OOP.HW.HW_1;

public class HotDrinkTea extends HotDrink{

public Integer temperature;


  public HotDrinkTea(String name, Integer cost, Integer volume, Integer temperature) {
    super(name, cost, volume);
    this.temperature = temperature;
  }


}
