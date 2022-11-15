/**
   The Car class holds data about a car.
*/

public class Car
{
   // Fields
   private String make;        // Make 
   private String model;       // Model
   private int year;           // Year of Manufacture
   
   /**
      Constructor
      @param mak The car's make.
      @param mod The car's model number.
      @param year The car's year of manufacture.
   */
   
   public Car(String mak, String mod, int yr)
   {
      make = mak;
      model = mod;
      year = yr;
   }
   
   /**
      The setMake method sets the car's
      make.
      @param mak The car's make.
   */
   
   public void setMake(String mak)
   {
      make = mak;
   }

   /**
      The setModel method sets the car's
      model number.
      @param mod The car's model number.
   */
   
   public void setMod(String mod)
   {
      model = mod;
   }
   
   /**
      The setYear method sets the car's
      year of manufacture.
      @param yr The car's year.
   */
   
   public void setYear(int yr)
   {
      year = yr;
   }

   /**
      getMake method
      @return The name of the car's make.
   */
   
   public String getMake()
   {
      return make;
   }
   
   /**
      getModel method
      @return The car's model number.
   */
   
   public String getModel()
   {
      return model;
   }
   
   /**
      getYear method
      @return The car's year.
   */
   
   public int getYear()
   {
      return year;
   }
}