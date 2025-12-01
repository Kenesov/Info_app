package vetro.uz.infoapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import vetro.uz.infoapp.Repository.InfoData;
import vetro.uz.infoapp.Repository.Repository;

public class MainActivity extends AppCompatActivity {

    private LinearLayout container;
    private Repository repository = new Repository();
    private String TAG = "TTT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        loadView();
        loadDataToView();
    }
    private void loadDataToView(){
        for (InfoData infoData : repository.getList()) {
            View item = LayoutInflater.from(this).inflate(R.layout.item_res,container,false);
            AppCompatImageView imageView = item.findViewById(R.id.img_avatar);
            AppCompatTextView tvName = item.findViewById(R.id.tvName);
            AppCompatTextView tvProfession = item.findViewById(R.id.tvProfession);
            //set data to loaded views
            imageView.setImageResource(infoData.getImage());
            tvName.setText(infoData.getName());
            tvProfession.setText(infoData.getProfession());
            //set actions
            item.setOnClickListener(v2->{
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,imageView,"avatar");
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("Image",infoData.getImage());
                intent.putExtra("Name",infoData.getName());
                intent.putExtra("ResName",infoData.getProfession());
                intent.putExtra("Description",infoData.getDescription());
                startActivity(intent, options.toBundle());
            });
            container.addView(item);
        }
    }

    private void loadView(){
        container = findViewById(R.id.main_container);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }
}