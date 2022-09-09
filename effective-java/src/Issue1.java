import java.sql.Date;

public class Issue1 {

    public static class Car {
        private String name;
        private String codeName;

        private Car(String name, String codeName) {
            this.name = name;
            this.codeName = codeName;
        }

        public Car(String name) {
            this.name = name;
        }

        static Car createByName(String name) {
            return new Car(name);
        }

        static Car createByCodeName(String codeName) {
            return new Car(codeName);
        }
    }

    static class CarFactory {
        public static CarFactory benz() {
            return new Benz();
        }
        public static CarFactory bmw() {
            return new Bmw();
        }
        public static CarFactory kia() {
            return new Kia();
        }
    }

    static class Benz extends CarFactory { }
    static class Bmw extends CarFactory { }
    static class Kia extends CarFactory { }

    public static void main(String[] args) {
        Car car0 = new Car("소나타", "x-123");
        Car car1 = Car.createByCodeName("x-123");
        Car car2 = Car.createByName("소나타");
    }
}
