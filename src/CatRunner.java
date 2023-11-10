public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Sam",8,10);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2= new Cat("Nia",3,8);
        cat2.introduce();
        cat2.printCatInfo();
    }

}
