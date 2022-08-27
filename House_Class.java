class House{
   private Kitchen kitchen;
   private DiningRoom diningRoom;
   private  LivingRoom livingRoom;
   private RestRoom restRooms;
   private BedRoom bedRooms;
   private Yard yard;

   public void setKitchen(Kitchen kitchen) {
      this.kitchen = kitchen;
   }
   public Kitchen getKitchen() {
      return kitchen;
   }

   public void setKitchen(DiningRoom diningRoom) {
      this.diningRoom = diningRoom;
   }
   public DiningRoom getDiningRoom() {
      return diningRoom;
   }

   public void setBedRooms(BedRoom bedRooms) {
      this.bedRooms = bedRooms;
   }
   public BedRoom getBedRooms() {
      return bedRooms;
   }

   public void setYard(Yard yard) {
      this.yard = yard;
   }
   public Yard getYard() {
      return yard;
   }
}


public class House_Class {
}
