public class Main {
        public static void main(String[] args) {
            Plate plate = new Plate(3, 10);

            Cat[] cat = {
                    new Cat("Барсик", 3),
                    new Cat ("Мурзик", 5),
                    new Cat ("Шустрик", 4),
                    new Cat ("Тихон", 6),
                    new Cat ("Котофей", 7)
            };
            for (int i = 0; i < cat.length; i++) {

                if (plate.checkingPlate (cat[i]) == true) {
                    cat[i].eat(plate);

                } else {
                    System.out.println(cat[i].getName() + " остался голодным.");
                    //break;
                    plate.adddFood();
                         }

                    }
            }
}

