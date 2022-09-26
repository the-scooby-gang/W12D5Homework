public class Pilot {
    private String name;
    private CrewMemberType rank;
    private String pilotLicenceNumber;

    public Pilot(String name, CrewMemberType rank, String pilotLicenceNumber) {
        this.name = name;
        this.rank = rank;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CrewMemberType getRank() {
        return rank;
    }

    public void setRank(CrewMemberType rank) {
        this.rank = rank;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public void setPilotLicenceNumber(String pilotLicenceNumber) {
        this.pilotLicenceNumber = pilotLicenceNumber;
    }
}
