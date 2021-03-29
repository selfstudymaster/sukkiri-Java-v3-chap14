package hero;
// 第3版 第14章(第2版 第14章):Javaを支える標準クラス
// chap14

// code14-02
//public class Hero {
//    public String name;
//    public int hp;
//    /* … */
//}

// code14-05, 14-06
//public class Hero {
//    public String name;
//    public int hp;
//    /* … */
//    public String toString() {
//        return "名前：" + this.name + "／HP：" + this.hp;
//    }
//    // 実行結果
//    // 名前：ミナト／HP：100
//}

// code14-07
//public class Hero {
//    public String name;
//    public int hp;
//    /* … */
//    public boolean equals(Object o) {
//        if (this == o) { return true; }
//        if (o instanceof Hero) {
//            Hero h = (Hero)o;
//            if (this.name.equals(h.name)) {
//                return true;
//            }
//        }
//        return false;
//    }
//}

// code14-08
//public class Hero {
//    public String name;
//    public int hp;
//    public int money;
//    /* … */
//}

// code14-09, 14-10, 14-11, 14-12
//public class Hero {
//    public String name;
//    public int hp;
//    public static int money;
//    /* … */
//}

// code14-13, 14-14
//public class Hero {
//    public String name;
//    public int hp;
//    public static int money;
//    /* … */
//    public static void setRandomMoney() {
//        Hero.money = (int)(Math.random() * 1000);
//    }
//}

// code14-15
public class Hero {
    public String name;
    public int hp;
    public static int money;
    /* … */
    public static void setRandomMoney() {
        Hero.money = (int)(Math.random() * 1000);
        System.out.println(this.name + "たちの所持金を初期化しました");
    } // エラーメッセージ
    // java: staticでない変数 thisをstaticコンテキストから参照することはできません
}