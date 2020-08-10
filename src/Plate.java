public class Plate {
  int food;
    int addFood;

    public Plate(int food, int addFood) {
        this.food = food;
        this.addFood = addFood;
    }

    public int getAddFood() {
        return addFood;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int satiety) {
        food -= satiety;
    }

    public boolean checkingPlate(Cat cat) {
        if (food < cat.satiety) {
            return false;
        }
        return true;
    }

    public int adddFood() {
        return food += addFood;
    }






}
