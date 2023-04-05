package Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ExpandableListView;

import com.sinhvien.myrex.CustomExpandableListView;
import com.sinhvien.myrex.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class grammar_activity extends Activity {

    ExpandableListView expandableListView;
    List<String> listdataHeader;
    HashMap<String,List<String>> listdataChild;
    CustomExpandableListView customExpandableListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_grammar);
        addControl();
        customExpandableListView = new CustomExpandableListView(grammar_activity.this,listdataHeader,listdataChild);
        expandableListView.setAdapter(customExpandableListView);



    }

    private void addControl() {
        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        listdataHeader = new ArrayList<>();
        listdataChild  = new HashMap<String, List<String>>();

        listdataHeader.add("12 TENSES");
        listdataHeader.add("PASSIVE VOICE");
        listdataHeader.add("CONDITIONAL SENTENCES");
        listdataHeader.add("WISHES");
//        listdataHeader.add("TAG QUESTION");
//        listdataHeader.add("COMPARISONS");

        List<String> tenses = new ArrayList<String>();
        tenses.add("SIMPLE PRESENT: \ndùng để diễn tả một sự thật hiển nhiên hay một hành động diễn ra lặp đi lặp lại theo thói quen, phong tục, khả năng." +
                "\nĐỐI VỚI ĐỘNG TỪ THƯỜNG:\nKhẳng định: S + V(s/es) + O\nPhủ định: S + do not /does not + V_inf\nNghi vấn: Do/Does + S + V_inf?" +
                "\nVí Dụ:\n" +
                "She gets up at 6 o’clock.(Cô thức dậy lúc 6 giờ)\n" +
                "She doesn’t eat chocolate.(Cô ấy không ăn sô cô la.)\n" +
                "Does she eat pastries?(Cô ấy có ăn bánh ngọt không?)\n" +
                "ĐỐI VỚI ĐỘNG TỪ TO BE\nKhẳng định: S + be (am/is/are) + O\nPhủ định: S + be (am/is/are) + not + O\nNghi vấn: Am/is/are + S + O?\n" +
                "Ví Dụ:\n" +
                "She is a student.(Cô ấy là học sinh)" +
                "She is not a teacher.(Cô ấy không phải là giáo viên)" +
                "Is she a student?(Cô ấy có phải là học sinh không)\n" +
                "Dấu hiệu nhận biết:\n" +
                "Trong câu có chứa các trạng từ chỉ tần suất  như:\n" +
                "Every day/ week/ month…: mỗi ngày/ tuần/ tháng\n" +
                "Often, usually, frequently: thường\n" +
                "Sometimes, occasionally: thỉnh thoảng\n" +
                "Always, constantly: luôn luôn\n" +
                "Seldom, rarely: hiếm khi");
        tenses.add("PRESENT CONTINUOUS: \ndùng để diễn tả những sự việc xảy ra ngay lúc chúng ta nói hay xung quanh thời điểm chúng ta nói, và hành động đó vẫn chưa chấm dứt (còn tiếp tục diễn ra).\n" +
                "Khẳng định: S + am/is/are + V_ing\nEx: She is watching TV now. (Cô ấy đang xem ti vi)\n" +
                "Phủ định: S + am/is/are + not + V_ing\nEx: She is not doing his homework now. (Cô ấy không đang làm bài tập)\n" +
                "Nghi vấn: Am/Is/Are + S + V_ing?\nEx: Is she studying English? (Có phải cô ấy đang học tiếng Anh? )\n" +
                "Cách dùng:\n" +
                "Diễn tả một hành động đang diễn ra và kéo dài tại một thời điểm ở hiện tại. - Ex: The children are playing football now. (Bọn trẻ đang chơi bóng đá bây giờ.)\n" +
                "Thường tiếp theo sau mệnh lệnh, câu đề nghị. - Ex: Look! The child is crying. (Nhìn xem! Đứa trẻ đang khóc.)\n" +
                "Diễn tả 1 hành động xảy ra lặp đi lặp lại, dùng phó từ ALWAYS :\nEx: She is always borrowing our books and then she doesn’t remember. (Cô ấy luôn mượn sách của chúng tôi và sau đó cô ấy không nhớ.)" +
                "Diễn tả một hành động sắp xảy ra (ở trong tương lai gần)\nEx: Tomorrow, I am taking to the train to ohio to visit a relative (ngày mai, tôi sẽ đi tàu tới Ohio để thăm người thân)" +
                "Dấu hiệu nhận biết: Now, right, at the moment, at present.");
        tenses.add("PRESENT PERFECT: \ndùng để diễn tả một hành động, sự việc đã bắt đầu từ trong quá khứ, kéo dài đến hiện tại và có thể tiếp tục tiếp diễn trong tương lai.\n" +
                "Khẳng định: S + have/has + V3/ed + O\nEx: I have done my homework. (Tôi hoàn thành xong bài tập)\n" +
                "Phủ định: S + have/has + not + V3/ed + O\nEx: I haven’t done my homework. (Tôi chưa làm xong bài tập)" +
                "Nghi vấn: Have/has + S + V3/ed + O?\n" +
                "Ex: Have you done your homework? (Em đã làm xong bài tập về nhà chưa ?)\n" +
                "Cách dùng:\n" +
                "- Diễn tả hành động đã xảy ra hoặc chưa bao giờ xảy ra ở 1 thời gian không xác định trong quá khứ.\n" +
                "- Diễn tả sự lặp đi lặp lại của 1 hành động trong quá khứ.\n" +
                "- Được dùng với since và for.\n" +
                "Since + thời gian bắt đầu (1995, I was young, this morning etc.). Khi người nói dùng since, người nghe phải tính thời gian là bao lâu.\n" +
                "For + khoảng thời gian (từ lúc đầu tới bây giờ). Khi người nói dùng for, người nói phải tính thời gian là bao lâu.\n" +
                "Ex: I’ve done all my homework (Tôi đã làm tất cả bài tập về nhà)\n" +
                "She has lived in Liverpool all her life (Cô ấy đã sống ở Liverpool cả đời)\n" +
                "Dấu hiệu nhận biết: - Just, recently, lately: gần đây, vừa mới\n- Already : đã….rồi , before: đã từng\n- Not….yet: chưa\n- Never, ever\n- Since, for");
        tenses.add("PRESENT PERFECT CONTINUOUS");
        tenses.add("SIMPLE PAST");
        tenses.add("PAST CONTINUOUS");
        tenses.add("PAST PERFECT");
        tenses.add("PAST PERFECT CONTINUOUS");
        tenses.add("SIMPLE FUTURE");
        tenses.add("FUTURE CONTINUOUS");
        tenses.add("FUTURE PERFECT");
        tenses.add("FUTURE PERFECT CONTINUOUS");

        List<String> passivevoice = new ArrayList<String>();
        passivevoice.add("Grammar structure");
        passivevoice.add("Special cases");

        List<String> conditional = new ArrayList<String>();
        conditional.add("TYPE 1");
        conditional.add("TYPE 2");
        conditional.add("TYPE 3");

        List<String> wishes = new ArrayList<String>();
        wishes.add("Type 1");
        wishes.add("Type 2");
        wishes.add("Type 3");

        listdataChild.put(listdataHeader.get(0),tenses);
        listdataChild.put(listdataHeader.get(1),passivevoice);
        listdataChild.put(listdataHeader.get(2),conditional);
        listdataChild.put(listdataHeader.get(3),wishes);



    }

}