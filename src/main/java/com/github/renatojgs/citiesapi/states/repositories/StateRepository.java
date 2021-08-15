package com.github.renatojgs.citiesapi.states.repositories;

import com.github.renatojgs.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
