package edu.cnm.deepdive.roomapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import edu.cnm.deepdive.roomapp.dao.ProductDao;
import edu.cnm.deepdive.roomapp.models.Product;

@Database(entities = {Product.class}, version = 1)
public abstract class ProductDatabase extends RoomDatabase {

  public abstract ProductDao productDao();

}







