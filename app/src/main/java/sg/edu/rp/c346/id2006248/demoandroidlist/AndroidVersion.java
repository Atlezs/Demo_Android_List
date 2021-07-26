package sg.edu.rp.c346.id2006248.demoandroidlist;

public class AndroidVersion {
    private String name;
    private String Version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        Version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    @Override
    public String toString() {
        return name + ": " + Version;
    }
}
