import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private CrewMember crewMember;
    private CrewMember crewMember1;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, CrewMember crewMember, CrewMember crewMember1, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.crewMember = crewMember;
        this.crewMember1 = crewMember1;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public CrewMember getCrewMember() {
        return crewMember;
    }

    public void setCrewMember(CrewMember crewMember) {
        this.crewMember = crewMember;
    }

    public CrewMember getCrewMember1() {
        return crewMember1;
    }

    public void setCrewMember1(CrewMember crewMember1) {
        this.crewMember1 = crewMember1;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
