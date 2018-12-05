/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr16;

import entity.Buyer;
import entity.Product;
import entity.Purchase;
import interfaces.Saveble;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class SaverToBase implements Saveble{
    private final EntityManager em;
    private final EntityTransaction tx;

    public SaverToBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShopPTVR16PU");
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }

    @Override
    public void saveBuyers(List<Buyer> buyers) {
        int n = buyers.size();
        this.tx.begin();
        for (int i = 0; i < n; i++) {
            if (buyers.get(i).getId() == null) {
                em.persist(buyers.get(i));
            } else {
                em.merge(buyers.get(i));
            }
        }
        this.tx.commit();
    }

    @Override
    public void saveProducts(List<Product> products) {
        int n = products.size();
        this.tx.begin();
        for (int i = 0; i < n; i++) {
            if (products.get(i).getId() == null) {
                em.persist(products.get(i));
            } else {
                em.merge(products.get(i));
            }
        }
        this.tx.commit();
    }

    @Override
    public void saveHistories(List<Purchase> purchases) {
        int n = purchases.size();
        this.tx.begin();
        for (int i = 0; i < n; i++) {
            if (purchases.get(i).getId() == null) {
                em.persist(purchases.get(i));
            } else {
                em.merge(purchases.get(i));
            }

        }
        this.tx.commit();
    }

    @Override
    public List<Product> loadProducts() {
        try {
            return em.createQuery("SELECT p FROM Product p").getResultList();
        } catch (Exception e) {
            return new ArrayList<Product>();
        }
    }

    @Override
     public List<Buyer> loadBuyers() {
        try {
            return em.createQuery("SELECT b FROM Buyer b").getResultList();
        } catch (Exception e) {
            return new ArrayList<Buyer>();
        }
    }


    @Override
     public List<Purchase> loadPurchase() {
        try {
            return em.createQuery("SELECT p FROM Purchase p").getResultList();
        } catch (Exception e) {
            return new ArrayList<Purchase>();
        }
    }

    

}
