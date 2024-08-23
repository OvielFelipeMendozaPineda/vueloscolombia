package pruebatecnica.vueloscolombia.Flight.infrastructure.adapter.in;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebatecnica.vueloscolombia.Flight.application.service.FlightService;
import pruebatecnica.vueloscolombia.Flight.domain.FlightDTO;

/**
 * FlightController
 */
@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/getAll")
    public List<FlightDTO> getAllFlights() {
        return flightService.getAllFlights();
    }
}