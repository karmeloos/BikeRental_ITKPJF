package bikerental.resources;

import bikerental.model.Station;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Stations implements IStations {
    private List<Station> stations = new LinkedList<>();

    private Station findBikeInStation(long bikeId) {
        Optional<Station> station = stations.stream()
                .filter(b -> b.getBikes().equals(bikeId))
                .findAny();
        return station.get();
    }

    //TODO :: zastosować zasade DEMETER
    @Override
    public boolean lockout(long bikeId) {
        Station bikeInStation = findBikeInStation(bikeId);
        bikeInStation.getBikes().remove(bikeId);
        return bikeInStation.getBikes().contains(bikeId);
    }

}
