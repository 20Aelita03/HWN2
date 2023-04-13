public class Car extends ServiceStation implements Service {
    public Car(String modelName,int wheelsCount){
        if (modelName.isBlank()|| modelName.isEmpty()){
            this.modelName = "model";
        } else {
            this.modelName = modelName;
        }
        this.wheelsCount = Math.abs(wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
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
        System.out.println("Поменяли покрышки и проверили двигатель");

    }
}
