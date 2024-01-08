package com.zulal.codementor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<ProgrammingLanguage.Languages> mData;

    public RecyclerViewAdapter(Context mContext, List<ProgrammingLanguage.Languages> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);  //kodu kullanılabilir bir View nesnesine dönüştürmeye yarar
        view = layoutInflater.inflate(R.layout.cardview, viewGroup, false); //inflate metodunu kullanarak XML düzen dosyasından (R.layout.cardview) bir görünüm oluşturulur
        return new MyHolder(view); //view, MyHolder sınıfından bir örnek içine yerleştirilir ve bu örnek döndürülerek RecyclerView tarafından kullanılır.
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {
        myHolder.LanguageTitle.setText(mData.get(myHolder.getAdapterPosition()).getLanguagesName());
        myHolder.Thumbnail.setImageResource(mData.get(myHolder.getAdapterPosition()).getThumbnail());
        // CardView'a tıklanma
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, LanguagesActivity.class);

                intent.putExtra("LanguagesName", mData.get(myHolder.getAdapterPosition()).getLanguagesName());
                intent.putExtra("LanguagesInfo", mData.get(myHolder.getAdapterPosition()).getLanguagesInfo());
                intent.putExtra("LanguagesMethodTitle", mData.get(myHolder.getAdapterPosition()).getLanguagesMethodTitle());
                intent.putExtra("Language", mData.get(myHolder.getAdapterPosition()).getLanguages());
                intent.putExtra("Thumbnail", mData.get(myHolder.getAdapterPosition()).getThumbnail());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView LanguageTitle;
        CardView cardView;
        ImageView Thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            LanguageTitle = itemView.findViewById(R.id.language);
            Thumbnail = itemView.findViewById(R.id.language_img_id);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
