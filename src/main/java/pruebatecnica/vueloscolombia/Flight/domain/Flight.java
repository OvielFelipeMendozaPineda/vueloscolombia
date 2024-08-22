package pruebatecnica.vueloscolombia.Flight.domain;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pruebatecnica.vueloscolombia.Journey.domain.Journey;
import pruebatecnica.vueloscolombia.Transport.domain.Transport;

/**
 * Flight
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Transport transport;
    private String origin;
    private String destination;
    private Long price;

    @ManyToMany(mappedBy = "flights")
    private List<Journey> journeys;
}