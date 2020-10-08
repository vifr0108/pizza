package frolovv.pizza.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity(name = "kitchen1")
public class Kitchen implements Serializable
{
    private static final long serialVersionUID = -7876568091486693389L;

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "pizza_id")
    private Showcase showcaseId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "food_id")
    private GroceryWarehouse foodId;

}
