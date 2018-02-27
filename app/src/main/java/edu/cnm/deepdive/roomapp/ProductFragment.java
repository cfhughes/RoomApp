package edu.cnm.deepdive.roomapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import edu.cnm.deepdive.roomapp.models.Product;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductFragment extends Fragment {


  public ProductFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

    final View view = inflater.inflate(R.layout.fragment_product, container, false);

    new Thread(new Runnable() {
      @Override
      public void run() {
        Product product = new Product();
        product.setName("Bar of Soap");
        product.setBarcode(1001001);
        ((MainActivity)getActivity()).getDatabase().productDao()
            .insert(product);

        List<Product> products = ((MainActivity)getActivity()).getDatabase().productDao()
            .getAll();
        ListAdapter adapter = new ArrayAdapter<Product>(getActivity(),
            android.R.layout.simple_list_item_1,products);
        ((ListView) view).setAdapter(adapter);
      }
    }).start();

    return view;
  }

}
