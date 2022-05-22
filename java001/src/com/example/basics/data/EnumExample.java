package com.example.basics.data;

public class EnumExample {

    enum SoundVolume { LOW, MEDIUM, HIGH, VERY_HIGH, EXTRA_HIGH};
    enum CarVariant {SEDAN, COMBI, JEEP, CABRIOLET, SUPER_CAR}

    public static void main(String[] args) {
        SoundVolume phoneSound = SoundVolume.LOW;
        System.out.println(phoneSound);

        CarVariant carType = CarVariant.CABRIOLET;
        System.out.println(carType);

    }
}
