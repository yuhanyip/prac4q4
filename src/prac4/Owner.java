package prac4;


public class Owner {
   private String name;
   private String ic_Number;
   
   public Owner(String name, String icNumber)
   {
       this.name = name;
       this.ic_Number =icNumber ;
   }
   
   public String toString(){
       return String.format("%15s %15s",name,ic_Number);
   }
        


}

   