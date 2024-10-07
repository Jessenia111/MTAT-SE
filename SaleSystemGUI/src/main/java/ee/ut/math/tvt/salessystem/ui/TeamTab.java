package ee.ut.math.tvt.salessystem.ui;

public class TeamTab {
    private String name;
    private String image;
    private String email;

    private String leader;

    private String members;


    public TeamTab(String name, String image, String email, String leader, String members) {
        this.name = name;
        this.image = image;
        this.email = email;
        this.leader = leader;
        this.members = members;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

}
