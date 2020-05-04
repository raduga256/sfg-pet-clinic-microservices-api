package guru.raduga256.sfgpetclinic.repository;

import guru.raduga256.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
