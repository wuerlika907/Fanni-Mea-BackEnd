package backEnd.POJO;

import com.google.gson.annotations.SerializedName;

public class RegionPOJO {

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @SerializedName("region_id")
    private  int regionId;
    @SerializedName("region_name")
    private  String regionName;

    public RegionPOJO(){

    }


}
