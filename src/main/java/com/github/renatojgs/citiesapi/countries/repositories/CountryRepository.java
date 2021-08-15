package com.github.renatojgs.citiesapi.countries.repositories;

import com.github.renatojgs.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
