//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
      public static void main(String[] args) {
        System.out.println("Hello world!");
        String name = "Brigita";
        System.out.println(name);
        String surname = "Salina";
        int birthYear = 1989;
        int currentYear = 2023;
        System.out.println(" As esu " + name + " " + surname + ". Man yra " + (currentYear - birthYear) + " metai ");

        //2
        int num31 = (int)Math.round(Math.random() * 4.0);
        int num32 = (int)Math.round(Math.random() * 4.0);
        System.out.println("num31 yra " + num31 + ", num32 yra " + num32);
        if (num32 > num31) {
            System.out.println((double)num32 / (double)num31);
        } else {
            System.out.println((double)num31 / (double)num32);
        }

        int min = 5;
        int max = 25;
        int var10000 = min + (int)Math.round(Math.random() * (double)(max - min));
        min = 10;
        max = 20;
        var10000 = min + (int)Math.round(Math.random() * (double)(max - min));
        int num41 = (int)Math.round(Math.random() * 25.0);
        int num42 = (int)Math.round(Math.random() * 25.0);
        int num43 = (int)Math.round(Math.random() * 25.0);
        System.out.println("num41 yra " + num41 + ", num42 yra " + num42 + ", num43 yra " + num43);
        if (num41 > num42 && num41 < num43) {
            System.out.println("num41 yra vidurine reiksme:" + num41);
        }

        if (num41 <= num42 && num41 >= num43) {
            System.out.println("num41 yra vidurine reiksme:" + num41);
        }

        if (num42 > num41 && num42 < num43) {
            System.out.println("num42 yra vidurine reiksme:" + num42);
        }

        if (num42 <= num41 && num42 >= num43) {
            System.out.println("num42 yra vidurine reiksme:" + num42);
        }

        if (num43 > num41 && num43 < num42) {
            System.out.println("num43 yra vidurine reiksme:" + num43);
        }

        if (num43 <= num41 && num43 >= num42) {
            System.out.println("num43 yra vidurine reiksme:" + num43);
        }
        //4.
        int num51 = 1 + (int)(Math.random() * 10.0);
        int num52 = 1 + (int)(Math.random() * 10.0);
        int num53 = 1 + (int)(Math.random() * 10.0);
        System.out.println("num51:" + num51 + " num52:" + num52 + "num53: " + num53);
        if (num51 + num52 > num53 && num52 + num53 > num51 && num53 + num52 > num51) {
            System.out.println(" trikampis gaunasi");
        } else {
            System.out.println("trikampis nesigauna");
        }

        //5.
          System.out.println("------- uzd 5. --------");
        int num61 = (int) Math.round(Math.random() * 2.0);//0
        int num62 = (int) Math.round(Math.random() * 2.0);//2
        int num63 = (int) Math.round(Math.random() * 2.0);//1
        int num64 = (int) Math.round(Math.random() * 2.0);//0
        System.out.println("num61 yra " + num61 + ", num62 yra " + num62 + ", num63 yra " + num63 + ", num64 yra " + num64);
       // System.out.println(num61);
       // System.out.println(num62);
        //System.out.println(num63);
       // System.out.println(num64);
        System.out.println("--------");

        // ===== pvz kaip didinti kintamojo reiksme
     //   int counter = 0;
      //  counter = counter + 8;
     //   counter = counter + 12;
     //   counter += 7;
     //   counter++;
          // ==========

        int zeros = 0;
        int ones = 0;
        int twos = 0;
        if (num61 == 0) {
            ++zeros;
        }

        if (num62 == 0) {
            ++zeros;
        }

        if (num63 == 0) {
            ++zeros;
        }

        if (num64 == 0) {
            ++zeros;
        }

        if (num61 == 1) {
            ++ones;
        }

        if (num62 == 1) {
            ++ones;
        }

        if (num63 == 1) {
            ++ones;
        }

        if (num64 == 1) {
            ++ones;
        }

        if (num61 == 2) {
            ++twos;
        }

        if (num62 == 2) {
            ++twos;
        }

        if (num63 == 2) {
            ++twos;
        }

        if (num64 == 2) {
            ++twos;
        }

        System.out.println(" nuliu yra " + zeros);
        System.out.println(" vienetu yra " + ones);
        System.out.println(" dvejetu yra " + twos);

    //    6.
        int min1 = -10;
        int max1 = 10;
        int num71 = min1 + (int)Math.round(Math.random() * (max1 - min1));
        int num72 = min1 + (int)Math.round(Math.random() * (max1 - min1));
        int num73 = min1 + (int)Math.round(Math.random() * (max1 - min1));
        if (num71 < 0) {
            System.out.println(" [" + num71 + "]");
        }

        if (num71 == 0) {
            System.out.println(" (" + num71 + ")");
        }

        if (num71 > 0) {
            System.out.println(" {" + num71 + "}");
        }

        if (num72 < 0) {
            System.out.println(" [" + num72 + "]");
        }

        if (num72 == 0) {
            System.out.println(" (" + num72 + ")");
        }

        if (num72 > 0) {
            System.out.println(" {" + num72 + "}");
        }

        if (num73 < 0) {
            System.out.println(" [" + num73 + "]");
        }

        if (num73 == 0) {
            System.out.println(" (" + num73 + ")");
        }

        if (num73 > 0) {
            System.out.println(" {" + num73 + "}");
        }


        //7.

      //  int min = 5;

        //int max= 3000;
        // int cabdles = min1 + (int)Math.round(Math.random() * (max - min));


        //  if (candles <= 1000){
         //     System.out.println(" jus perkate " + candles + " kaina " + candles + " euru ");
         // }
         /// if (candles > 1000 && candles <= 2000){
         //         System.out.println(" jus perkate " + candles + " kaina " + candles + " euru ");
             // }
         // }
         // if (candles > 1000){
          ///    System.out.println(" jus perkate " + candles + " kaina " + candles + " euru ");
        //  }



        //8.Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su
          // atsitiktinėm reikšmėm nuo 0 iki 100. Paskaičiuokite jų aritmetinį vidurkį.
        //Ir aritmetinį vidurkį atmetus tas reikšmes, kurios yra mažesnės nei 10
         //  arba didesnės nei 90. Abu vidurkius atspausdinkite. Rezultatus
          // apvalinkite iki sveiko skaičiaus.


          int min = 0;
          int max= 100;
          int  num91 = min + (int) Math.round(Math.random() * (max - min));
          int  num92 = min + (int) Math.round(Math.random() * (max - min));
          int  num93 = min + (int) Math.round(Math.random() * (max - min));


          System.out.println(num91);
          System.out.println(num92);
          System.out.println(num93);


    //      System.out.println(------ programavimas, kodo versiavimas);}









































































      }
}
