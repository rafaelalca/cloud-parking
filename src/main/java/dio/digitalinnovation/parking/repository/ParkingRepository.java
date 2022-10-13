package dio.digitalinnovation.parking.repository;

import dio.digitalinnovation.parking.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {


}
