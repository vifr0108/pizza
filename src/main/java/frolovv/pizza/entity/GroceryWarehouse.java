package frolovv.pizza.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity(name = "grocery_warehouse1")
public class GroceryWarehouse implements Serializable
{
    private static final long serialVersionUID = -7131835024031674855L;

    @Id
    @GeneratedValue
    @Column(name = "food_id")
    private Long id;

    @Column(name = "food_name")
    private String name;

}
