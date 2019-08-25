

public class mainClass {
    public static void main(String[] args) {
        Block b = new frarmeBlock(new finalBlock());
        b.draw();
        System.out.println("--");

        Block c = new frarmeBlock(new fullColorBlock(new finalBlock()));
        c.draw();
        System.out.println("--");
        Block d = new fullColorBlock(new frarmeBlock(new finalBlock()));
        d.draw();
    }
}
