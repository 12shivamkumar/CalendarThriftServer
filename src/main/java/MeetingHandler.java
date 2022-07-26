import org.apache.thrift.TException;
import org.example.CalendarThriftConfiguration.*;
import java.util.List;

public class MeetingHandler implements MeetingSvc.Iface
{
    @Override
    public String isAlive() throws TException {
        return "Alive";
    }

    @Override
    public boolean cancelMeetingOfRemovedEmployee(String s) throws TException {
        return false;
    }

    @Override
    public boolean updateStatusOfRemovedEmployee(String s) throws TException {
        return false;
    }

    @Override
    public List<String> checkEmployeeAvailability(EmployeeAvailabilityDataRequest employeeAvailabilityDataRequest) throws TException {
        return null;
    }

    @Override
    public String addMeetingDetails(MeetingDetails meetingDetails) throws TException {
        return null;
    }

    @Override
    public boolean addEmployeeMeetingStatus(List<EmployeeStatusDataRequest> list) throws TException {
        return false;
    }

    @Override
    public int findFreeMeetingRoom(FindFreeMeetingRoomDataRequest findFreeMeetingRoomDataRequest) throws TException {
        return 0;
    }

    @Override
    public boolean meetingRoomAvailable(MeetingRoomAvailableDataRequest meetingRoomAvailableDataRequest) throws TException {
        return false;
    }
}
