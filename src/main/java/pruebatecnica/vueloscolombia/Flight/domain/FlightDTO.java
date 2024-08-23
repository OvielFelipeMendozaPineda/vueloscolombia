package pruebatecnica.vueloscolombia.Flight.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {
    private String departureStation;
    private String arrivalStation;
    private String flightCarrier;
    private String flightNumber;
    private double price;
}
