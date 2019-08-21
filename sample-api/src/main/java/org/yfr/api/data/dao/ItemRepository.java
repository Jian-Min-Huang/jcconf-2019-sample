package org.yfr.api.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.yfr.api.data.entity.Item;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {
}
