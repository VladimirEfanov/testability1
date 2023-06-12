public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        //int price = 10_000;
        //int miles = service.calculate(price); // должно получиться 500
        //System.out.println(miles);

        int miles1 = service.calculate(10_000);
        System.out.println("Цена билета: 10 000 руб.; " + "Мили за билет: " + miles1);

        int miles2 = service.calculate(0);
        System.out.println("Цена билета: 0 руб.; " + "Мили за билет: " + miles2);

        int miles3 = service.calculate(100);
        System.out.println("Цена билета: 100 руб.; " + "Мили за билет: " + miles3);

        int miles4 = service.calculate(100_350);
        System.out.println("Цена билета: 100 350 руб.; " + "Мили за билет: " + miles4);
    }
}

