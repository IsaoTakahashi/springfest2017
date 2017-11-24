package itaka.demo.springfest.repositories;

import itaka.demo.springfest.entities.Shop;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ShopRepository extends PagingAndSortingRepository<Shop, Long> {

	public List<Shop> findByName(@Param("name") String name);

}
