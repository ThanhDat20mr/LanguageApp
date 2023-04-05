package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.sinhvien.myrex.Audio_listen;
import com.sinhvien.myrex.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class listen_activity extends AppCompatActivity {

    TextView txtTitle,txtTimeSong,txtTimeTotal;
    SeekBar skSong;
    ImageView btnPrev, btnStop, btnNext;
    ImageView btnPlay;
    int position = 0;
    MediaPlayer mediaPlayer;
    Button btnGreeting, btnEmotion, btnInterests, btnShopping, btnMovie;
    ArrayList<Audio_listen> arraySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTimeSong = (TextView) findViewById(R.id.timeSong);
        txtTimeTotal = (TextView) findViewById(R.id.timeTotal);
        skSong = (SeekBar) findViewById(R.id.seekBar);
        btnPrev = (ImageView) findViewById(R.id.previous);
        btnPlay = (ImageView) findViewById(R.id.start);
        btnStop = (ImageView) findViewById(R.id.stop);
        btnNext = (ImageView) findViewById(R.id.next);
        btnEmotion = (Button) findViewById(R.id.btnEmotion);
        btnInterests = (Button) findViewById(R.id.btnInterests);
        btnGreeting = (Button) findViewById(R.id.btnGreeting);
        btnShopping = (Button) findViewById(R.id.btnShopping);
        btnMovie = (Button) findViewById(R.id.btnMovie);
        AddSong();
        KhoiTaoMediaPlayer();
        SetTimeTotal();

        btnGreeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSong("Greeting");
            }
        });
        btnMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSong("Movie Theater");
            }
        });
        btnEmotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSong("Express Emotions");
            }
        });
        btnInterests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSong("Interests");
            }
        });
        btnShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSong("Shopping");
            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnPlay.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.btnplay).getConstantState())) {
                    mediaPlayer.start();
                    btnPlay.setImageResource(R.drawable.btnpause);
                } else {
                    mediaPlayer.pause();
                    btnPlay.setImageResource(R.drawable.btnplay);
                }
                SetTimeTotal();
                UpdateTimeSong();
            }
        });
        skSong.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.seekTo(skSong.getProgress());
            }
        });

    btnStop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mediaPlayer.stop();
            mediaPlayer.release();
            btnPlay.setImageResource(R.drawable.btnplay);
            KhoiTaoMediaPlayer();
        }
    });
    btnPrev.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            position++;
            if (position > arraySong.size() - 1){
                position = 0;
            }
            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
            }
            KhoiTaoMediaPlayer();
            mediaPlayer.start();
            btnPlay.setImageResource(R.drawable.btnplay);
            SetTimeTotal();
            UpdateTimeSong();
        }
    });
    btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                arraySong.clear();
                AddSong();
                KhoiTaoMediaPlayer();
                SetTimeTotal();
                position --;
                if (position < 0){
                    position = arraySong.size() - 1;
                }
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                }
                KhoiTaoMediaPlayer();
                //mediaPlayer.start();
                btnPlay.setImageResource(R.drawable.btnplay);
                SetTimeTotal();
                UpdateTimeSong();
            }
        });

    }
    private void SetTimeTotal()
    {
        SimpleDateFormat dinhDangGio = new SimpleDateFormat("mm:ss");
        txtTimeTotal.setText(dinhDangGio.format(mediaPlayer.getDuration()));
        skSong.setMax(mediaPlayer.getDuration());
    }
    private void UpdateTimeSong()
    {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat dinhDangGio = new SimpleDateFormat("mm:ss");
                txtTimeSong.setText(dinhDangGio.format(mediaPlayer.getCurrentPosition()));
                skSong.setProgress(mediaPlayer.getCurrentPosition());
                handler.postDelayed(this,500);
            }
        },100);
    }
    private void KhoiTaoMediaPlayer(){
        mediaPlayer = MediaPlayer.create(listen_activity.this,arraySong.get(position).getFile());
        txtTitle.setText(arraySong.get(position).getTitle());
    }
    private void setSong(String str){
        txtTitle.setText(str);
        arraySong.clear();
        if(str.equals("Movie Theater"))
            arraySong.add(new Audio_listen(str, R.raw.audio_rapphim));
        if(str.equals("Greeting"))
            arraySong.add(new Audio_listen(str, R.raw.audio_chaohoi));
        if(str.equals("Interests"))
            arraySong.add(new Audio_listen(str, R.raw.audio_sothich));
        if(str.equals("Express Emotions"))
            arraySong.add(new Audio_listen(str, R.raw.audio_vuimunghp));
        if(str.equals("Shopping"))
            arraySong.add(new Audio_listen(str, R.raw.audio_muasam));
        KhoiTaoMediaPlayer();
    }
    private void AddSong()
    {
        arraySong = new ArrayList<>();
        arraySong.add(new Audio_listen("Greeting", R.raw.audio_chaohoi));
        arraySong.add(new Audio_listen("Express Emotions", R.raw.audio_vuimunghp));
        arraySong.add(new Audio_listen("Interests", R.raw.audio_sothich));
        arraySong.add(new Audio_listen("Shopping", R.raw.audio_muasam));
        arraySong.add(new Audio_listen("Movie Theater", R.raw.audio_rapphim));

    }
}