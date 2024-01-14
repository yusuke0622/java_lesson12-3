class Taxi extends Car {
    Taxi() {
        this(9999);
                // Taxi(int no)が呼び出される
        System.out.println("Taxi()");
    }
    
    Taxi(int no) {
        super(no);
                // Car(int no)が呼び出される
        System.out.println("Taxi(int no)");
    }
    
    Taxi(String no) {
        // this(~)、super(~)はコンストラクト内の先頭に記述
        // なければ自動的にsuper();が挿入される → メモリにオブジェクトの領域を取るときに、スーパークラスから変数などを作っていく流れになっているため  　
        System.out.println("Taxi(String no)");
    }
}