package vetro.uz.infoapp.adapters;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import vetro.uz.infoapp.R;
import vetro.uz.infoapp.activities.DetailActivity;
import vetro.uz.infoapp.models.ProgrammingLanguage;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.ViewHolder> {

    private List<ProgrammingLanguage> languages;
    private Context context;

    public LanguageAdapter(Context context, List<ProgrammingLanguage> languages) {
        this.context = context;
        this.languages = languages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_language, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProgrammingLanguage language = languages.get(position);
        holder.tvName.setText(language.getName());
        holder.ivIcon.setImageResource(language.getIconResId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("position", position);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return languages.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView ivIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvLanguageName);
            ivIcon = itemView.findViewById(R.id.ivLanguageIcon);
        }
    }
}