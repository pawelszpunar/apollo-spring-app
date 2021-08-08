package com.michalszalkowski.module.car;

import com.michalszalkowski.module.car.dto.CarDto;
import com.michalszalkowski.module.car.mapper.CarMapper;
import com.michalszalkowski.module.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

	@Autowired
	private CarService carService;

	@GetMapping(value = "/api/car/{id}")
	public CarDto getCar(@PathVariable long id) {
		return CarMapper.map(carService.getOne(id));
	}

	@GetMapping("/api/car")
	public List<CarDto> getCars() {
		return CarMapper.map(carService.getAll());
	}

}
