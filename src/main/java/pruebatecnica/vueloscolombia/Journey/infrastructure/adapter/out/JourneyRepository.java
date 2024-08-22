package pruebatecnica.vueloscolombia.Journey.infrastructure.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;

import pruebatecnica.vueloscolombia.Journey.application.port.out.JourneyRepositoryPort;
import pruebatecnica.vueloscolombia.Journey.domain.Journey;

/**
 * JourneyRepository
 */
public interface JourneyRepository extends JpaRepository<Journey, Long>, JourneyRepositoryPort {

    
}