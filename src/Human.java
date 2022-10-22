public class Human {

    private int old;
    String name;
    private String town;
    String job;

    Human(String name, String town, String job, int old) {
        setOld(old);
        setTown(town);

        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }

        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (old <= 0){
            this.old = 0;
        } else {
            this.old = old;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        if (old <= 0){
            this.old = 0;
        } else {
            this.old = old;
        }
    }
}
