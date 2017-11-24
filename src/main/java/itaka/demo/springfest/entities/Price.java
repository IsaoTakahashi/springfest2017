package itaka.demo.springfest.entities;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Price {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private int unit;
	private BigDecimal amount;

	@ManyToOne
	@JoinColumn(name = "item_id")
	Item item;
}
