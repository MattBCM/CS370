package Class_2;

public class A implements Draw{
    /*
    public void drawA(){
        System.out.println("Drawing Object A");
    }
*/
    @Override
    public void draw() {
        System.out.println("drawing class A" + this.getClass());
    }
}
