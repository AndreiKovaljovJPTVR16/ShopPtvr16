package entity;

import entity.Buyer;
import entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T11:16:47")
@StaticMetamodel(Purchase.class)
public class Purchase_ { 

    public static volatile SingularAttribute<Purchase, Date> date;
    public static volatile SingularAttribute<Purchase, Product> product;
    public static volatile SingularAttribute<Purchase, Integer> purchaseCount;
    public static volatile SingularAttribute<Purchase, Long> id;
    public static volatile SingularAttribute<Purchase, Buyer> buyer;

}