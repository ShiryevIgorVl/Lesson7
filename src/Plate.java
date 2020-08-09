public class Plate {
  int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }


    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
