package fresh_geese.watfridge;

//import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;




public class listActivity extends AppCompatActivity {

    protected Context mainContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

    mainContext = this;

    }


    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_list, container, false);


        final Button addFoodButton = (Button) rootview.findViewById(R.id.addFoodButton);
        addFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("CRIES");

                //AlertDialog.Builder alert = new android.app.AlertDialog.Builder(this);
                //alert.setMessage("okay maybe it's working");
                //alert.setCancelable(false);


                //foodButtonClicked(v);

                Intent intent = new Intent(mainContext, foodFragment.class);
                mainContext.startActivity(intent);


            }
        });

        return rootview;
    }


    public void foodButtonClicked(View v){
        foodFragment fragment = new foodFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.addFoodButton, fragment);
        transaction.commit();
    }

}
