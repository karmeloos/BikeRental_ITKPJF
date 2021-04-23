package bikerental.resources;

public interface IStations {
    //TODO :: zastosować zasade DEMETER
    boolean lockout(long bikeId);
}
