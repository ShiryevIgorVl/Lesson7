public class Main {
        public static void main(String[] args) {
            Plate plate = new Plate(18);

            Cat[] cat = {
                    new Cat("Барсик", 3),
                    new Cat ("Мурзик", 5),
                    new Cat ("Шустрик", 4),
                    new Cat ("Тихон", 6),
                    new Cat ("Котофей", 7)
            };
            for (int i = 0; i < cat.length; i++) {
                cat[i].eat(plate);
                if (plate.checkingPlate (cat[i]) == false) {
                    System.out.println(cat[i+1].getName() +  " остался голодным.");
                    break;
                }


        }


            }



            }

