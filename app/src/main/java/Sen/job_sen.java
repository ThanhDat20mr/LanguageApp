package Sen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import com.sinhvien.myrex.R;

import java.util.ArrayList;

import Adapter.AdapterSen;

public class job_sen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_job_sen);
		
		ListView listView;
        ArrayList<Greeting> listGreeting;
        AdapterSen adapterSen;
		
		listView = findViewById(R.id.listViewSenJob);
        listGreeting = new ArrayList<>();
        listGreeting.add(new Greeting("What do you do?","Bạn làm nghề gì?"));
        listGreeting.add(new Greeting("What’s your job?","Công việc của bạn là gì?"));
        listGreeting.add(new Greeting("What’s your father job?","Cha của bạn làm nghề gì?"));
        listGreeting.add(new Greeting("What is his job?","Ông ấy làm nghề gì?"));
        listGreeting.add(new Greeting("What do you do for a living?","Bạn kiếm sống bằng nghề gì?"));
        listGreeting.add(new Greeting("What sort of work do you do?","Bạn làm loại công việc gì?"));
        listGreeting.add(new Greeting("What line of work are you in?","Bạn làm trong ngành gì?"));
        listGreeting.add(new Greeting("I’ve got a part-time job","Tôi làm việc bán thời gian"));
        listGreeting.add(new Greeting("I’ve got a full-time job","Tôi làm việc toàn thời gian"));
        listGreeting.add(new Greeting("I’m unemployed","Tôi đang thất nghiệp"));
        listGreeting.add(new Greeting("I’m out of work","Tôi đang không có việc"));
        listGreeting.add(new Greeting("I’m looking for work","Tôi đang tìm việc"));
        listGreeting.add(new Greeting("I’m not working at the moment","Hiện tôi không làm việc"));
        listGreeting.add(new Greeting("I’ve been made redundant","Tôi vừa bị sa thải"));
        listGreeting.add(new Greeting("I was made redundant two months ago","Tôi bị sa thải hai tháng trước"));
        listGreeting.add(new Greeting("I do some voluntary work","Tôi đang làm tình nguyện viên"));
        listGreeting.add(new Greeting("I’m retired","Tôi đã nghỉ hưu"));
        listGreeting.add(new Greeting("Who do you work for?","Bạn làm việc cho ai?"));
        listGreeting.add(new Greeting("I work for myself","Tôi tự làm chủ"));
        listGreeting.add(new Greeting("Where do you work?","Bạn làm việc ở đâu?"));
        listGreeting.add(new Greeting("I work in a shop","Tôi làm việc ở cửa hàng"));
        listGreeting.add(new Greeting("I’m training to be an engineer","Tôi được đào tạo để trở thành kỹ sư"));
        listGreeting.add(new Greeting("I’m training to be a nurse","Tôi được đào tạo để trở thành y tá"));
        listGreeting.add(new Greeting("I’m a trainee","Tôi là một thực tập sinh"));
        listGreeting.add(new Greeting("I’m a trainee supermarket manager","Tôi là quản lý siêu thị tập sự"));
        listGreeting.add(new Greeting("I’m on work experience","Tôi đang đi thực tập"));
        listGreeting.add(new Greeting("I’m doing an internship","Tôi đang đi thực tập"));


        adapterSen = new AdapterSen(job_sen.this,R.layout.list_item_sen,listGreeting);
        listView.setAdapter(adapterSen);
    }
}