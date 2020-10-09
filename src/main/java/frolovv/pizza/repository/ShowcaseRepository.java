package frolovv.pizza.repository;

import frolovv.pizza.entity.Showcase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "pizzatable", path = "pizzatable")
public interface ShowcaseRepository extends JpaRepository<Showcase, Long>
{
    List<Showcase> findByName(@Param("name") String name);
}
