package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerInvalidStockException extends Exception {

    public BeerInvalidStockException(Long id, int quantityToDecrease) {
        super(String.format("The decrement informed for the Beer with the %s ID is invalid, as decreasing %s from the stock would render a number lower than zero.", id, quantityToDecrease));
    }
}
