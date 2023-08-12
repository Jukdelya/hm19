package lesson35;

interface Book{
    public void study();
}
public class Anonim {
    public static void main(String[] args){
        Book book = new Book() {
            @Override
            public void study() {
                System.out.println("Someone is studying");
            }
        };

        book.study();
    }
}