

class Yard{
    boolean grass;
    int width;
    int height;
    String color;

    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setColor(String color){
        this.color=color;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
}

class Kitchen{
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;

    public void setStove(boolean stove){
        this.stove=stove;
    }
    public void setSink(boolean sink){
        this.sink=sink;
    }
    public void setRefrigerator(boolean refrigerator){
        this.refrigerator=refrigerator;
    }
    public void setOven(boolean oven){
        this.oven=oven;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setWindows(int windows){
        this.windows=windows;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public int getWindows(){
        return windows;
    }
}
class DiningRoom{
    private boolean tv;
    private int windows;
    private int width;
    private int height;
    private String color;
    private int chairsCapacity;

    public void setTv(boolean tv){
        this.tv=tv;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setWindows(int windows){
        this.windows=windows;
    }
    public void setChairsCapacity(int chairsCapacity){
        this.chairsCapacity=chairsCapacity;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public int getWindows(){
        return windows;
    }
    public int getChairsCapacity(){
        return chairsCapacity;
    }
    public boolean getTv(){
        return tv;
    }
}

class LivingRoom{
    private int windows;
    private boolean tv;
    private boolean homeTeather;
    private int width;
    private int height;
    private String color;

    public void setTv(boolean tv){
        this.tv=tv;
    }
    public void setHomeTeather(boolean homeTeather){
        this.homeTeather=homeTeather;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setWindows(int windows){
        this.windows=windows;
    }


    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public int getWindows(){
        return windows;
    }
    public boolean getTv(){
        return tv;
    }
    public boolean getHomeTeather(){
        return tv;
    }
}

class BedRoom{
    BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    public void setTv(boolean tv){
        this.tv=tv;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBedSize(BedSize bedSize) {
        this.bedSize=bedSize;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public boolean getTv() {
        return tv;
    }
    public void bedSize(BedSize queen) {
        this.bedSize = queen;
    }
}

class RestRoom{
    private boolean showerCabin;
    private int width;
    private int height;
    private String color;

    public void setShowerCabin(boolean showerCabin){
        this.showerCabin=showerCabin;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public boolean getShowerCabin() {
        return showerCabin;
    }
}

enum BedSize{
    individual, matrimonial, queen, king;
}

class Street{
    private String name;
    //private List<House> houses;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addHouse(int number, House house){

    }
}

class House{
    Kitchen kitchen;
    DiningRoom diningRoom;
    LivingRoom livingRoom;
    RestRoom[] restRooms;
    BedRoom[] bedRooms;
    Yard yard;
}

public class Main {
    public static void Main(String[] args){
        Kitchen kitchen = new Kitchen();
        DiningRoom diningRoom = new DiningRoom();
        BedRoom bedRoom = new BedRoom();

        kitchen.setStove(true);
        kitchen.setSink(true);
        kitchen.setWindows(1);
        kitchen.setRefrigerator(true);
        kitchen.setOven(false);
        kitchen.setWidth(3);
        kitchen.setHeight(4);
        kitchen.setColor("red");

        diningRoom.setWindows(2);
        diningRoom.setTv(false);
        diningRoom.setWidth(5);
        diningRoom.setHeight(5);
        diningRoom.setColor("white");
        diningRoom.setChairsCapacity(8);

        bedRoom.bedSize(BedSize.queen);
        bedRoom.setTv(false);
        bedRoom.setWidth(5);
        bedRoom.setHeight(5);
        bedRoom.setColor("blue");
    }

}
