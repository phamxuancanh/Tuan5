package observer;

public class Main {
    public static void main(String[] args) {
        CoPhieu coPhieu1 = new CoPhieu();
        NhaDauTu nhaDauTu1 = new NhaDauTu("canh");
        NhaDauTu nhaDauTu2 = new NhaDauTu("hieu");

        coPhieu1.attach(nhaDauTu1);
        coPhieu1.attach(nhaDauTu2);

        coPhieu1.setPrice(1250);
        nhaDauTu1.updates(coPhieu1);
    }
}
