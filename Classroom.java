public class Classroom {

    public static void main(String... args){
        Wilder momo = new Wilder("momo", true);
        Wilder rico = new Wilder("rico", false);

        System.out.println(momo.whoAmI());
        System.out.println(rico.whoAmI());
    }
}