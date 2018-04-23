package database;

import beans.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDB {
    
    private static final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TOBAPU");
    
    /**
     * Get the user that has the username
     */
    public static User getUserByUsername(String username) {
        EntityManager entityManager = emFactory.createEntityManager();
        User user = entityManager.find(User.class, username);
        return user;
    }
    
    /**
     * Add a new user
     */
    public static void insert(User user) {
        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        
        transaction.begin();
        entityManager.merge(user);
        transaction.commit();
    }
}
