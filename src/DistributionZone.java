public class DistributionZone {
    String zoneNum;
    String name;

    public DistributionZone(String zoneNum, String name) {
        this.zoneNum = zoneNum;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + "DistributionZone{" +
                "zoneNum='" + zoneNum + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getZoneNum() {
        return zoneNum;
    }

    public void setZoneNum(String zoneNum) {
        this.zoneNum = zoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
