package GB;

public final class Cat {
    protected String name;
    protected int appetite;
    private int satiety = 0; //сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eatFrom(Plate p) {
        satiety = p.getAmountOfEaten(appetite); //возвращаем количество съеденного
    }

    public void displaySatiety(){
        if (satiety == appetite){
            System.out.print("Кот " + name + " наелся. \t\t\t\t");
        }
        else if (satiety > 0){
            System.out.print("Кот " + name + " заправился на " + (satiety * 100 / appetite) + "%. \t");
        }
        else System.out.print("Кот " + name + " голодный. \t\t\t");
    }
}