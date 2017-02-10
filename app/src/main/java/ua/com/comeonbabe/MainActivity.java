package ua.com.comeonbabe;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import ua.com.comeonbabe.adaptor.CustomListAdapter;
import ua.com.comeonbabe.fragment.RecipeListFragment;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Fragment fragment;
    Button guideBtn;
    Button receptionBtn;

    ListView list;
    String[] title = {
            "Fruit",
            "Salad",
            "Chicken",
            "Cheesecake Pops",
            "Spaghetti Cacio e Pepe",
            "Pan Seared Salmon I",
            "Cheesecake"

    };

    Integer[] imgid = {
            R.drawable.fruits,
            R.drawable.salad,
            R.drawable.chicken,
            R.drawable.pops,
            R.drawable.pasta,
            R.drawable.salmon,
            R.drawable.cheesecake,

    };

    String[] url = new String[]{
            "http://allrecipes.com/recipes/201/meat-and-poultry/chicken/",
            "http://allrecipes.com/recipes/96/salad/",
            "http://allrecipes.com/recipe/14420/peach-and-berry-salad/?internalSource=staff%20pick&referringId=211&referringContentType=recipe%20hub&clickId=cardslot%208",
            "http://allrecipes.com/recipe/164508/cheesecake-pops/?internalSource=hn_carousel%2001_Cheesecake%20Pops&referringId=17811&referringContentType=recipe%20hub&referringPosition=carousel%2001",
            "http://allrecipes.com/recipe/246628/spaghetti-cacio-e-pepe/?internalSource=hn_carousel%2001_Spaghetti%20Cacio%20e%20Pepe&referringId=95&referringContentType=recipe%20hub&referringPosition=carousel%2001",
            "http://allrecipes.com/recipe/21736/pan-seared-salmon-i/?internalSource=hn_carousel%2001_Pan-Seared%20Salmon%20I&referringId=416&referringContentType=recipe%20hub&referringPosition=carousel%2001",
            "http://allrecipes.com/recipe/25604/marys-cheesecake/?internalSource=hn_carousel%2001_Mary%27s%20Cheesecake&referringId=79&referringContentType=recipe%20hub&referringPosition=carousel%2001"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guideBtn = (Button) findViewById(R.id.guideBtnTop);
        guideBtn.setOnClickListener(this);

        receptionBtn = (Button) findViewById(R.id.recipeBtnTop);
        receptionBtn.setOnClickListener(this);

        fragment = new RecipeListFragment();
        CustomListAdapter adapter = new CustomListAdapter(this, title, imgid);
        list = (ListView) findViewById(R.id.list_view);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url[position]));
                startActivity(i);

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.recipeBtnTop:
                System.out.println("hello from btn 1");
                initFragment_1();
                break;
            case R.id.guideBtnTop:
                System.out.println("hello from btn 2");
                initFragment_2();
                break;
        }
    }

    private void initFragment_1() {

      /*  fragment = new RecipeListFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        //ft.replace(R.id.fragment_frame,fragment);
        ft.replace(R.id.fragment_list, fragment);
        ft.commit();*/
    }

    private void initFragment_2() {

        fragment = new RecipeListFragment();

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, fragment);
        ft.commit();
    }
}