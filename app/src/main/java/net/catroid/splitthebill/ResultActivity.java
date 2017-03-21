package net.catroid.splitthebill;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import net.catroid.splitthebill.databinding.ActivityHomeBinding;

/**
 * Created by anikaido on 2017/03/21.
 */
public class ResultActivity extends AppCompatActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        binding.textView.setText("Result");
    }

    public void onClickNextButton(View view) {
        Intent intent = new Intent(this, HomeActivity.class);

        startActivity(intent);
    }
}
