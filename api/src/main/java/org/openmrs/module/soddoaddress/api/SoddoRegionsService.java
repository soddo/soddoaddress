package org.openmrs.module.soddoaddress.api;

import java.util.List;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.soddoaddress.SoddoRegions;
import org.springframework.transaction.annotation.Transactional;

public interface SoddoRegionsService extends OpenmrsService{

	
	@Transactional(readOnly = true)
    public List<SoddoRegions> getAllRegions();
	
	@Transactional (readOnly = true)
	SoddoRegions getRegion(Integer id);
	
	SoddoRegions saveRegion(SoddoRegions soddoRegions);
	
	void purgeRegion(SoddoRegions soddoRegions);

}

