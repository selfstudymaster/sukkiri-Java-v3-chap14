package main;
import empty.Empty;
import hero.Hero;

// 第3版 第14章(第2版 第14章):Javaを支える標準クラス

// chap14
// code14-01
//public class Main {
//    public static void main(String[] args) {
//        Empty e = new Empty();
//        String s = e.toString();
//        System.out.println(s); // 実行結果: empty.Empty@3f0ee7cb
//    }
//}

// code14-02
//public class Main {
//    public static void main(String[] args) {
//        Object o1 = new Empty();
//        Object o2 = new Hero();
//        Object o3 = "こんにちは";
//
//        System.out.println(o3);
//    }
//}

// code14-03
//public class Main {
//    public void printAnyting(object o) {
//        // 何型でもいいから、引数を1つ受け取り画面に表示
//        System.out.println(o.toString());
//    }
//}

// code14-04, code14-05
//public class Main {
//    public static void main(String[] args) {
//        Hero h = new Hero();
//        h.name = "ミナト";
//        h.hp = 100;
//        System.out.println(h.toString()); // 実行結果: hero.Hero@3f0ee7cb
//    }
//}

// code14-06, 14-07
//public class Main {
//    public static void main(String[] args) {
//        Hero h1 = new Hero();
//        h1.name = "ミナト";
//        h1.hp = 100;
//        Hero h2 = new Hero();
//        h2.name = "ミナト";
//        h2.hp = 100;
//        if (h1.equals(h2) == true) {
//            System.out.println("同じ内容です");
//        } else {
//            System.out.println("違う内容です");
//        }
//
//    }
//}

// code14-10
//public class Main {
//    public static void main(String[] args) {
//        Hero h1 = new Hero();
//        Hero h2 = new Hero();
//        System.out.println(h1.money); // 実行結果: 0
//        System.out.println(Hero.money); // 実行結果: 0
//        /* … */
//    }
//}

// code14-11
//public class Main {
//    public static void main(String[] args) {
//        Hero h1 = new Hero();
//        Hero h2 = new Hero();
//        Hero.money = 100;
//        System.out.println(Hero.money); // 実行結果: 100
//        System.out.println(h1.money); // 実行結果: 100
//        h1.money = 300;
//        System.out.println(h2.money); // 実行結果: 300
//    }
//}

// code14-12
//public class Main {
//    public static void main(String[] args) {
//        // 1人も勇者を生み出していない状況で…
//        Hero.money = 100;
//        System.out.println(Hero.money); // 実行結果: 100
//    }
//}

// code14-14
public class Main {
    public static void main(String[] args) {
        Hero.setRandomMoney();
        System.out.println(Hero.money); // 実行結果: 589
        Hero h1 = new Hero();
        System.out.println(h1.money); // 実行結果: 589
    }
}