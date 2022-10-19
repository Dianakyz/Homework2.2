public class Main {
    public static void main(String[] args) {

        Human max = new Human(null, "Минск", "бренд-менеджер", 35);
        max.hello();

        Human ann = new Human("Аня", null, "методист образовательных программ", 29);
        ann.hello();

        Human kate = new Human("Катя", "Калининград", null, 28);
        kate.hello();

        Human artem = new Human("Артем", "Москва", "директор по развитию бизнеса", -27);
        artem.hello();

    }
}