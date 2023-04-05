package Sen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import com.sinhvien.myrex.R;

import java.util.ArrayList;

import Adapter.AdapterSen;

public class eating_sen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_eating_sen);
		
		ListView listView;
        ArrayList<Greeting> listGreeting;
        AdapterSen adapterSen;
		
		listView = findViewById(R.id.listViewSenEat);
        listGreeting = new ArrayList<>();
        listGreeting.add(new Greeting("I’m starving!"," Tôi đói quá!"));
        listGreeting.add(new Greeting("What’s for breakfast/lunch/dinner? "," Sáng/Trưa/Tối nay có món gì vậy?"));
        listGreeting.add(new Greeting("We eat rice, beef and potato soup for dinner","Chúng ta ăn cơm, thịt bò và canh khoai tây vào bữa tối."));
        listGreeting.add(new Greeting("Enjoy your meal! ","Chúc mọi người ngon miệng!"));
        listGreeting.add(new Greeting("Help yourself! ","Cứ tự nhiên đi!"));
        listGreeting.add(new Greeting("That smells good.","Đồ ăn thơm quá."));
        listGreeting.add(new Greeting("Would you like some beef?","Bạn có muốn ăn chút thịt bò không?"));
        listGreeting.add(new Greeting("You should eat more vegetables. "," Bạn nên ăn nhiều rau hơn."));
        listGreeting.add(new Greeting("I can’t help it. They are so good.","Tôi không thể cưỡng lại được. Chúng quá ngon."));
        listGreeting.add(new Greeting("This is too salty"," Món này mặn quá"));
        listGreeting.add(new Greeting("This food’s cold","Thức ăn nguội quá"));
        listGreeting.add(new Greeting("This doesn’t taste right","Món này không đúng vị"));
        listGreeting.add(new Greeting("Mother cooked the most delicious ","Mẹ nấu là ngon nhất"));
        listGreeting.add(new Greeting("What are you taking?","Bạn đang uống gì vậy?"));
        listGreeting.add(new Greeting("Would you like something to drink first?"," Cô muốn uống gì trước không?"));
        listGreeting.add(new Greeting("What should we eat for lunch?","Trưa nay chúng ta nên ăn gì nhỉ?"));
        listGreeting.add(new Greeting("What are you going to have?","Bạn định dùng gì?"));
        listGreeting.add(new Greeting("Shall we get a take-away?","Chúng mình mang đồ ăn đi nhé"));
        listGreeting.add(new Greeting("What’s to eat?"," Ăn cái gì"));
        listGreeting.add(new Greeting("It’s most done","Đã gần xong"));
        listGreeting.add(new Greeting("It’s time to eat","Đến giờ ăn rồi"));



        adapterSen = new AdapterSen(eating_sen.this,R.layout.list_item_sen,listGreeting);
        listView.setAdapter(adapterSen);
    }
}