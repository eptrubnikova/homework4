public class Main {
    public static void main(String[] args) {
        ;
        System.out.println("Задача 1.1");
        int age = 30;
        if (age >= 18) {
            System.out.println("Поздравляем с совершенолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершенолетия не наступил, необходимо подождать");
        }

        System.out.println("Задача 1.2");
        int age1 = 9;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("ты ходишь в школу");
        }
         if (age1 >= 18 && age1 < 24) {
             System.out.println("иди подавать документы в ВУЗ");
}
if (age1 >= 24) {
    System.out.println("иди работать");
}

        System.out.println("Задача 1.3");
int totalSeats = 102;
int soldSeats = 92;
int freeSeats = totalSeats - soldSeats;
if (freeSeats < 102 && freeSeats > 0) {
    System.out.println("В вагоне осталось " + freeSeats + " мест");}
    else {System.out.println("В вагоне мест нет");}
    int seatPlace = 60;
    int soldSeatPlace = 50;
    int freeSeatPlace = seatPlace - soldSeatPlace;
    int standPlace = 42;
    int soldStandPlace = soldSeats - soldSeatPlace;
    int freeStandPlace = standPlace - soldStandPlace;
    if (freeSeatPlace <= 60 && freeSeatPlace > 0)  {
            System.out.println("В вагоне осталось " + freeSeatPlace + " сидячих мест");
        }
    else {System.out.println("В вагоне нет сидячих мест");}
    if (freeStandPlace <= 42 && freeStandPlace >0){
        System.out.println("В вагоне осталось " + freeStandPlace + "стоячих мест");
    }
    else {System.out.println("В вагоне нет стоячих мест");}

        System.out.println("Задача 2.1");
        int age2 = 7;
        if (age2 >= 18) {
            System.out.println("Поздравляем с совершенолетием");
        }
        else  {
            System.out.println("Возраст совершенолетия не наступил, необходимо подождать");
        }

        System.out.println("Задача 2.2");
        int age3 = 30;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("иди в школу");
        }
        else {
            if (age3 >= 18 && age3 < 24) {
                System.out.println("иди подавать документы в ВУЗ");
            } else {
                System.out.println("иди работать");
            }
        }
        System.out.println("Задача 2.3");
        int totalSeats1 = 102;
        int soldSeats1 = 92;
        int freeSeats1 = totalSeats - soldSeats;
        if (freeSeats1 < 102 && freeSeats1 > 0) {
            System.out.println("В вагоне осталось " + freeSeats1 + " мест");}
        else System.out.println("В вагоне мест нет");
        int seatPlace1 = 60;
        int soldSeatPlace1 = 50;
        int freeSeatPlace1 = seatPlace1 - soldSeatPlace1;
        int standPlace1 = 42;
        int soldStandPlace1 = soldSeats1 - soldSeatPlace1;
        int freeStandPlace1 = standPlace1 - soldStandPlace1;
        if (freeSeatPlace1 <= 60 && freeSeatPlace1 > 0)  {
            System.out.println("В вагоне осталось " + freeSeatPlace1 + " сидячих мест");
        }
        else {System.out.println("В вагоне нет сидячих мест");}
        if (freeStandPlace1 <= 42 && freeStandPlace1 >0){
            System.out.println("В вагоне осталось " + freeStandPlace1 + "стоячих мест");
        }
        else {System.out.println("В вагоне нет стоячих мест");}

        System.out.println("Задача 3.1");
int age5 = 25;
boolean agePreschool = age5 >= 2 && age5 <= 6;
if (agePreschool){
        System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить  в садик");}
        boolean ageSchoolboy = age5 >= 7 && age5 == 18;
        if (ageSchoolboy){
        System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");}
        boolean ageStudent = age5 > 18 && age5 < 24;
        if (ageStudent)
        {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в ВУЗ");}
        boolean ageMan = age5 > 24;
        if (ageMan){
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");}

        System.out.println("Задача 3.2");
 int age4 = 17;
 if (age4 < 5) {
     System.out.println("ты не иожешь кататься на аттракционе");
 }
 else if (age4 >= 5 && age4 < 14) {
     System.out.println("ты можешь кататься на аттракционе только со взрослыми");
 }
 else
     System.out.println("ты можешь кататься без сопровождения");

        System.out.println("Задача 3.3");
 int one = 5;
 int two = 15;
 int free = 20;
 if (one > two && one > free) {
     System.out.println("самое большое число " +one);
 }
 else if (two > one && two > free) {
     System.out.println("самое большое число " + two);
 }
 else
     System.out.println("самое большое число " + free);

    }

    }

