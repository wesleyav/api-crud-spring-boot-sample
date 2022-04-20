package apicrudspringbootsample.apicrudspringbootsample.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apicrudspringbootsample.apicrudspringbootsample.entities.City;
import apicrudspringbootsample.apicrudspringbootsample.services.CityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "City")
public class CityController {

	@Autowired
	CityService cityService;

	@GetMapping(value = "/cities/", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Endpoint to list cities")
	public List<City> findAll() {
		List<City> lista = cityService.findAll();
		return lista;
	}

	@GetMapping(value = "/cities/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Endpoint to list city by Id")
	public ResponseEntity<City> findById(@PathVariable Long id) {
		Optional<City> optCity = cityService.findById(id);
		if (optCity.isPresent()) {
			return ResponseEntity.ok(optCity.get());
		}
		return ResponseEntity.notFound().build();

	}

	@PostMapping(value = "/cities/", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Endpoint to create city")
	public ResponseEntity<City> create(@RequestBody City city) {
		City obj = cityService.save(city);
		return new ResponseEntity<City>(obj, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/cities/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Endpoint to delete city by Id")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		Optional<City> optCity = cityService.findById(id);
		if (optCity.isPresent()) {
			cityService.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

	@PutMapping(value = "/cities/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Endpoint to update city by Id")
	public ResponseEntity<City> update(@PathVariable Long id, @RequestBody City city) {
		Optional<City> optCity = cityService.findById(id);
		if (optCity.isPresent()) {
			City newCity = new City();
			newCity.setId(optCity.get().getId());
			newCity.setName(city.getName());
			newCity.setLastUpdate(city.getLastUpdate());
			return new ResponseEntity<City>(cityService.save(newCity), HttpStatus.OK);
		} else {
			return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
		}
	}

}
