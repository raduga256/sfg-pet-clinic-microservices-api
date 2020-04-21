package guru.raduga256.sfgpetclinic.services;

import guru.raduga256.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);


}
