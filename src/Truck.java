public class Truck extends Transport implements Service{
     public Truck(String modelName,int wheelsCount){

         if (modelName.isBlank()|| modelName.isEmpty()){
             this.modelName = "model";
         } else {
             this.modelName = modelName;
         }
         this.wheelsCount = Math.abs(wheelsCount);
     }

    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    protected void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void service() {
        System.out.println("Поменяли покрышки, проверили двигатель и прицеп");
    }
}
