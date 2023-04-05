package Activity;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Window;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.sinhvien.myrex.R;
import com.sinhvien.myrex.dictionaryExample;
import com.sinhvien.myrex.dictionaryRequest;

import java.util.Locale;

public class dictionary_activity extends Activity {

    String url;
    private TextView txtInf,txtExample;
    private EditText txtSearch;
    private TextToSpeech tts;
    ImageButton btnPronounce;
    ImageButton btnLang;
    int dem=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dictionary);

        txtExample = (TextView) findViewById(R.id.txtExample) ;
        txtInf = (TextView) findViewById(R.id.txtInf);
        txtSearch = (EditText) findViewById(R.id.txtSearch);
        btnPronounce = (ImageButton) findViewById(R.id.btnPronounce);
        btnLang = (ImageButton) findViewById(R.id.btnLang);
        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    setLang(dem);
                }
                else{
                    Log.e("TTS","Initialization failed!");
                }

            }
        });

        btnPronounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });
        btnLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dem==1){
                    btnLang.setBackgroundResource(R.drawable.flag_us);
                    dem=2;
                    setLang(dem);
                    Toast.makeText(dictionary_activity.this, "US", Toast.LENGTH_SHORT).show();
                }
                else if(dem==2){
                    btnLang.setBackgroundResource(R.drawable.flag_uk);
                    dem=1;
                    setLang(dem);
                    Toast.makeText(dictionary_activity.this, "UK", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    void setLang(int dem){

            if(dem==1){
                int rs = tts.setLanguage(Locale.UK);
                if(rs == TextToSpeech.LANG_MISSING_DATA || rs == TextToSpeech.LANG_NOT_SUPPORTED){
                    Log.e("TTS","Language not supported!");
                }
                else{
                    btnPronounce.setEnabled(true);
                }
            }
            else if(dem==2) {
                int rs = tts.setLanguage(Locale.ENGLISH);
                if (rs == TextToSpeech.LANG_MISSING_DATA || rs == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.e("TTS", "Language not supported!");
                } else {
                    btnPronounce.setEnabled(true);
                }
            }
    }

    @Override
    protected void onDestroy() {
        if(tts!=null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    private void speak(){
        String str = txtSearch.getText().toString();
        tts.speak(str,TextToSpeech.QUEUE_FLUSH, null);
    }

    private String dictionaryEntries() {
        final String language = "en-gb";
        final String word = txtSearch.getText().toString();
        final String fields = "definitions";
        final String strictMatch = "false";
        final String word_id = word.toLowerCase();

        return "https://od-api.oxforddictionaries.com:443/api/v2/entries/" + language + "/" + word_id + "?" + "fields=" + fields + "&strictMatch=" + strictMatch;
    }
    private String dictionaryEntriesEx() {
        final String language = "en-gb";
        final String word = txtSearch.getText().toString();
        final String fields = "examples";
        final String strictMatch = "false";
        final String word_id = word.toLowerCase();

        return "https://od-api.oxforddictionaries.com:443/api/v2/entries/" + language + "/" + word_id + "?" + "fields=" + fields + "&strictMatch=" + strictMatch;
    }
    public void sendRequestOnClick(View v)
    {
        dictionaryRequest dR = new dictionaryRequest(this, txtInf);
        dictionaryExample dREx = new dictionaryExample(this, txtExample);
        url = dictionaryEntries();
        String urlEx = dictionaryEntriesEx();
        dR.execute(url);
        dREx.execute(urlEx);

    }


}