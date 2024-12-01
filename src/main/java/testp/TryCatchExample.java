package testp;

public class TryCatchExample {
    String name;
    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch (NumberFormatException e) {
            System.out.print("4");
        }finally {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        TryCatchExample name = new TryCatchExample();
        name.name = "9";
        name.parseName();
        System.out.print("5");
    }
}


// instance
// static
// local