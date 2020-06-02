package GB;

public final class Plate {
    private int foodOnPlate;        //еда в тарелке, гр
    private final int ADDITION;     //объем добавки, гр (одна добавка для одного кота)
    private int countOfAdditions;   //количество добавок, шт

    public Plate(int foodOnPlate, int countOfAdditions, int ADDITION) {
        this.foodOnPlate = foodOnPlate;
        this.countOfAdditions = countOfAdditions;
        this.ADDITION = ADDITION;
    }
    //в условии задачи не указывается, как будет происходить добавка еды, поэтому сделано автоматически
    public int getAmountOfEaten(int appetite) {
        int eating;                         //используется, когда съедается меньше значения аппетита
        if (foodOnPlate >= appetite){       //если еды хватает
            foodOnPlate -= appetite;
            return appetite;
        }
        else if (countOfAdditions > 0){     //если не хвататет еды, но есть добавки
            addFoodOnPlate();
            System.out.println("Была добавка еды: " + ADDITION + "гр.");
            if (foodOnPlate >= appetite){   //если после добавки хватает, чтобы наесться
                foodOnPlate -= appetite;
                return appetite;
            } else {                        //если все равно не хватает еды после добавки до 100% сытости
                eating = foodOnPlate;
                foodOnPlate = 0;
                return (eating);
            }
        }
        else if (foodOnPlate > 0){          //если после всего вообще осталось хоть что-то
            eating = foodOnPlate;
            foodOnPlate = 0;
            return (eating);
        } else return 0;                    //если тарелка пустая и добавок больше нет
    }

    public void displayStatus() {
        System.out.println("В тарелке " + foodOnPlate + "гр. еды. \tДоступно пополнений: " + countOfAdditions);
    }

    private void addFoodOnPlate(){  //практика закрытого метода, можно было не делать
        foodOnPlate = foodOnPlate + ADDITION;
        countOfAdditions--;
    }
}