package pruebatecnica.vueloscolombia.Transport.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Transport
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String flightCarrier;
    private String flightNumber;
}