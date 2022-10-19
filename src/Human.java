public class Human {

    int old;
    String name;
    String town;
    String job;

    Human(String name, String town, String job, int old) {
        if (old <= 0){
            this.old = 0;
        } else {
            this.old = old;
        }

        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name +  ". Я из города " + town + ". Мне " + old + " лет. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
