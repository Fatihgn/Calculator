package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.hesapmakinesi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    boolean noktakontrol=true,yeniislem=false;
    float deger1,deger2,sonuc;
    boolean toplama,cikarma,bolme,carpma,yuzde;
;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main);

        tasarim.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("0");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"0");
                }

            }
        });
        tasarim.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("1");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"1");
                }

            }
        });
        tasarim.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("2");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"2");
                }

            }
        });
        tasarim.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("3");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"3");
                }

            }
        });
        tasarim.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("4");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"4");
                }

            }
        });
        tasarim.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("5");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"5");
                }

            }
        });
        tasarim.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("6");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"6");
                }

            }
        });
        tasarim.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("7");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"7");
                }

            }
        });
        tasarim.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("8");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"8");
                }

            }
        });
        tasarim.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yeniislem==true){
                    tasarim.textViewIslemler.setText("");
                    yeniislem=false;
                }
                if(tasarim.textViewSonuc.getText().equals("0"))
                {
                    tasarim.textViewSonuc.setText("9");
                }
                else
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"9");
                }

            }
        });
        tasarim.buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tasarim.textViewSonuc.setText("0");
                noktakontrol=true;
            }
        });
        tasarim.buttonNokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (noktakontrol==true)
                {
                    tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+".");
                    noktakontrol=false;
                }

            }
        });
        tasarim.buttonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = String.valueOf(tasarim.textViewSonuc.getText());
                temp = temp.substring(0,temp.length()-1);
                if(temp.length()==0)
                {
                    temp="0";
                }
                for(int i=0;i<temp.length();i++)
                {
                    if(temp.charAt(i)=='.')
                    {
                        noktakontrol=false;
                        break;
                    }
                    else
                    {
                        noktakontrol=true;
                    }

                }
                tasarim.textViewSonuc.setText(temp);

            }
        });
        tasarim.buttonArti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(tasarim.textViewIslemler.getText().equals("")){
                        tasarim.textViewIslemler.setText(tasarim.textViewSonuc.getText()+"+");
                        deger1=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                        toplama=true;
                        cikarma=false;
                        bolme=false;
                        carpma=false;
                        yuzde=false;
                        tasarim.textViewSonuc.setText("0");
                        noktakontrol=true;
                    } else if (yeniislem==true) {
                        tasarim.textViewIslemler.setText(sonuc+"+");
                        deger1=sonuc;
                        toplama=true;
                        cikarma=false;
                        bolme=false;
                        carpma=false;
                        yuzde=false;
                        tasarim.textViewSonuc.setText("0");
                        noktakontrol=true;
                        yeniislem=false;

                    } else {
                        tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText()+""+tasarim.textViewSonuc.getText()+"+");
                        deger2=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                        if (cikarma==true)
                        {
                            deger1=deger1-deger2;
                        } else if (bolme==true) {
                            deger1=deger1/deger2;
                        } else if (carpma==true) {
                            deger1=deger1*deger2;
                        } else if(yuzde==true){
                            deger1=deger1/100*deger2;
                        }else {
                            deger1=deger1+deger2;
                        }


                        toplama=true;
                        cikarma=false;
                        bolme=false;
                        carpma=false;
                        yuzde=false;
                        tasarim.textViewSonuc.setText("0");
                        noktakontrol=true;
                    }
                }


        });
        tasarim.buttonCarpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tasarim.textViewIslemler.getText().equals("")){
                    deger1=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                    tasarim.textViewIslemler.setText(tasarim.textViewSonuc.getText()+"×");
                    toplama=false;
                    cikarma=false;
                    bolme=false;
                    carpma=true;
                    yuzde=false;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                }else if (yeniislem==true) {
                    tasarim.textViewIslemler.setText(sonuc+"×");
                    deger1=sonuc;
                    toplama=false;
                    cikarma=false;
                    bolme=false;
                    carpma=true;
                    yuzde=false;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                    yeniislem=false;

                }
                else {
                    deger2=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                    tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText() + "" + tasarim.textViewSonuc.getText() + "×");
                    if (cikarma == true) {
                        deger1=deger1-deger2;
                    } else if (bolme == true) {
                        deger1 = deger1 / deger2;
                    } else if (carpma == true) {
                        deger1=deger1*deger2;
                    }else if(yuzde==true){
                        deger1=deger1/100*deger2;
                    } else {
                        deger1=deger1+deger2;
                    }


                    toplama = false;
                    cikarma = false;
                    bolme = false;
                    carpma = true;
                    yuzde=false;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol = true;
                }
                }



        });
        tasarim.buttonBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tasarim.textViewIslemler.getText().equals("")){
                    deger1=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                    tasarim.textViewIslemler.setText(tasarim.textViewSonuc.getText()+"÷");
                    cikarma=false;
                    toplama=false;
                    bolme=true;
                    carpma=false;
                    yuzde=false;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                }else if (yeniislem==true) {
                    tasarim.textViewIslemler.setText(sonuc+"÷");
                    deger1=sonuc;
                    toplama=false;
                    cikarma=false;
                    bolme=true;
                    carpma=false;
                    yuzde=false;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                    yeniislem=false;

                }
                else {
                    deger2=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                    tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText()+""+tasarim.textViewSonuc.getText()+"÷");
                    if (toplama==true)
                    {
                        deger1=deger1+deger2;
                    }else if (bolme==true) {
                        deger1=deger1/deger2;
                    } else if (carpma==true) {
                        deger1=deger1*deger2;
                    }else if(yuzde==true){
                        deger1=deger1/100*deger2;
                    } else{
                        deger1=deger1-deger2;
                    }
                    cikarma=false;
                    toplama=false;
                    bolme=true;
                    carpma=false;
                    yuzde=false;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                }


            }
        });
        tasarim.buttonEksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tasarim.textViewIslemler.getText().equals("")){
                    tasarim.textViewIslemler.setText(tasarim.textViewSonuc.getText()+"-");
                    deger1=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                    cikarma=true;
                    toplama=false;
                    bolme=false;
                    carpma=false;
                    yuzde=false;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                }else if (yeniislem==true) {
                    tasarim.textViewIslemler.setText(sonuc+"-");
                    deger1=sonuc;
                    toplama=false;
                    cikarma=true;
                    bolme=false;
                    carpma=false;
                    yuzde=false;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                    yeniislem=false;

                }
                else {
                    tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText()+""+tasarim.textViewSonuc.getText()+"-");
                    deger2=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                    if (toplama==true)
                    {
                        deger1=deger1+deger2;
                    }else if (bolme==true) {
                        deger1=deger1/deger2;
                    } else if (carpma==true) {
                        deger1=deger1*deger2;
                    }else if(yuzde==true){
                        deger1=deger1/100*deger2;
                    }
                    else{
                        deger1=deger1-deger2;
                    }
                    cikarma=true;
                    toplama=false;
                    bolme=false;
                    yuzde=false;
                    carpma=false;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                }


            }
        });
        tasarim.buttonYuzde.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tasarim.textViewIslemler.getText().equals("")){
                    tasarim.textViewIslemler.setText(tasarim.textViewSonuc.getText()+"%");
                    deger1=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                    cikarma=false;
                    toplama=false;
                    bolme=false;
                    carpma=false;
                    yuzde=true;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                }else if (yeniislem==true) {
                    tasarim.textViewIslemler.setText(sonuc+"%");
                    deger1=sonuc;
                    toplama=false;
                    cikarma=false;
                    bolme=false;
                    carpma=false;
                    yuzde=true;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                    yeniislem=false;

                }else {
                    deger2=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                    tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText()+""+tasarim.textViewSonuc.getText()+"%");
                    if (toplama==true)
                    {
                        deger1=deger1+deger2;
                    }else if (bolme==true) {
                        deger1=deger1/deger2;
                    } else if (carpma==true) {
                        deger1=deger1*deger2;
                    }else if(yuzde==true){
                        deger1=deger1/100*deger2;
                    }
                    else{
                        deger1=deger1-deger2;
                    }
                    cikarma=false;
                    toplama=false;
                    bolme=false;
                    carpma=false;
                    yuzde=true;
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                }

            }
        }));






        tasarim.buttonEsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc=Float.parseFloat(tasarim.textViewSonuc.getText()+"");
                if (toplama==true)
                {
                    sonuc=sonuc+deger1;
                    tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText()+""+tasarim.textViewSonuc.getText()+"="+sonuc);
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                    yeniislem=true;
                    toplama=false;

                }
                if(cikarma==true) {
                    sonuc=deger1-sonuc;
                    tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText()+""+tasarim.textViewSonuc.getText()+"="+sonuc);
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                    yeniislem=true;
                    cikarma=false;
                }
                if(bolme==true) {
                    sonuc=deger1/sonuc;
                    tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText()+""+tasarim.textViewSonuc.getText()+"="+sonuc);
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                    yeniislem=true;
                    bolme=false;
                }
                if(carpma==true) {
                    sonuc=sonuc*deger1;
                    tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText()+""+tasarim.textViewSonuc.getText()+"="+sonuc);
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                    yeniislem=true;
                    carpma=false;
                }
                if(yuzde==true){
                    sonuc=deger1/100*sonuc;
                    tasarim.textViewIslemler.setText(tasarim.textViewIslemler.getText()+""+tasarim.textViewSonuc.getText()+"="+sonuc);
                    tasarim.textViewSonuc.setText("0");
                    noktakontrol=true;
                    yeniislem=true;
                    yuzde=false;
                }


            }
        });



    }
}