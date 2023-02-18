package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btn_history;
    Button bang,cong,tru,nhan,chia,ac,c,btdot;
    TextView mainscreen, secondscreen;
    String tinhtoan;
    String pheptoan;
    boolean checkDot=false,checkBang=false;
    double so1,so2,ketqua;
    public void openHistory() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_history=(Button) findViewById(R.id.btn_history);
        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHistory();

            }

        });



        anhxa();
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondscreen.setText("");
                mainscreen.setText("");
                tinhtoan="";
                pheptoan="";
                checkBang=false;
                checkDot=false;
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "0");
                }
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "1");
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "2");
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "3");
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "4");
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "5");
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "6");
                }
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "7");
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "8");
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "9");
                }
            }
        });

        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    if (!checkDot) {
                        tinhtoan = mainscreen.getText().toString();
                        mainscreen.setText(tinhtoan + ".");
                        checkDot = true;
                    }
                }
            }
        });

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainscreen.getText() == "") {
                    so1 = 0;
                    secondscreen.setText("0 +");
                }
                else {
                    so1 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + " + ");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "+";
                checkDot = false;
                checkBang = false;
            }
        });


        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainscreen.getText() == "") {
                    so1 = 0;
                    secondscreen.setText("0 -");
                }
                else {
                    so1 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + " - ");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "-";
                checkDot = false;
                checkBang = false;
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainscreen.getText() == "") {
                    so1 = 0;
                    secondscreen.setText("0 x");
                }
                else {
                    so1 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + " x ");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "*";
                checkDot = false;
                checkBang = false;
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainscreen.getText() == "") {
                    so1 = 0;
                    secondscreen.setText("0 /");
                }
                else {
                    so1 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + " / ");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "/";
                checkDot = false;
                checkBang = false;
            }
        });

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    checkDot = false;
                    tinhtoan = mainscreen.getText().toString();
                    so2 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(secondscreen.getText().toString() + mainscreen.getText().toString() + "");
                    mainscreen.setText("");
                    if (pheptoan == "+")
                        ketqua = so1 + so2;
                    else if (pheptoan == "-")
                        ketqua = so1 - so2;
                    else if (pheptoan == "*")
                        ketqua = so1 * so2;
                    else if (pheptoan == "/")
                        ketqua = so1 / so2;
                    checkBang = true;
                    mainscreen.setText(ketqua + "");
                }
                pheptoan="";
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    String val = mainscreen.getText().toString();
                    if (!val.isEmpty()) {
                        val = val.substring(0, val.length() -1);
                        mainscreen.setText(val);
                    }
                }
            }
        });

    }

    protected void anhxa()
    {
        bt0 = findViewById(R.id.so0);
        bt1 = findViewById(R.id.so1);
        bt2 = findViewById(R.id.so2);
        bt3 = findViewById(R.id.so3);
        bt4 = findViewById(R.id.so4);
        bt5 = findViewById(R.id.so5);
        bt6 = findViewById(R.id.so6);
        bt7 = findViewById(R.id.so7);
        bt8 = findViewById(R.id.so8);
        bt9 = findViewById(R.id.so9);
        btdot = findViewById(R.id.daucham);
        bang = findViewById(R.id.bang);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);
        ac = findViewById(R.id.ac);
        c = findViewById(R.id.c);
        mainscreen = findViewById(R.id.man_hinh);
        secondscreen = findViewById(R.id.man_hinh_phu);
    }
}