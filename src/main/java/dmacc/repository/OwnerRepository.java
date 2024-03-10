package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Owner;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Mar 10, 2024
 */
@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>{

}
