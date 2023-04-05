package Sen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import com.sinhvien.myrex.R;

import java.util.ArrayList;

import Adapter.AdapterSen;

public class entertain_sen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_entertain_sen);
		
		ListView listView;
        ArrayList<Greeting> listGreeting;
        AdapterSen adapterSen;
		
		listView = findViewById(R.id.listViewSenEntertainment);
        listGreeting = new ArrayList<>();
        listGreeting.add(new Greeting("We like taking part in the music festival.","Chúng tôi thích tham gia lễ hội âm nhạc."));
        listGreeting.add(new Greeting("My house has an indoor swimming pool","Nhà tôi có một bể bơi trong nhà."));
        listGreeting.add(new Greeting("They visited museums and galleries throughout the city.","Họ đã đến thăm các viện bảo tàng và phòng trưng bày khắp thành phố"));
        listGreeting.add(new Greeting("That area of the coast is the playground of the rich.","Khu vực bờ biển đằng kia là sân chơi của những người giàu có"));
        


        adapterSen = new AdapterSen(entertain_sen.this,R.layout.list_item_sen,listGreeting);
        listView.setAdapter(adapterSen);
    }
}