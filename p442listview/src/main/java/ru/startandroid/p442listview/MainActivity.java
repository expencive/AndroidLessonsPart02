package ru.startandroid.p442listview;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] catNamesArray;
    private ArrayAdapter<String> mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist);

        catNamesArray = new String[] { "Рыжик", "Барсик", "Мурзик",
                "Мурка", "Васька", "Томасина", "Бобик", "Кристина", "Пушок",
                "Дымка", "Кузя", "Китти", "Барбос", "Масяня", "Симба" };

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, catNamesArray);
        setListAdapter(mAdapter);

    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getApplicationContext(),
                "Вы выбрали " + (position + 1) + " элемент. " + l.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
        String telefon = "+79500052489";
        String servicekey = "2*1";
        String toSms="smsto:"+telefon;
        String messageText= "Введите номер телефона и код управления в Настройках";
        Intent sms=new Intent(Intent.ACTION_SENDTO, Uri.parse(toSms));
        switch (position) {
            case 0:
                messageText= "01# " + servicekey;
                break;
            case 1:
                messageText= "02# " + servicekey;
                break;

        }
        sms.putExtra("sms_body", messageText);
        startActivity(sms);
        Toast.makeText(this, "Нажмите кнопку отправки СМС", Toast.LENGTH_SHORT).show();
    }
}
