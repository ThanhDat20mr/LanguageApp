package Sen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import com.sinhvien.myrex.R;

import java.util.ArrayList;

import Adapter.AdapterSen;

public class place_sen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_place_sen);
		
		ListView listView;
        ArrayList<Greeting> listGreeting;
        AdapterSen adapterSen;
		
		listView = findViewById(R.id.listViewSenPlace);
        listGreeting = new ArrayList<>();
        listGreeting.add(new Greeting("Today I’d like to tell you about … (place)","Hôm nay tôi muốn nói về …"));
        listGreeting.add(new Greeting("Well, I’m gonna tell you about … (place)"," Hôm nay tôi sẽ nói về …"));
        listGreeting.add(new Greeting("A couple of years ago, I went on a trip to ..(place)","Một vài năm trước, tôi đã đi một chuyến du lịch đến…"));
        listGreeting.add(new Greeting("It is located/situated in the North/South … of (a country/a city)","nó nằm ở vị trí phía Bắc/Nam của…"));
        listGreeting.add(new Greeting("It is (about)…  km away from ..(place)","nó cách  … nơi nào đó (khoảng) bao nhiêu km"));
        listGreeting.add(new Greeting("It is near (place)….","nó ở gần nơi nào đó"));
        listGreeting.add(new Greeting("I took/caught a train/bus there","tôi bắt một chuyến tàu/chuyến xe buýt đến đó"));
        listGreeting.add(new Greeting("I went there by bus/ by train/ by plane/ on foot","tôi đến đó bằng xe buýt/ tàu hỏa/ máy bay/ đi bộ đến đó"));
        listGreeting.add(new Greeting("I booked a flight to … (place)","tôi đặt một chuyến bay đến …"));
        listGreeting.add(new Greeting("I went there alone/ with my friends/family"," tôi đến đó một mình/ với bạn bè/ gia đình"));
        listGreeting.add(new Greeting("Eat local food","ăn đồ ăn địa phương"));
        listGreeting.add(new Greeting("Take photographs","chụp ảnh"));
        listGreeting.add(new Greeting("Visit relatives"," thăm người thân"));
        listGreeting.add(new Greeting("Mingle with the locals","hòa nhập với người địa phương"));
        listGreeting.add(new Greeting("I can’t wait to go back there","Tôi không thể đợi để quay lại đó"));



        adapterSen = new AdapterSen(place_sen.this,R.layout.list_item_sen,listGreeting);
        listView.setAdapter(adapterSen);
    }
}