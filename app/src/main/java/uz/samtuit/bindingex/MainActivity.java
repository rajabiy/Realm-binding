package uz.samtuit.bindingex;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.realm.Realm;
import uz.samtuit.bindingex.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(this);
        Realm realm = Realm.getDefaultInstance();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User();
        realm.beginTransaction();
        user.setFirstName("sdfsdfsd");
        user.setLastName("sdfsdfsd");
        realm.commitTransaction();

        binding.setUser(user);


    }


}
