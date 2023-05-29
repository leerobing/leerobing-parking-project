public class Car {

    private String carModel;
    private String carType; //소형 or 중형 or 대형
    private String carNumber; //차 번호

    private Car() {}

    public static class Builder {

        private String carModel;
        private String carType; //소형 or 중형 or 대형
        private String carNumber; //차 번호

        public Builder setCarModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        public Builder setCarType(String carType) {
            this.carType = carType;
            return this;
        }
        public Builder setCarNumber(String carNumber) {
            this.carNumber = carNumber;
            return this;
        }

        //빌더패턴
        public Car build() {
            Car car = new Car();

            car.carModel = carModel;
            car.carType = carType;
            car.carNumber = carNumber;
            return car;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carType='" + carType + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
