
public class Car {
  private int yearModel;
  private String make;
  private int speed;

  /**
   * Constructor - create the new employee object using the values from the
   * parameters as listed
   * 
   * @param carYearMod
   *          - The year model of the new car
   * @param carMake
   *          - The make of the new car
   * @param carSpeed
   *          - The starting speed of the new car
   */
  public Car(int carYearMod, String carMake, int carSpeed) {
    yearModel = carYearMod;
    make = carMake;
    speed = carSpeed;
  }
  /**
   * Constructor - create the new employee object using the values from the
   * parameters as listed
   * 
   * @param carYearMod
   *          - The year model of the new car
   * @param carMake
   *          - The make of the new car
   */
  public Car(int carYearMod, String carMake) {
    yearModel = carYearMod;
    make = carMake;
    speed = 0;
  }

  /**
   * No-Arg Constructor - create the new employee object with some default
   * values. Note: these values are for the purpose of the example only and are
   * not particularly sensible values to choose.
   */
  public Car() {
    yearModel = 2016;
    make = "Subaru";
    speed = 50;
  }

  /**
   * @param speedIncrease
   *          - Add speedIncrease units per time to time unit
   */
  public void accelerate(int speedIncrease) {
    speed += speedIncrease;
  }

  /**
   * Add x units per time to time unit
   */
  public void accelerate() {
    speed += 5;
  }

  /**
   * Subtract 5 units per time to time unit
   */
  public void brake() {
    speed -= 5;
  }

  /**
   * @param speedDecrease
   *          - Subtract speedDecrease units per time to time unit
   */
  public void brake(int speedDecrease) {
    speed -= speedDecrease;
  }
  
  /**
   * @return Year Model of car
   */
  public int getYearModel() {
    return yearModel;
  }

  /**
   * @return Make of car
   */
  public String getMake() {
    return make;
  }

  /**
   * @return Speed of car
   */
  public int getSpeed() {
    return speed;
  }
}
