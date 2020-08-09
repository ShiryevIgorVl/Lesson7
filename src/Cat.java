public class Cat {

         String name;
         int satiety;    //сытость

        public Cat(String name, int satiety) {
            this.name = name;
            this.satiety = satiety;
        }

        public String getName() {
            return name;
        }

        public void eat(Plate plate) {
            System.out.println(name + " eat");
            plate.decreaseFood(10);
        }

        public boolean satietyNosatiety (String name, int satiety, Plate plate) {
                if (satiety <= plate.food){
                return true;
            }
                return false;
        }


}

