package com.example.periodictableapp;

import android.net.Uri;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkUtils {
    private static final String LOG_TAG = NetworkUtils.class.getSimpleName();
    private static final String ELEMENTS_URL = "https://periodic-table-elements-info.herokuapp.com/";
    private static final String ELEMENT_QUANTIDADE = "";


    static String buscaElementos(String queryString) {

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String bookJSONString = null;

        try {
            Uri builtURI = Uri.parse(ELEMENTS_URL).buildUpon()
                    .appendQueryParameter(ELEMENT_QUANTIDADE, queryString)
                    .build();

            URL requestURL = new URL(builtURI.toString());
            urlConnection = (HttpURLConnection) requestURL.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            InputStream inputStream = urlConnection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();
            String linha;

            while ((linha = reader.readLine()) != null) {
                builder.append(linha);
                builder.append("\n");
            }

            if (builder.length() == 0) {
                return null;
            }

            bookJSONString = builder.toString();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        Log.d(LOG_TAG, bookJSONString);
        return bookJSONString;
    }
}
