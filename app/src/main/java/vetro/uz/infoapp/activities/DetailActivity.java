package vetro.uz.infoapp.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;
import java.util.List;

import vetro.uz.infoapp.R;
import vetro.uz.infoapp.adapters.ImageSliderAdapter;
import vetro.uz.infoapp.models.ProgrammingLanguage;
import vetro.uz.infoapp.utils.LanguageData;

public class DetailActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private LinearLayout dotsIndicator;
    private TextView tvName, tvDescription, tvUsageArea;
    private BarChart barChart;
    private ProgrammingLanguage language;
    private ImageView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        int position = getIntent().getIntExtra("position", 0);
        language = LanguageData.getLanguages().get(position);

        initViews();
        setupViewPager();
        setupDotsIndicator();
        displayLanguageInfo();
        setupChart();
    }

    private void initViews() {
        viewPager = findViewById(R.id.viewPager);
        dotsIndicator = findViewById(R.id.dotsIndicator);
        tvName = findViewById(R.id.tvLanguageName);
        tvDescription = findViewById(R.id.tvDescription);
        tvUsageArea = findViewById(R.id.tvUsageArea);
        barChart = findViewById(R.id.barChart);
    }

    private void setupViewPager() {
        ImageSliderAdapter adapter = new ImageSliderAdapter(language.getImages());
        viewPager.setAdapter(adapter);

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                updateDots(position);
            }
        });
    }

    private void setupDotsIndicator() {
        int imageCount = language.getImages().length;
        dots = new ImageView[imageCount];

        for (int i = 0; i < imageCount; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dot_inactive));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(8, 0, 8, 0);

            dotsIndicator.addView(dots[i], params);
        }

        if (dots.length > 0) {
            dots[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dot_active));
        }
    }

    private void updateDots(int position) {
        for (int i = 0; i < dots.length; i++) {
            if (i == position) {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dot_active));
            } else {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dot_inactive));
            }
        }
    }

    private void displayLanguageInfo() {
        tvName.setText(language.getName());
        tvDescription.setText(language.getDescription());
        tvUsageArea.setText(language.getUsageArea());
    }

    private void setupChart() {
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0, language.getLearningLevel()));
        entries.add(new BarEntry(1, language.getPopularity()));
        entries.add(new BarEntry(2, language.getEfficiency()));

        BarDataSet dataSet = new BarDataSet(entries, "Ko'rsatkichlar");
        dataSet.setColors(new int[]{
                Color.parseColor("#3498DB"),
                Color.parseColor("#E74C3C"),
                Color.parseColor("#2ECC71")
        });
        dataSet.setValueTextSize(14f);
        dataSet.setValueTextColor(Color.BLACK);

        BarData barData = new BarData(dataSet);
        barData.setBarWidth(0.5f);

        barChart.setData(barData);
        barChart.getDescription().setEnabled(false);
        barChart.getLegend().setEnabled(false);
        barChart.setDrawGridBackground(false);
        barChart.setDrawBarShadow(false);
        barChart.setDrawValueAboveBar(true);
        barChart.setPinchZoom(false);
        barChart.setScaleEnabled(false);
        barChart.setTouchEnabled(false);
        barChart.setExtraBottomOffset(20f);
        // X Axis
        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(1f);
        xAxis.setTextSize(12f);
        xAxis.setValueFormatter(new IndexAxisValueFormatter(
                new String[]{"O'rganish", "Mashhurligi", "Samaradorlik"}
        ));
        xAxis.setYOffset(10f); // pastga surish
        xAxis.setDrawLabels(true); // default true bo‘lishi kerak



        // Y Axis
        YAxis leftAxis = barChart.getAxisLeft();
        leftAxis.setAxisMinimum(0f);
        leftAxis.setAxisMaximum(100f);
        leftAxis.setDrawGridLines(true);
        leftAxis.setGridColor(Color.LTGRAY);

        YAxis rightAxis = barChart.getAxisRight();
        rightAxis.setEnabled(false);

        barChart.animateY(1000);
        barChart.invalidate();
    }
}