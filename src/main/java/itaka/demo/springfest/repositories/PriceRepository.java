package itaka.demo.springfest.repositories;

import itaka.demo.springfest.entities.Price;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PriceRepository extends PagingAndSortingRepository<Price, Long> {
}
