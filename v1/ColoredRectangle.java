package ivt5.omgtu.v1;


public class ColoredRectangle extends Rectangle{
    private int xLeft, xRight, yTop, yBottom, color;
    private Point leftTop;
    private Point rightBottom;

   public ColoredRectangle(Point leftTop, Point rightBottom, int color){
       super(leftTop,rightBottom);
       this.color = color;
  }
  public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, int color){
      super(xLeft,yTop,xRight,yBottom);
      this.color = color;
      }
    public ColoredRectangle(int length, int width, int color){
        super(length,width);
        this.color = color;
    }
    public ColoredRectangle(int color){
       super();
       this.color = color;
    }
    public ColoredRectangle(){
       super();
       this.color = 1;
    }
    public int getColor(){
       return this.color;
    }
    public void setColor(int color){
       this.color = color;
    }
}
