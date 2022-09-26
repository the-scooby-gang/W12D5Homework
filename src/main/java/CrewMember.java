public class CrewMember {
    private String name;
    private CrewMemberType rank;

    public CrewMember(String name, CrewMemberType rank) {
        this.name = name;
        this.rank = rank;
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
}

