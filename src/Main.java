import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Cat> setCat = new HashSet<Cat>();
        ArrayList<Cat> listCat = new ArrayList<Cat>();

        Cat cat1 = new Cat("Milky","white");
        Cat cat2 = new Cat("Barny","red");

        //hashCode
        System.out.println(cat1.getName() + " hashCode: " + cat1.hashCode());
        System.out.println(cat2.getName() + " hashCode: " + cat2.hashCode());

        listCat.add(new Cat("Mary","black"));
        listCat.add(new Cat("Rudy","white"));
        listCat.add(new Cat("Milky","white"));
        listCat.add(new Cat("Noi","red"));
        listCat.add(new Cat("Barny","red"));


        //Сравниваем кошек с ArrayList
        int counter = 1;
        for(Object c : listCat.toArray()){
            if(cat1.equals(c)){
                System.out.println("Cat1 equals to " + counter + " - element of listCat");
            }
            if(cat2.equals(c)){
                System.out.println("Cat2 equals to " + counter + " - element of listCat");
            }
            counter++;
        }

        // add 4 cats to HashSet
        int counter2 = 0 ;
        for (Cat n : listCat) {
            setCat.add(n);
            counter2++;
            if (counter2 == 4) break;
        }

        System.out.println("Set size after add 4 cats from listCat: " + setCat.size());

        //try to add our two cats
        if(setCat.add(cat1))
            System.out.println(cat1.getName() + " added to setCat");
        else
            System.out.println("setCat have the same cat!");

        if(setCat.add(cat2))
            System.out.println(cat2.getName() + " added to setCat");
        else
            System.out.println("setCat have the same cat!");

        System.out.println("Set size after try to add our two cats: " + setCat.size());
    }
}
