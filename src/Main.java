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
        int age1 = 28;
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
    else System.out.println("В вагоне мест нет");
    int seatPlace = 60;
    int soldSeatPlace = 50;
    int freeSeatPlace = seatPlace - soldSeatPlace;
    int standPlace = 42;
    int soldStandPlace = soldSeats - soldSeatPlace;
    int freeStandPlace = standPlace - soldStandPlace;
    if (freeSeatPlace <= 60 && freeSeatPlace > 0)  {
            System.out.println("В вагоне осталось " + freeSeatPlace + " сидячих мест");
        }
    else System.out.println("В вагоне нет сидячих мест");
    if (freeStandPlace <= 42 && freeStandPlace >0){
        System.out.println("В вагоне осталось " + freeStandPlace + "стоячих мест");
    }
    else System.out.println("В вагоне нет стоячих мест");
    }
    }
