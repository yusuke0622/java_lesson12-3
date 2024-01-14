class DriveTaxi {
    public static void main(String[] args) {
        Car c = new Car();
        // 結果 car()
        System.out.println("-------------");
        Taxi ti = new Taxi(2525);
        // 結果　Car(int no)、Taxi(int no)
        System.out.println("-------------");
        Taxi t2 = new Taxi();
        // 結果　Car(int no)、Taxi(int no)、Taxi()
        System.out.println("-------------");
        Taxi t3 = new Taxi("2525");
        // 結果 Car()、Taxi(String no）
    }
}