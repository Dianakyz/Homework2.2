public class Main {
    public static void main(String[] args) {

        Human max = new Human(null, "Минск", "бренд-менеджер", 35);
        Human ann = new Human("Аня", null, "методист образовательных программ", 29);
        Human kate = new Human("Катя", "Калининград", null, 28);
        Human artem = new Human("Артем", "Москва", "директор по развитию бизнеса", -27);
        Human vladimir = new Human("Владимир", "Казань", null, 21);

        humanInfo(max);
        humanInfo(ann);
        humanInfo(kate);
        humanInfo(artem);
        humanInfo(vladimir);
    }

    private static void humanInfo(Human human){
        System.out.println("Привет! Меня зовут " + human.name +  ". Я из города " + human.getTown() + ". Мне " + human.getOld() + " лет. Я работаю на должности " + human.job + ". Будем знакомы!");
    }
}