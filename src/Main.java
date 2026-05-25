public class Main {
    public static void main(String[] args) {
        int  personAge= 18;
        if (personAge >= 18) {
            System.out.println(" Если возраст человека равен " + personAge + " то он совершеннолетний ");
        } else {
            System.out.println(" Если возраст человека меньше " + personAge + " он не достиг совершеннолетия, нужно немного подождать ");
        }
            int airTemper = 5;
            if (airTemper <= 5) {
                System.out.println(" На улице ниже " + airTemper + " градусов ,нужно надеть шапку ");
            } else {
                System.out.println(" На улице выше " + airTemper + " градусов ,можно идти без шапки ");
            }
            int currentSpeed = 59;
            if (currentSpeed<= 60) {
                System.out.println(" Если скорость " + currentSpeed + " можно ездить спокойно ");
            } else {
                System.out.println(" Если скорость " + currentSpeed + " придется заплатить штраф ");
            }
            int ageLet = 18;
            if (ageLet >= 2 && ageLet <= 6) {
                System.out.println(" Если возраст человека равен " + ageLet + " то ему нужно ходить в детский сад ");
            } else if (ageLet >= 7 && ageLet <= 17) {
                System.out.println(" Если возраст человека равен " + ageLet + " то ему нужно ходить в школу.");
            } else if (ageLet >= 18 && ageLet <= 24) {
                System.out.println("Если возраст человека равен " + ageLet + " то его место в университете. ");
            } else if (ageLet > 24) {
                System.out.println(" Если возраст человека равен " + ageLet + " то ему пора ходить на работу ");
            }
            int ageChild = 10;
            if (ageChild < 5) {
                System.out.println(" Если возраст ребенка равен " + ageChild + " лет, то он не может кататься на атракционе ");
            } else if (ageChild > 5 && ageChild <= 14) {
                System.out.println(" Если возраст ребенка равен " + ageChild + " лет,то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            } else if (ageChild > 14) {
                System.out.println("Если возраст ребенка равен " + ageChild + " лет, то он может кататься без сопровождения взрослого.");
            }

            int capacity = 120;
            int seating = 60;
            int stand = capacity - seating;
            int busySeat = 50;
            int buseStand = 45;
            int totalBusy = busySeat + buseStand;
            if( totalBusy < capacity) {
                if (busySeat < seating) {
                    System.out.println(" Есть сидячие места ");
                } else if (buseStand < stand) {
                    System.out.println(" Есть стоячие места ");
                }
            }else {
                System.out.println(" Вагон полностью забит ");
            }
                int one = 1;
                int two = 2;
                int three =3;
                if (one >= two && one >= three) {
                    System.out.println(" one - самое большее число ");
                }else if(two >= one && two >= three) {
                    System.out.println(" two - самое большее число");
                }else {
                    System.out.println(" three - самое большее число ");
                    }
                }

                }























