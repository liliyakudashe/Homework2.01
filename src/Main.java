public class Main {
    public static void main(String[] args) {

        Human maksim = new Human( null,1987,null,null);
        Human ania = new Human("Аня", 1993, "Москва", "Методист образовательных программ");
        Human katya = new Human("Катя", 1994, "Калиненград", "Продакт-менеджер");
        Human artem = new Human("Артём", 1995, "Москва", "Директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", 2001, "Казань", null);


        System.out.println(maksim);
        System.out.println(ania);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

    }

}