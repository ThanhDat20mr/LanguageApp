package Sen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import com.sinhvien.myrex.R;

import java.util.ArrayList;

import Adapter.AdapterSen;

public class health_sen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_health_sen);

        ListView listView;
        ArrayList<Greeting> listGreeting;
        AdapterSen adapterSen;

        listView = findViewById(R.id.listViewSen1);
        listGreeting = new ArrayList<>();
        listGreeting.add(new Greeting("What’s the matter with you?","Bạn bị sao vậy?"));
        listGreeting.add(new Greeting("I have a headache.","Tớ bị đau đầu."));
        listGreeting.add(new Greeting("What should we do to stay in shape?","Chúng ta nên làm gì để giữ dáng"));
        listGreeting.add(new Greeting("We should do exercise regularly.","Chúng ta nên tập thể dục thường xuyên."));
        listGreeting.add(new Greeting("What time do you go to sleep?","Bạn đi ngủ lúc mấy giờ?"));
        listGreeting.add(new Greeting("I sleep at 11 o’clock.","Tớ đi ngủ lúc 11 giờ"));
        listGreeting.add(new Greeting("How do you feel?","Bạn cảm thấy như thế nào?"));
        listGreeting.add(new Greeting("I feel dizzy.","Tớ cảm thấy choáng váng."));
        listGreeting.add(new Greeting("Why do you have a headache?","Tại sao bạn bị đau đầu?"));
        listGreeting.add(new Greeting("Because I stayed up late.","Bởi vì tớ thức khuya."));
        listGreeting.add(new Greeting("What will you do if you have a cold?","Bạn sẽ làm gì khi bị cảm lạnh?"));
        listGreeting.add(new Greeting("I’ll drink hot ginger tea.","Tớ sẽ uống trà gừng ấm."));
        listGreeting.add(new Greeting("What’s the matter (with you)?","Bạn bị sao vậy?"));
        listGreeting.add(new Greeting("I have a cold","Mình bị cảm lạnh"));
        listGreeting.add(new Greeting("What’s wrong (with you)?","Bạn bị sao vậy?"));
        listGreeting.add(new Greeting("Do you have a fever?","Bạn có bị sốt không?"));
        listGreeting.add(new Greeting("What’s the matter with you?","Bạn bị sao vậy?"));
        listGreeting.add(new Greeting("I have a headache.","Tớ bị đau đầu."));
        listGreeting.add(new Greeting("What should we do to stay in shape?","Chúng ta nên làm gì để giữ dáng"));
        listGreeting.add(new Greeting("We should do exercise regularly.","Chúng ta nên tập thể dục thường xuyên."));
        listGreeting.add(new Greeting("What time do you go to sleep?","Bạn đi ngủ lúc mấy giờ?"));
        listGreeting.add(new Greeting("I sleep at 11 o’clock.","Tớ đi ngủ lúc 11 giờ"));
        listGreeting.add(new Greeting("How do you feel?","Bạn cảm thấy như thế nào?"));
        listGreeting.add(new Greeting("I feel dizzy.","Tớ cảm thấy choáng váng."));
        listGreeting.add(new Greeting("Why do you have a headache?","Tại sao bạn bị đau đầu?"));
        listGreeting.add(new Greeting("Because I stayed up late.","Bởi vì tớ thức khuya."));
        listGreeting.add(new Greeting("What will you do if you have a cold?","Bạn sẽ làm gì khi bị cảm lạnh?"));
        listGreeting.add(new Greeting("I’ll drink hot ginger tea.","Tớ sẽ uống trà gừng ấm."));
        listGreeting.add(new Greeting("What’s the matter (with you)?","Bạn bị sao vậy?"));
        listGreeting.add(new Greeting("I have a cold","Mình bị cảm lạnh"));
        listGreeting.add(new Greeting("What’s wrong (with you)?","Bạn bị sao vậy?"));
        listGreeting.add(new Greeting("Do you have a fever?","Bạn có bị sốt không?"));


        adapterSen = new AdapterSen(health_sen.this,R.layout.list_item_sen,listGreeting);
        listView.setAdapter(adapterSen);
    }
}