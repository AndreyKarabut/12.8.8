import java.util.*;


public class Main {
    public static void main(String[] args) {
        List <Items> itemsList = new ArrayList<>();

        itemsList.add(new Items("Pen", "Stationery", 10.0));
        itemsList.add(new Items("Copybook", "Stationery", 12.5));
        itemsList.add(new Items("Trousers", "Clothes", 1200.0));
        itemsList.add(new Items("Shirt", "Clothes", 750.0));
        itemsList.add(new Items("Boots", "Shoes", 1300.75));

        System.out.println(itemsList);
        //Отсортируем по названию предметов
        itemsList.sort(new ComparatorName());
        System.out.println(itemsList);
        //Отсортируем по названию отделов
        itemsList.sort(new ComparatorDepartament());
        System.out.println(itemsList);
        //Отсортируем по цене
        Set <Items> itemsSet = new TreeSet<>(itemsList);
        System.out.println(itemsSet);
    }

}
