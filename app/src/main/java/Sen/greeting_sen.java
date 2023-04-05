package Sen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import com.sinhvien.myrex.R;

import java.util.ArrayList;

import Adapter.AdapterSen;

public class greeting_sen extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_greeting_sen);

        ListView listView;
        ArrayList<Greeting> listGreeting;
        AdapterSen adapterSen;

        listView = findViewById(R.id.listViewSen);
        listGreeting = new ArrayList<>();
        listGreeting.add(new Greeting("Hello","Xin chào"));
        listGreeting.add(new Greeting("How are you?","Bạn có khỏe không?"));
        listGreeting.add(new Greeting("Nice to see you","Rất vui được gặp bạn"));
        listGreeting.add(new Greeting("I am fine. Thank you! ","Tôi khỏe. Cảm ơn!"));
        listGreeting.add(new Greeting("I am happy to make your acquaintance","Tôi rất vui khi được làm quen với bạn"));
        listGreeting.add(new Greeting("I am very pleased to meet you","Tôi rất vui khi được gặp bạn"));
        listGreeting.add(new Greeting("Glad to meet you","Thật vui khi được gặp bạn"));
        listGreeting.add(new Greeting("What’s new?","Có gì mới không?"));
        listGreeting.add(new Greeting("Long time no see","Lâu rồi không gặp"));
        listGreeting.add(new Greeting("What’s up?","Dạo này thế nào rồi?"));
        listGreeting.add(new Greeting("How is it going? hoặc How are you going?","Dạo này mày sao rồi?"));
        listGreeting.add(new Greeting("Who is you?","Bạn là ai?"));
        listGreeting.add(new Greeting("Who is there?","Ai kia?"));
        listGreeting.add(new Greeting("Where are you coming from?","Bạn đến từ đâu vậy?"));
        listGreeting.add(new Greeting("What do you wish? ","Bạn mong ước điều gì?"));
        listGreeting.add(new Greeting("Can I help you?","Tôi có thể giúp gì cho bạn?"));
        listGreeting.add(new Greeting("What is this called in English?","Cái này trong tiếng Anh gọi là gì?"));
        listGreeting.add(new Greeting("What does this word mean?","Từ này có nghĩa là gì?"));
        listGreeting.add(new Greeting("Please come in","Xin mời vào"));
        listGreeting.add(new Greeting("Please sit down","Vui lòng ngồi xuống"));
        listGreeting.add(new Greeting("Sit here","Ngồi đây nhé!"));
        listGreeting.add(new Greeting("How are you?","Bạn có khỏe không?"));
        listGreeting.add(new Greeting("Hello","Xin chào"));
        listGreeting.add(new Greeting("How are you?","Bạn có khỏe không?"));
        listGreeting.add(new Greeting("Hello","Xin chào"));
        listGreeting.add(new Greeting("How are you?","Bạn có khỏe không?"));
        listGreeting.add(new Greeting("Hello","Xin chào"));
        listGreeting.add(new Greeting("How are you?","Bạn có khỏe không?"));


        adapterSen = new AdapterSen(greeting_sen.this,R.layout.list_item_sen,listGreeting);
        listView.setAdapter(adapterSen);
    }

}