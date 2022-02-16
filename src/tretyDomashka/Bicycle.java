package tretyDomashka;

public class Bicycle extends ServiceStation {
    private  String modelName;
    private  int wheelsCount;


    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public Bicycle(){

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
