package ivt5.omgtu.v1;

public class Rectangle extends Point {
    private Point leftTop;
    private Point rightBotton;
    private int xLeft, xRight, yTop, yBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBotton = rightBottom;
    }

    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
        this.leftTop = new Point(xLeft, yTop);
        this.rightBotton = new Point(xRight, yBottom);
    }

    public Rectangle(int length, int width) {
        this.leftTop = new Point(0, 0);
        this.rightBotton = new Point(length, width);
    }

    public Rectangle() {
        this(1, 1);
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public Point getRightBotton() {
        return rightBotton;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    public void setRightBotton(Point rightBotton) {
        this.rightBotton = rightBotton;
    }

    public int getLength() {
        return rightBotton.getX() - leftTop.getX();
    }

    public int getWidth() {
        return rightBotton.getY() - leftTop.getY();
    }

    public void moveTo(int x, int y) {
        int width = getWidth();
        int height = getLength();
        leftTop = new Point(x, y);
        rightBotton = new Point(x + width, y + height);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        moveTo(leftTop.getX() + dx, leftTop.getY() + dy);
    }

    public void resize(double ratio) {
        int newLength = (int)(getLength() * ratio);
        int newWidth = (int)(getWidth() * ratio);
        rightBotton = new Point(leftTop.getX() + newLength, leftTop.getY() + newWidth);
    }

    public void stretch(double xRatio, double yRatio) {
        int newLength = (int)(getLength() * xRatio);
        int newWidth = (int)(getWidth() * yRatio);
        rightBotton = new Point(leftTop.getX() + newLength, leftTop.getY() + newWidth);
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public boolean isInside(int x, int y) {
        return (x >= leftTop.getX() && x <= rightBotton.getX() &&
                y >= leftTop.getY() && y <= rightBotton.getY());
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Rectangle rectangle) {
        return (leftTop.getX() <= rectangle.rightBotton.getX() &&
                rightBotton.getX() >= rectangle.leftTop.getX() &&
                leftTop.getY() <= rectangle.rightBotton.getY() &&
                rightBotton.getY() >= rectangle.leftTop.getY());
    }

    public boolean isInside(Rectangle rectangle) {
        return isInside(rectangle.leftTop) && isInside(rectangle.rightBotton);
    }

}

