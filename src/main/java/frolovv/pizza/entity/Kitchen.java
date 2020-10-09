package frolovv.pizza.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity(name = "kitchen1")
//TODO: need to move at additional module or project
public class Kitchen implements Serializable
{
    private static final long serialVersionUID = -7876568091486693389L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @ManyToOne(optional = false) //TODO: remove due to microservice
    @JoinColumn(name = "pizza_id") //TODO: remove due to microservice
    private Showcase showcaseId;

    @ManyToOne(optional = false) //TODO: remove due to microservice
    @JoinColumn(name = "food_id") //TODO: remove due to microservice
    private GroceryWarehouse foodId;

}