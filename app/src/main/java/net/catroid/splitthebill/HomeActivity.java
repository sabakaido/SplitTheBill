package net.catroid.splitthebill;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import net.catroid.splitthebill.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        binding.textView.setText("Home");
    }

    public void onClickNextButton(View view) {
        Intent intent = new Intent(this, ResultActivity.class);

        startActivity(intent);
    }
}
