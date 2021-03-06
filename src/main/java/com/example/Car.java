package com.example;

import am.ik.yavi.builder.ValidatorBuilder;
import am.ik.yavi.core.Validator;

public class Car {
	private final String manufacturer;

	private final String licensePlate;

	private final int seatCount;

	public static final Validator<Car> validator = ValidatorBuilder.<Car>of()
			.constraint(Car::getManufacturer, "manufacturer", c -> c.notNull())
			.constraint(Car::getLicensePlate, "licensePlate", c -> c.notNull().greaterThanOrEqual(2).lessThanOrEqual(14))
			.constraint(Car::getSeatCount, "seatCount", c -> c.greaterThanOrEqual(2))
			.build();

	public Car(String manufacturer, String licencePlate, int seatCount) {
		this.manufacturer = manufacturer;
		this.licensePlate = licencePlate;
		this.seatCount = seatCount;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public int getSeatCount() {
		return seatCount;
	}
}
