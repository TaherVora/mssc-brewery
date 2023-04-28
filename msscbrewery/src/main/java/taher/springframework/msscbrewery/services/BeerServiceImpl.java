package taher.springframework.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import taher.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateDto(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}