/**
 * 
 */
package es.discoteca.bbdd.dao;

import java.util.List;

/**
 * @author dsblanco
 *
 */
public interface JpaDao<K, E> {

    Long countAll();

    List<E> findAll();

    List<E> findAllPaginate(int first, int pageSize, String orderBy);

    E findById(final K id) ;

    E flush(final E entity);

    E merge(final E entity) ;

    void persist(final E entity);

    void refresh(final E entity);

    void remove(final E entity);

    Integer removeAll();
}
