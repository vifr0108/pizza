package frolovv.pizza.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
//@NoArgsConstructor
@Entity(name = "showcase1")
public class Showcase implements Serializable
{
    private static final long serialVersionUID = -6356400530894088781L;

    Showcase() {
    }

    public Showcase(String name){
        this.name = name;
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "pizza_id")
    private String id;
    @Column(name = "pizza_name")
    private String name;
    @Column(name = "number")
    private Integer number;

}
