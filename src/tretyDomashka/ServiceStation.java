package tretyDomashka;

public class ServiceStation {
    private  String modelName;
    private  int wheelsCount;

    public ServiceStation(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
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



public ServiceStation(){

}

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();

            }
        }
    }



}
