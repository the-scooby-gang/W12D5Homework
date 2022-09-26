import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {
    CrewMember crewMember;
    Pilot pilot;
    @Before
    public void before(){
        crewMember = new CrewMember("Daniel", CrewMemberType.CAPTAIN);
        pilot = new Pilot("Aimee", CrewMemberType.FIRSTOFFICER, "HUN4382");
    }

    @Test
    public void canGetCrewName(){
        assertEquals("Daniel", crewMember.getName());
    }

    @Test
    public void canGetPilotName(){
        assertEquals("Aimee", pilot.getName());
    }

    @Test
    public void canGetPilotLicenceNumber(){
        assertEquals("HUN4382", pilot.getPilotLicenceNumber());
    }

    @Test
    public void canGetCrewRank(){
        assertEquals (CrewMemberType.CAPTAIN, crewMember.getRank());
    }

    @Test
    public void canGetPilotRank(){
        assertEquals(CrewMemberType.FIRSTOFFICER, pilot.getRank());
    }
}
