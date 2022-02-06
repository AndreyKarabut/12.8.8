import java.util.Comparator;
import java.util.Objects;

public class Items implements Comparable<Items>{
    public String name;
    public String departament;
    public double cost;

    public Items(String name, String departament, double cost) {
        this.name = name;
        this.departament = departament;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return Objects.equals(name, items.name) && Objects.equals(departament, items.departament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departament);
    }

    @Override
    public int compareTo(Items o){
        return (int) (this.cost - o.cost);
    }
}

class ComparatorName implements Comparator<Items> {
    public int compare(Items o1, Items o2) {
        return o1.name.compareTo(o2.name);
    }
}

class ComparatorDepartament implements Comparator<Items> {
    public int compare(Items o1, Items o2) {
        return o1.departament.compareTo(o2.departament);
    }
}
