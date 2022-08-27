class BedRoom{
    private Bedsize bedsize;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    BedRoom(boolean tv) {
        this.tv = tv;
    }
    public boolean getTv() {
        return tv;
    }

    BedRoom(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
/*
    BedRoom(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
*/
    BedRoom(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

}

enum Bedsize{
    individual, matrimonial, king, queen;
}



public class BedRoomBuilder {
    public static void DiningBuilder(String[] args){

        BedRoom falseTv = new BedRoom(false);
        BedRoom r5Width = new BedRoom(5);
        BedRoom bcolor = new BedRoom("blue");

        System.out.println(falseTv.getTv());
        System.out.println(r5Width.getWidth());
        System.out.println(bcolor.getColor());
    }
}
