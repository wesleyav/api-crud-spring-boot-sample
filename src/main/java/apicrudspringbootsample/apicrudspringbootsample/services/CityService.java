package apicrudspringbootsample.apicrudspringbootsample.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import apicrudspringbootsample.apicrudspringbootsample.entities.City;
import apicrudspringbootsample.apicrudspringbootsample.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	CityRepository cityRepository;

	public List<City> findAll() {
		return cityRepository.findAll();
	}

	public Optional<City> findById(Long id) {
		return Optional.ofNullable(cityRepository.findById(id).orElse(null));
	}

	public City save(City city) {
		return cityRepository.save(city);
	}

	public void deleteById(@PathVariable Long id) {
		cityRepository.deleteById(id);
	}
}
