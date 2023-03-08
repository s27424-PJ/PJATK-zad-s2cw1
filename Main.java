//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
        zad9();
        zad10();
        zad11();
        zad12();
        zad13();
    }

    public static void zad1() {
        System.out.println("Zad 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź boki prostokata");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a>0&&b>0) {
            int wynik = a * b;
            System.out.println(wynik);
        }
        else {
            System.out.println("błąd");
        }
    }

    public static void zad2() {
        System.out.println("Zad 2");
        double pi = Math.PI;
        double pierwiastek = Math.sqrt(pi);
        String wynik = String.format("%.2f", pierwiastek);
        System.out.println("Pierwiastek kwadratowy z liczby Pi:" + wynik);
    }

    public static void zad3() {
        System.out.println("Zad 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwa słowa oddzielone spacją:");
        String string = scanner.nextLine();
        if (string.contains(" ")) {
            String[] tab = string.split(" ");
            String slowo1 = tab[0];
            String slowo2 = tab[1];
            System.out.println("\"%" + slowo2 + " " + slowo1 + "%\"");
        } else {
            System.out.println("błąd");
        }

    }

    public static void zad4() {
        System.out.println("Zad 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długości boków trójkąta:");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        if ((a + b > c && a + c > b && b + c > a) || (a == b && b == c)) {
            System.out.println("TAK można zbudować");
        } else if (a >= 0 && b >= 0 && c >= 0) {
            System.out.println("NIE można zbudować");
        } else {
            System.out.println("BŁĄD");
        }

    }

    public static void zad5() {
        System.out.println("Zad 5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca do wyswietlenia: ");
        int miesiac = scanner.nextInt();
        switch (miesiac) {
            case 1:
                System.out.println("Styczeń ma 31 dni");
                break;
            case 2:
                System.out.println("Luty ma 28 dni");
                break;
            case 3:
                System.out.println("Marzec ma 31 dni");
                break;
            case 4:
                System.out.println("Kwiecień ma 30 dni");
                break;
            case 5:
                System.out.println("Maj ma 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec ma 30 dni");
                break;
            case 7:
                System.out.println("Lipiec ma 31 dni");
                break;
            case 8:
                System.out.println("Sierpień ma 31 dni");
                break;
            case 9:
                System.out.println("Wrzesień ma 30 dni");
                break;
            case 10:
                System.out.println("Październik ma 31 dni");
                break;
            case 11:
                System.out.println("Listopad ma 30 dni");
                break;
            case 12:
                System.out.println("Grudzień ma 31 dni");
                break;
            default:
                System.out.println("BŁĄD");
        }

    }

    public static void zad6() {
        System.out.println("Zad 6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();
        System.out.print("Podaj trzecią liczbę: ");
        double c = scanner.nextDouble();
        double liczbaNajmniejsza = a;
        double liczbaSrodkowa = b;
        double liczbaNajwieksza = c;
        if (a > b) {
            liczbaSrodkowa = a;
            liczbaNajmniejsza = b;
        }

        if (liczbaSrodkowa > c) {
            liczbaNajwieksza = liczbaSrodkowa;
            liczbaSrodkowa = c;
        }

        if (liczbaSrodkowa < liczbaNajmniejsza) {
            double pomocnicza = 0.0;
            pomocnicza = liczbaNajmniejsza;
            liczbaNajmniejsza = liczbaSrodkowa;
            liczbaSrodkowa = pomocnicza;
        }

        System.out.println("Liczby od najmniejszej do największej: " + liczbaNajmniejsza + ", " + liczbaSrodkowa + ", " + liczbaNajwieksza);
        System.out.println("Liczby od największej do najmniejszej: " + liczbaNajwieksza + ", " + liczbaSrodkowa + ", " + liczbaNajmniejsza);
    }

    public static void zad7() {
        System.out.println("Zad 7");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar 1 tablicy: ");
        int n = scanner.nextInt();
        System.out.print("Podaj rozmiar 2 tablicy: ");
        int m = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        System.out.println("Wprowadz liczby do 1 tablicy: ");

        for(int i = 0; i < n; ++i) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Wprowadz liczby do 2 tablicy: ");

        for(int i = 0; i < m; ++i) {
            B[i] = scanner.nextInt();
        }

        int iloczynskalarny = 0;

        for(int i = 0; i < n && i < m; ++i) { //liczy iloczyn skalarny tylko do momentu końca jednej z tablic czyli np jak bedzie tablica 4 i5 to skończy liczac wzorem dla 4 i 4
            iloczynskalarny += A[i] * B[i];
        }

        System.out.println("Iloczyn skalarny wynosi: " + iloczynskalarny);
    }

    public static void zad8() {
        System.out.println("Zad 8");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            n *= -1;
        }


        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = n; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = n; i >= 1; --i) {
            int spacje = n - i;

            for(int x = 1; x <= spacje; ++x) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 1; i <= n; ++i) {
            int spacje = n - i;

            for(int x = 1; x <= spacje; ++x) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void palindrom(String charnastring) {
        String odwrocone = new StringBuilder(charnastring).reverse().toString();
        if (charnastring.equals(odwrocone)) {
            System.out.println("Podane słowo jest palindromem");
        } else {
            System.out.println("Podane słowo nie jest palindromem");
        }

    }

    public static void zad9() {
        System.out.println("Zad 9");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wyraz:");
        char[] tab = new char[100];
        int licznik=0;

        for(int i = 0; scanner.hasNext() && i < 100; ++i) {
            tab[i] = scanner.next().charAt(0);
            licznik++;
        }

        for(int j = 0; j < licznik; ++j) {
            System.out.println(tab[j]);
        }

        String charnastring = new String(tab).trim();
        System.out.println(charnastring);
        String odwrocony = new StringBuilder(charnastring).reverse().toString();
        System.out.println(odwrocony);
        palindrom(charnastring);
        System.out.println("Mogą wystąpić problemy po wcisnieciu ctrl+D w pózniejszych programach");
    }

    public static void zad10() {
        System.out.println("Zad 10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy macierzy: ");
        int n = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn macierzy: ");
        int m = scanner.nextInt();
        int[][] A = new int[n][m];
        if (n > 0 && m > 0) {
            System.out.println("Wprowadź elementy macierzy:");


            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < m; ++j) {
                    A[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Transpozycja:");

            for(int i = 0; i < m; ++i) {
                for(int j = 0; j < n; ++j) {
                    System.out.print(A[j][i] + " ");
                }

                System.out.println();
            }
        } else {
            System.out.println("błąd");
        }

    }

    public static boolean isPangram(String zdanie) {
        zdanie = zdanie.toLowerCase().replaceAll("[^a-z]", "");
        char[] tab = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i < tab.length; ++i) {
            char czyZawiera = tab[i];
            if (zdanie.indexOf(czyZawiera) == -1) {  //jeśli nie znajdzie liczby z alfabetu wyrzuca false
                return false;
            }
        }

        return true;
    }

    public static void zad11() {
        System.out.println("zad11");
        Scanner scanner = new Scanner(System.in);
        String zdanie = scanner.nextLine();
        System.out.println(isPangram(zdanie));
    }

    public static double wiek(double wiekLataZiemskie, double x) {
        return  wiekLataZiemskie / x;
    }

    public static void zad12() {
        System.out.println("zad12");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wiek w sekundach: ");
        long  sekundy = scanner.nextLong();
        System.out.println(sekundy);
        System.out.print("Podaj nazwe planety: ");
        scanner.nextLine();
        String nazwa = scanner.nextLine();
        double wiekLataZiemskie = (sekundy/31557600.0);

        nazwa = nazwa.toLowerCase();
        if (nazwa.equals("ziemia")) {
            System.out.printf("Wiek na Ziemi: %.2f lat%n", wiekLataZiemskie);
        } else if (nazwa.equals("merkury")) {
            System.out.printf("Merkury: %.2f lat%n", wiek(wiekLataZiemskie, 0.2408467));
        } else if (nazwa.equals("wenus")) {
            System.out.printf("Wenus: %.2f lat%n", wiek(wiekLataZiemskie, 0.61519726));
        } else if (nazwa.equals("mars")) {
            System.out.printf("Mars: %.2f lat%n", wiek(wiekLataZiemskie, 1.8808158));
        } else if (nazwa.equals("jowisz")) {
            System.out.printf("Jowisz: %.2f lat%n", wiek(wiekLataZiemskie, 11.862615));
        } else if (nazwa.equals("saturn")) {
            System.out.printf("Saturn: %.2f lat%n", wiek(wiekLataZiemskie, 29.447498));
        } else if (nazwa.equals("uran")) {
            System.out.printf("Uran: %.2f lat%n", wiek(wiekLataZiemskie, 84.016846));
        } else if (nazwa.equals("neptun")) {
            System.out.printf("Neptun: %.2f lat%n", wiek(wiekLataZiemskie, 164.79132));
        } else {
            System.out.println("Nieznana planeta");
        }
    }
    public static int MAX(int[] tab, int n) {
        if (n == 1) {
            return tab[0];
        }
        int max = MAX(tab, n-1);
        return Math.max(max, tab[n-1]);
    }

    public static void zad13() {
        System.out.println("zad13");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wielkosc tablicy ");
        int n = scanner.nextInt();
        int[] tab = new int[n];

        for(int i = 0; i < tab.length; ++i) {
            tab[i] = scanner.nextInt();
        }

        System.out.println("Największa liczba:" + MAX(tab, tab.length));
    }
}
