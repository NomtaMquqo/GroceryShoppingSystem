package factory;

import domain.Product;
import util.Helper;

public class ProductFactory {

    public static Product createProduct(int productNum, String productType, String productItem, String productDescription) {

        if (Helper.isNullorEmpty(productType) || Helper.isNullorEmpty(productItem))
            return null;
        ;
        String productId = Helper.generateId();
        Product product = new Product.Builder().setProductNum(productNum)
                .setProductType(productType)
                .setProductItem(productItem)
                .setProductDescription(productDescription)
                .build();
        return product;
    }

}
