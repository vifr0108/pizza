package frolovv.pizza.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @GeneratedValue
    @Column(name = "pizza_id")
    private Long id;
    @Column(name = "pizza_name")
    private String name;
    @Column(name = "number")
    private Integer number;
    @Column(name = "capacity")
    private Integer capacity;

    @Override
    public String toString(){
        return "showcase1{" + "pizza_id=" + id
                + ", pizza_name=" + name
                + ", number=" + number
                + ", capacity=" + capacity + '\''+'}';
    }
}
