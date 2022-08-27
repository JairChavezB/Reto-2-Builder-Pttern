class DiningRoom{
    private int windows;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    DiningRoom(int windows) {
        this.windows = windows;
    }
    public int getWindows() {
        return windows;
    }


    DiningRoom(boolean tv) {
        this.tv = tv;
    }
    public boolean getTv() {
        return tv;
    }
/*
    DiningRoom(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
*/
    DiningRoom(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

}

public class DiningBuilder{
    public static void DiningBuilder(String[] args){

        DiningRoom r1Windows = new DiningRoom(2);
        DiningRoom falseTv = new DiningRoom(false);
        DiningRoom bcolor = new DiningRoom("white");

        System.out.println(r1Windows.getWindows());
        System.out.println(falseTv.getTv());
        System.out.println(bcolor.getColor());
    }
}
