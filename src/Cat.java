public class Cat {

       private   String name;
       int satiety;    //сытость

        public Cat(String name, int satiety) {
            this.name = name;
            this.satiety = satiety;
        }
        public int getSatiety() {
            return satiety;
    }

        public String getName() {
            return name;
        }

        public void eat(Plate plate) {
            System.out.println(name + " ест");
            plate.decreaseFood(getSatiety());
        }

//        public boolean catSatietyNosatiety (Plate plate) {
//                if (satiety <= plate.food){
//                return true;
//            }
//                return false;
//        }


}

