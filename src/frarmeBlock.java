public class frarmeBlock extends colorDecorator {

    public frarmeBlock(Block b) {
        super(b);
    }

    @Override
    public void draw() {
        System.out.println("frame");
        super.draw();
    }

}
