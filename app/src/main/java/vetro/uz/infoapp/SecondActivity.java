package vetro.uz.infoapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private AppCompatImageButton backButton;
    private AppCompatTextView titleText;
    private AppCompatTextView professionText;
    private AppCompatTextView descriptionText;
    private AppCompatImageView avatarImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        loadView();
        loadDataFromIntent(getIntent());
        setActions();
    }
    private void loadDataFromIntent(Intent intent){
        avatarImage.setImageResource(intent.getIntExtra("Image",R.drawable.img_1));
        titleText.setText(intent.getStringExtra("Name"));
        professionText.setText(intent.getStringExtra("ResName"));
        descriptionText.setText(intent.getStringExtra("Description"));
    }
    private void loadView(){
        backButton = findViewById(R.id.btnBack);
        avatarImage = findViewById(R.id.img_avatar);
        titleText = findViewById(R.id.tvTitle);
        professionText = findViewById(R.id.tvResname);
        descriptionText = findViewById(R.id.tvDescription);
    }
    private void setActions(){
        backButton.setOnClickListener(v->{
            finish();
        });
    }
}