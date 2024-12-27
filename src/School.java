import java.util.*;

public class School {
    private List<Object> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Object member) {
        if (member instanceof Student || member instanceof Teacher) {
            members.add(member);
        } else {
            System.out.println("Invalid member type. Only Student or Teacher can be added.");
        }
    }

    public List<Object> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("School Members:\n");
        for (Object member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }
}
