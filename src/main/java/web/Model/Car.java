package web.Model;

public class Car {
    private String model;
    private int number;
    private String carBrand;
    private final Integer idCar;
    private static Integer generateId = 1;

    public Car(String model, int number, String carBrand) {
        this.model = model;
        this.number = number;
        this.carBrand = carBrand;
        idCar = generateId++;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public static void setIdCar(Integer number) {
        if (generateId >= number) generateId = 1;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "   Model = " + model +
                "  Number = " + number +
                "  Car Brand = " + carBrand + "   ";
    }
}
