package facades;

import entities.Account;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Daniel Szabo
 */
@Local
public interface AccountFacadeLocal {

    void create(Account account);

    void edit(Account account);

    void remove(Account account);

    Account find(Object id);

    List<Account> findAll();

    List<Account> findRange(int[] range);
    
    List<Account> getNotDestroyByUser(Long id);
    
    List<Account> getAllNotDestroy();
    
    List<Account> getAllByUser(Long id);

    int count();
    
}
