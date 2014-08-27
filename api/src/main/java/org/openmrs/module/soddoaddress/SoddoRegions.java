package org.openmrs.module.soddoaddress;

public class SoddoRegions {
	private Integer id;
	private String regionName;
	
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SoddoRegions() {
    }    // used by hibernate
    
    public String regionName() {
        return regionName;
    }

    public void regionName(String regionName) {
        this.regionName = regionName;
    }

}