package edu.cnm.deepdive.roomapp.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Product {

  @PrimaryKey(autoGenerate = true)
  private int id;

  @ColumnInfo(name = "name")
  private String name;

  @ColumnInfo(name = "barcode")
  private int barcode;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBarcode() {
    return barcode;
  }

  public void setBarcode(int barcode) {
    this.barcode = barcode;
  }

  @Override
  public String toString() {
    return name + " " + barcode;
  }
}
