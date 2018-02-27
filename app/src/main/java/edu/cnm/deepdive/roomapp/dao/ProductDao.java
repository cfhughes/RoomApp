package edu.cnm.deepdive.roomapp.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.roomapp.models.Product;
import java.util.List;

@Dao
public interface ProductDao {

  @Query("SELECT * FROM product")
  List<Product> getAll();

  @Query("SELECT * FROM product WHERE name LIKE :name LIMIT 1")
  Product findByName(String name);

  @Insert
  long insert(Product product);

}
