public class fullColorBlock extends colorDecorator {

    public fullColorBlock(Block b) {
        super(b);
    }

    @Override
    public void draw() {

        System.out.println("full color");
        super.draw();
    }

}
