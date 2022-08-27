class Kitchen{
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;

    Kitchen(int windows) {this.windows = windows;}
    public int getWindows() {return windows;}

    Kitchen(boolean stove){this.stove = stove;}
    public boolean getStove() {return stove;}
/*
    isStove(boolean sink){this.sink = sink;}
    public boolean getSink() {return sink;}


    Kitchen(boolean refrigerator){this.refrigerator = refrigerator;}
    public boolean getRefrigerator() {return refrigerator;}

    Kitchen(boolean oven){this.oven = oven;}
    public boolean getOven() {return oven;}

    Kitchen(int width){this.width = width;}
    public int getWidth() {return width;}

    Kitchen(int height){this.height = height;}
    public int getHeight() {return height;}
  */
    Kitchen(String color){this.color = color;}
    public String getColor() {return color;}

}

public class KitchenBuilder {
    public static void kitchenBuilder(String[] args){

        Kitchen r1Windows = new Kitchen(1);
        Kitchen trueStove = new Kitchen(true);
        BedRoom rcolor = new BedRoom("red");

        System.out.println(r1Windows.getWindows());
        System.out.println(trueStove.getWindows());
        System.out.println(rcolor.getColor());
    }
}
