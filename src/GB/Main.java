package GB;

public class Main {

    public static void main(String[] args) {
        String line = new String(new int[]{9664, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776,
                9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 573, 1031, 42916, 516, 9776, 9776,
                9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776, 9776,
                9776, 9776, 9776, 9776, 9654}, 0, 54);  //практика в String
        Cat cat1 = new Cat("Tom", 20);
        Cat cat2 = new Cat("Jack", 15);
        Cat cat3 = new Cat("Eddy", 10);
        Cat cat4 = new Cat("Miles", 15);
        Cat cat5 = new Cat("Steve", 20);
        Cat cat6 = new Cat("Morgan", 5);
        Plate plate = new Plate(30, 3, 15);
        Cat[] cats = {cat1, cat2, cat3, cat4, cat5, cat6};
        plate.displayStatus();
        System.out.println(line);
        for (Cat cat : cats){
            cat.eatFrom(plate);
            cat.displaySatiety();
            plate.displayStatus();
            System.out.println(line);
        }
    }
}