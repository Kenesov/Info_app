package vetro.uz.infoapp.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vetro.uz.infoapp.R;
import vetro.uz.infoapp.adapters.LanguageAdapter;
import vetro.uz.infoapp.models.ProgrammingLanguage;
import vetro.uz.infoapp.utils.LanguageData;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LanguageAdapter adapter;
    private List<ProgrammingLanguage> languages;

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

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initViews();
        setupRecyclerView();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        languages = LanguageData.getLanguages();
    }

    private void setupRecyclerView() {
        adapter = new LanguageAdapter(this, languages);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}