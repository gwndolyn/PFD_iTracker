package sg.edu.np.mad.dontslack;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    private static  User user;
    private static final String KEY_USERNAME = "userName";
    DBHandler dbHandler = new DBHandler(this,null,null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        /* Hiding the top bar */
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

      //  String Username = sharedPreferences.getString(KEY_USERNAME, "");
      //  if(!Username.equals("")) {
       //     user = dbHandler.findUser(Username);
        //    TextView profileUsername = findViewById(R.id.textAccessCode);
       //     profileUsername.setText(user.getUsername());
      //  }
            //Back home page button
        ImageView backHomePage = findViewById(R.id.backHome6);
        backHomePage.setOnClickListener(v -> {
            Intent myIntent = new Intent(Contact.this, HomePage.class);
            startActivity(myIntent);
        });
    }
}