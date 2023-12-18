package org.gof.creational.builder;

public class BuilderLesson {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder()
                .name("Audi")
                .maxSpeed(320)
                .color("black")
                .build();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getMaxSpeed());
        System.out.println(sportCar.getColor());
    }
}

class SportCar {
    private String name;
    private int maxSpeed;
    private String color;

    private SportCar(Builder builder) {
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.color = builder.color;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    static class Builder {
        private String name;
        private int maxSpeed;
        private String color;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }
    }
}
