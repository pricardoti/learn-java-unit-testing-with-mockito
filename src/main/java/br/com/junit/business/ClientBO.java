package br.com.junit.business;

import br.com.junit.business.exception.DifferentCurrenciesException;
import br.com.junit.model.Amount;
import br.com.junit.model.Product;

import java.util.List;

public interface ClientBO {

    Amount getClientProductsSum(List<Product> products)
            throws DifferentCurrenciesException;

}