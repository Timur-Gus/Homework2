// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        var friend = 19;
        System.out.println(friend);
        friend -= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var x = boxer2 + boxer1;
        System.out.println("Общая масса бойцов: " + x);
        var y = boxer2 - boxer1;
        System.out.println("Разница между массами бойцов: " + y);

    }
}