package org.openmrs.module.soddoaddress.api.impl;

import java.util.List;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.runtime.log.Log;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.soddoaddress.SoddoRegions;
import org.openmrs.module.soddoaddress.api.SoddoRegionsService;
import org.openmrs.module.soddoaddress.api.db.SoddoRegionsDAO;

public class SoddoRegionsServiceImpl extends BaseOpenmrsService implements SoddoRegionsService {
	private SoddoRegionsDAO dao;
    /**
     * @param dao the dao to set
     */
    public void setDao(SoddoRegionsDAO dao) {
            this.dao = dao;
    }
    /**
     * @return the dao
     */
    public SoddoRegionsDAO getDao() {
            return dao;
    }
    
	@Override
	public List<SoddoRegions> getAllRegions() {
		return dao.getAllRegions();
	}

	@Override
	public SoddoRegions getRegion(Integer id) {
		return dao.getRegion(id);
	}

	@Override
	public SoddoRegions saveRegion(SoddoRegions soddoRegions) {
		return dao.saveRegion(soddoRegions);
	}

	@Override
	public void purgeRegion(SoddoRegions soddoRegions) {
		dao.purgeRegion(soddoRegions);
	}
}
