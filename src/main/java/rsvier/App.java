package rsvier;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("testPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Baas baas = new Baas();
        Postcode postcode = new Postcode(1234, "AD");
        Adres adres = new Adres("straat", 2, "plaats", postcode);
        baas.setAdres(adres);
        
        et.begin();
        em.persist(baas);
        et.commit();
        em.clear();
    }
}
