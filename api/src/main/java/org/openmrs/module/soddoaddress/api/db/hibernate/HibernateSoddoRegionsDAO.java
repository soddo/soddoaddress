package org.openmrs.module.soddoaddress.api.db.hibernate;
import java.util.List;
import org.hibernate.SessionFactory;
import org.openmrs.module.soddoaddress.SoddoRegions;
import org.openmrs.module.soddoaddress.api.db.SoddoRegionsDAO;


public class HibernateSoddoRegionsDAO  implements SoddoRegionsDAO {
        private SessionFactory sessionFactory;
        /**
        * @param sessionFactory the sessionFactory to set
        */
        public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        }
        /**
        * @return the sessionFactory
        */
        public SessionFactory getSessionFactory() {
        return sessionFactory;
        }
        @Override
        public List<SoddoRegions> getAllRegions() {
        return sessionFactory.getCurrentSession().createCriteria(SoddoRegions.class).list();
        }
        @Override
        public SoddoRegions getRegion(Integer id) {
        return (SoddoRegions) sessionFactory.getCurrentSession().get(SoddoRegions.class, id);
        }
        @Override
        public SoddoRegions saveRegion(SoddoRegions soddoRegions) {
        sessionFactory.getCurrentSession().save(soddoRegions);
        return soddoRegions;
        }
        @Override
        public void purgeRegion(SoddoRegions soddoRegions) {
        sessionFactory.getCurrentSession().delete(soddoRegions);
        }
}
