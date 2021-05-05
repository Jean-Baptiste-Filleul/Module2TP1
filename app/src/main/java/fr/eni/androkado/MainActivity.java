package fr.eni.androkado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import fr.eni.androkado.bo.Article;

public class MainActivity extends AppCompatActivity {

    Article article = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        article = new Article();
        article.setId(1);
        article.setNom("Pain au chocolat");
        article.setDescription("Viennoiserie au beurre et au chocolat.");
        article.setUrl("http://www.painauchocolat.fr");
        article.setPrix(1.0f);
        article.setNote(4);
        article.setAchete(true);

        TextView tv_article = findViewById(R.id.tv_article);
        TextView tv_prix = findViewById(R.id.tv_prix);
        TextView tv_description = findViewById(R.id.tv_description);
        RatingBar rt_article = findViewById(R.id.rt_article);
        ToggleButton btn_achat = findViewById(R.id.btn_achat);

        tv_article.setText(article.getNom());
        tv_description.setText(article.getDescription());
        tv_prix.setText(String.valueOf(article.getPrix()));
        rt_article.setRating(article.getNote());
        btn_achat.setChecked(article.isAchete());

    }

    public void showURL(View view) {
        Toast.makeText(this, article.getUrl(), Toast.LENGTH_SHORT).show();
        Intent intention = new Intent(this,InfoUrlActivity.class);
        startActivity(intention);
        intention.putExtra("article", (Parcelable) new Article(article.getId(),article.getNom(),article.getDescription(),article.getUrl(),article.getNote(), article.getNote(),article.isAchete()));
        startActivity(intention);
    }
}