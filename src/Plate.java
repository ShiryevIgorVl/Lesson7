public class Plate {
  int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int satiety) {
        food -= satiety;
    }

    public boolean checkingPlate (Cat cat) {
        if (food < cat.satiety) {
            return false;
        }
        return true;
    }

    public int addFood( int addFood) {

    }






}
