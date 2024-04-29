 class Eagle extends Bird implements Hunter {
     public Eagle(String name, int age, String attributes, double heightOfFlight) {
         super(name, age, attributes, heightOfFlight);
     }

     public String toString (){
         return super.toString() ;
     }

     @Override
     public void Hunt(Prey prey) {
         Animal animal = (Animal) prey ;
         System.out.println(getName() + " hunted " + animal.getName());
     }
 }
