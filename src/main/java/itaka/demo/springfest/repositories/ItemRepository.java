package itaka.demo.springfest.repositories;

import itaka.demo.springfest.entities.Item;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {
}
