package frolovv.pizza.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity(name = "grocery_warehouse1")
//TODO: need to move at additional module or project
public class GroceryWarehouse implements Serializable
{
    private static final long serialVersionUID = -7131835024031674855L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "food_id")
    private String id;

    @Column(name = "food_name")
    private String name;

}
