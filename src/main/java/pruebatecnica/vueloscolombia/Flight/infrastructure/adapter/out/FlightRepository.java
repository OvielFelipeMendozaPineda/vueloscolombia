package pruebatecnica.vueloscolombia.Flight.infrastructure.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;

import pruebatecnica.vueloscolombia.Flight.application.port.out.FlightRepositoryPort;
import pruebatecnica.vueloscolombia.Flight.domain.Fligh;

/**
 * FlightRepository
 */
public interface FlightRepository extends JpaRepository<Fligh, Long>, FlightRepositoryPort {

    
}