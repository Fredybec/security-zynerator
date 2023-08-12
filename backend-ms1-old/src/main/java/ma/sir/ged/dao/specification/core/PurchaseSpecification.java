package  ma.sir.ged.dao.specification.core;

import ma.sir.ged.zynerator.specification.AbstractSpecification;
import ma.sir.ged.dao.criteria.core.PurchaseCriteria;
import ma.sir.ged.bean.core.Purchase;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaseSpecification extends  AbstractSpecification<PurchaseCriteria, Purchase>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("purchaseDate", criteria.getPurchaseDate(), criteria.getPurchaseDateFrom(), criteria.getPurchaseDateTo());
        addPredicate("image", criteria.getImage(),criteria.getImageLike());
        addPredicateBigDecimal("total", criteria.getTotal(), criteria.getTotalMin(), criteria.getTotalMax());
    }

    public PurchaseSpecification(PurchaseCriteria criteria) {
        super(criteria);
    }

    public PurchaseSpecification(PurchaseCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
