package factory;

import domain.Store;
import util.Helper;

public class StoreFactory {

    public static Store createStore(String storeName, String storeAddress, String storeDescription) {

        if (Helper.isNullorEmpty(storeName) || Helper.isNullorEmpty(storeAddress))
            return null;
        ;
        String storeId = Helper.generateId();
        Store store = new Store.Builder().setStoreName(storeName)
                .setStoreAddress(storeAddress)
                .setStoreDescription(storeDescription)
                .build();
        return store;
    }
}