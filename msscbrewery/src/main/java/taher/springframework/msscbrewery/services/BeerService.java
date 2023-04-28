package taher.springframework.msscbrewery.services;

import taher.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateDto(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}