public class colorDecorator implements Block {

    private Block b;

    protected colorDecorator(Block b) {
        this.b = b;
    }

    @Override
    public void draw() {
        b.draw();
    }
}
