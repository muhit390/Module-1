public class Variables {

    public static void main(StringExample[] args) {
        int dogCount = 94;
        int catCount = 112;
        int petCount = dogCount * catCount;
        int tacos = 17;
        int hotdogs = 23;
        int total = tacos + hotdogs;
        System.out.println(petCount); // 206

        //int tacos = 12;

        System.out.println(tacos);

        tacos = 29;

        System.out.println(tacos);

        tacos = 22;
        System.out.println(total);
        System.out.println(tacos);

        total = tacos + hotdogs;

        System.out.println(total);
    }

}
