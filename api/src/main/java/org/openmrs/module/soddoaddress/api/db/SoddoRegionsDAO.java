package org.openmrs.module.soddoaddress.api.db;

import java.util.List;

import org.openmrs.module.soddoaddress.SoddoRegions;

public interface SoddoRegionsDAO {
	public List<SoddoRegions> getAllRegions();
	
	SoddoRegions getRegion(Integer id);
	
	SoddoRegions saveRegion(SoddoRegions soddoRegions);
	
	void purgeRegion(SoddoRegions soddoRegions);
}

