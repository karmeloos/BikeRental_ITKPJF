package bikerental.resources;

import bikerental.model.Bike;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Bikes {
    private List<Bike> bikes;
}
