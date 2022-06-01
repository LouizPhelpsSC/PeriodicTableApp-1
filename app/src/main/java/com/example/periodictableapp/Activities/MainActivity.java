package com.example.periodictableapp.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.os.Bundle;

import com.example.periodictableapp.LoadElements;
import com.example.periodictableapp.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String>{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @NonNull
    @Override
    public Loader<String> onCreateLoader(int id, @Nullable Bundle args) {
        String queryString = "";
        if (args != null) {
            queryString = args.getString("queryString");
        }
        return new LoadElements(this, queryString);
    }
    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String data) {
//        try {
//            // Converte a resposta em Json
//            JSONObject jsonObject = new JSONObject(data);
//            // Obtem o JSONArray dos itens de livros
//            JSONArray itemsArray = jsonObject.getJSONArray("items");
//            // inicializa o contador
//            int i = 0;
//            String titulo = null;
//            String autor = null;
//            // Procura pro resultados nos itens do array
//            while (i < itemsArray.length() &&
//                    (autor == null && titulo == null)) {
//                // Obtem a informação
//                JSONObject book = itemsArray.getJSONObject(i);
//                JSONObject volumeInfo = book.getJSONObject("volumeInfo");
//                //  Obter autor e titulo para o item,
//                // erro se o campo estiver vazio
//                try {
//                    titulo = volumeInfo.getString("title");
//                    autor = volumeInfo.getString("authors");
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                // move para a proxima linha
//                i++;
//            }
//            //mostra o resultado qdo possivel.
//            if (titulo != null && autor != null) {
//                nmTitulo.setText(titulo);
//                nmAutor.setText(autor);
//                //nmLivro.setText(R.string.str_empty);
//            } else {
//                // If none are found, update the UI to show failed results.
//                nmTitulo.setText(R.string.no_results);
//                nmAutor.setText(R.string.str_empty);
//            }
//        } catch (Exception e) {
//            // Se não receber um JSOn valido, informa ao usuário
//            nmTitulo.setText(R.string.no_results);
//            nmAutor.setText(R.string.str_empty);
//            e.printStackTrace();
//        }
    }
    @Override
    public void onLoaderReset(@NonNull Loader<String> loader) {
        // obrigatório implementar, nenhuma ação executada
    }
}