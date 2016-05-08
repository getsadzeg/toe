package andromeda.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    HashMap<Integer, String> map = new HashMap<>();
    public static final String X = "X";
    public static final String O = "O";
    int counter = 0;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button)findViewById(R.id.button1);
        bt2 = (Button)findViewById(R.id.button2);
        bt3 = (Button)findViewById(R.id.button3);
        bt4 = (Button)findViewById(R.id.button4);
        bt5 = (Button)findViewById(R.id.button5);
        bt6 = (Button)findViewById(R.id.button6);
        bt7 = (Button)findViewById(R.id.button7);
        bt8 = (Button)findViewById(R.id.button8);
        bt9 = (Button)findViewById(R.id.button9);
        map.put(1, bt1.getText().toString());
        map.put(2, bt2.getText().toString());
        map.put(3, bt3.getText().toString());
        map.put(4, bt4.getText().toString());
        map.put(5, bt5.getText().toString());
        map.put(6, bt6.getText().toString());
        map.put(7, bt7.getText().toString());
        map.put(8, bt8.getText().toString());
        map.put(9, bt9.getText().toString());

    }

    public void bt1OnClick(View a) {
        if(map.get(1).isEmpty()) {
            counter++;
            if (this.counter % 2 == 1) {
                bt1.setText(X);
                map.put(1, X);
            }
            else {
                bt1.setText(O);
                map.put(1, O);
            }
        }
        check(1,2,3);
        check(1,4,7);
        check(1,5,9);
    }
    public void bt2OnClick(View b) {
        if(map.get(2).isEmpty()) {
            counter++;
            if (this.counter % 2 == 1) {
                bt2.setText(X);
                map.put(2, X);
            }
            else {
                bt2.setText(O);
                map.put(2, O);
            }
        }
        check(1,2,3);
        check(2,5,8);
    }
    public void bt3OnClick(View c) {
        if(map.get(3).isEmpty()) {
            counter++;
            if (this.counter % 2 == 1) {
                bt3.setText(X);
                map.put(3, X);
            }
            else {
                bt3.setText(O);
                map.put(3, O);
            }
        }
        check(1,2,3);
        System.out.println(bt1.getText().toString() + bt2.getText().toString() + bt3.getText().toString());
        check(3,6,9);
        check(3,5,7);
    }
    public void bt4OnClick(View d) {
        if(map.get(4).isEmpty()) {
            counter++;
            if (this.counter % 2 == 1) {
                bt4.setText(X);
                map.put(4, X);
            }
            else {
                bt4.setText(O);
                map.put(4, O);
            }
        }
        check(4,5,6);
        check(1,4,7);
    }
    public void bt5OnClick(View e) {
        if(map.get(5).isEmpty()) {
            counter++;
            if (this.counter % 2 == 1) {
                bt5.setText(X);
                map.put(5, X);
            }
            else {
                bt5.setText(O);
                map.put(5, O);
            }
        }
        check(4,5,6);
        check(2,5,8);
        check(1,5,9);
    }
    public void bt6OnClick(View f) {
        if(map.get(6).isEmpty()) {
            counter++;
            if (this.counter % 2 == 1) {
                bt6.setText(X);
                map.put(6, X);
            }
            else {
                bt6.setText(O);
                map.put(6, O);
            }
        }
        check(4,5,6);
        check(3,6,9);
    }
    public void bt7OnClick(View g) {
        if(map.get(7).isEmpty()) {
            counter++;
            if (this.counter % 2 == 1) {
                bt7.setText(X);
                map.put(7, X);
            }
            else {
                bt7.setText(O);
                map.put(7, O);
            }
        }
        check(7,8,9);
        check(1,4,7);
        check(3,5,7);
    }
    public void bt8OnClick(View h) {
        if(map.get(8).isEmpty()) {
            counter++;
            if (this.counter % 2 == 1) {
                bt8.setText(X);
                map.put(8, X);
            }
            else {
                bt8.setText(O);
                map.put(8, O);
            }
        }
        check(7,8,9);
        check(2,5,8);
    }
    public void bt9OnClick(View i) {
        if(map.get(9).isEmpty()) {
            counter++;
            if (this.counter % 2 == 1) {
                bt9.setText(X);
                map.put(9, X);
            }
            else {
                bt9.setText(O);
                map.put(9, O);
            }
        }
        check(7,8,9);
        check(3,6,9);
        check(1,5,9);
    }
    public void check(int a, int b, int c) {
        if(map.get(a).equals(X) && map.get(b).equals(X) &&
                map.get(c).equals(X))
            Toast.makeText(getApplicationContext(), "მოიგო X-მა",
                    Toast.LENGTH_LONG).show();
        else if(map.get(a).equals(O) && map.get(b).equals(O) &&
                map.get(c).equals(O))
            Toast.makeText(getApplicationContext(), "მოიგო O-მა",
                    Toast.LENGTH_LONG).show();
    }
    public void restartOnClick(View k) {
        bt1.setText("");
        map.put(1,"");
        bt2.setText("");
        map.put(2,"");
        bt3.setText("");
        map.put(3,"");
        bt4.setText("");
        map.put(4,"");
        bt5.setText("");
        map.put(5,"");
        bt6.setText("");
        map.put(6, "");
        bt7.setText("");
        map.put(7,"");
        bt8.setText("");
        map.put(8, "");
        bt9.setText("");
        map.put(9, "");
        counter = 0;
    }


}
