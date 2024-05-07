package repositories;

import entities.Cat;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter

public class CatRepository {

    private ArrayList<Cat> cats;
    public CatRepository() {
        this.cats = new ArrayList<>();
    }

    public void newCat(String name, int age, int weight) {
        Cat cat = new Cat(name, age, weight);
        cats.add(cat);
    }

    public ArrayList allCats() {
        return cats;
    }
}
