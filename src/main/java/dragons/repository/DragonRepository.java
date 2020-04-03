package dragons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dragons.beans.Dragon;

@Repository
public interface DragonRepository extends JpaRepository<Dragon, Long>{

}
