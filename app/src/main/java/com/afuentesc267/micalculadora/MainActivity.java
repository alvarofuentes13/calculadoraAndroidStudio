/*package com.afuentesc267.micalculadora;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String operador;
    String text;
    *//*ArrayList<Double> numeros = new ArrayList<>();*//*

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonSubstract = findViewById(R.id.buttonSubstract);
        Button buttonResult = findViewById(R.id.buttonResult);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);

        TextView pantalla = findViewById(R.id.pantallaTV);


        ArrayList<Button> arrayNumeros = new ArrayList<>();
        arrayNumeros.add(button0);
        arrayNumeros.add(button1);
        arrayNumeros.add(button2);
        arrayNumeros.add(button3);
        arrayNumeros.add(button4);
        arrayNumeros.add(button5);
        arrayNumeros.add(button6);
        arrayNumeros.add(button7);
        arrayNumeros.add(button8);
        arrayNumeros.add(button9);
        arrayNumeros.add(buttonDot);

        for (Button button :
                arrayNumeros) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    pantalla.setText(pantalla.getText() + "" + button.getText());
                }
            });
        }

        ArrayList<Button> arrayOpercaiones = new ArrayList<>();
        arrayOpercaiones.add(buttonAdd);
        arrayOpercaiones.add(buttonSubstract);
        arrayOpercaiones.add(buttonMultiply);
        arrayOpercaiones.add(buttonDivide);

        for (Button button : arrayOpercaiones) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String textoPantalla = pantalla.getText().toString();
                    if (operador != null || (textoPantalla.contains("\\+") || textoPantalla.contains("\\*") || textoPantalla.contains("-") || textoPantalla.contains("/") )) {
                        String[] num = textoPantalla.split(operador);

                        switch (operador) {
                            case "\\+":
                                pantalla.setText(Double.parseDouble(num[0]) + Double.parseDouble(num[1]) + "+");
                                operador = null;
                                break;

                            case "-":
                                pantalla.setText(Double.parseDouble(num[0]) - Double.parseDouble(num[1]) + "-");
                                operador = null;
                                break;

                            case "\\*":
                                pantalla.setText(Double.parseDouble(num[0]) * Double.parseDouble(num[1]) + "*");
                                operador = null;
                                break;

                            case "/":
                                pantalla.setText(Double.parseDouble(num[0]) / Double.parseDouble(num[1]) + "/");
                                operador = null;
                                break;
                        }

                    } else {
                        pantalla.append(button.getText());
                        text = (String) button.getText();
                        switch (text) {
                            case "+":
                                operador = "\\+";
                                break;

                            case "*":
                                operador = "\\*";
                                break;

                            case "-":
                                operador = "-";
                                break;

                            case "/":
                                operador = "/";
                                break;
                        }
                    }
                }
            });
        }


        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

}*/

package com.afuentesc267.micalculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String operador = null;
    double num1 = 0;
    double num2 = 0;
    String numero = "";
    String textoPantalla = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonSubstract = findViewById(R.id.buttonSubstract);
        Button buttonResult = findViewById(R.id.buttonResult);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonCE = findViewById(R.id.buttonCE);
        Button buttonAC = findViewById(R.id.buttonAC);

        TextView pantalla = findViewById(R.id.pantallaTV);

        View.OnClickListener listenerNumeros = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                numero += button.getText().toString();
                textoPantalla += button.getText().toString();
                pantalla.setText(textoPantalla);
            }
        };


        button0.setOnClickListener(listenerNumeros);
        button1.setOnClickListener(listenerNumeros);
        button2.setOnClickListener(listenerNumeros);
        button3.setOnClickListener(listenerNumeros);
        button4.setOnClickListener(listenerNumeros);
        button5.setOnClickListener(listenerNumeros);
        button6.setOnClickListener(listenerNumeros);
        button7.setOnClickListener(listenerNumeros);
        button8.setOnClickListener(listenerNumeros);
        button9.setOnClickListener(listenerNumeros);
        buttonDot.setOnClickListener(listenerNumeros);


        View.OnClickListener listenerOperadores = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numero.isEmpty()) {
                    Button button = (Button) view;
                    operador = button.getText().toString();
                    num1 = Double.parseDouble(numero);
                    numero = "";

                    textoPantalla += operador;
                    pantalla.setText(textoPantalla);
                }

            }
        };


        buttonAdd.setOnClickListener(listenerOperadores);
        buttonSubstract.setOnClickListener(listenerOperadores);
        buttonMultiply.setOnClickListener(listenerOperadores);
        buttonDivide.setOnClickListener(listenerOperadores);

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!numero.isEmpty()) {
                    numero = numero.substring(0, numero.length() - 1);
                    textoPantalla = textoPantalla.substring(0, textoPantalla.length() - 1);
                    pantalla.setText(textoPantalla);
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero = "";
                textoPantalla = "";
                operador = null;
                pantalla.setText("");
            }
        });

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numero.isEmpty() && operador != null) {
                    num2 = Double.parseDouble(numero);
                    double resultado = 0;
                    switch (operador) {
                        case "+":
                            resultado = num1 + num2;
                            break;
                        case "-":
                            resultado = num1 - num2;
                            break;
                        case "*":
                            resultado = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                pantalla.setText("n/0  ->  :(");
                                return;
                            }
                            resultado = num1 / num2;
                            break;
                    }

                    textoPantalla = String.valueOf(resultado);
                    pantalla.setText(textoPantalla);
                    numero = String.valueOf(resultado);
                    operador = null;
                } else {
                    pantalla.setText("Error");
                }
            }
        });
    }
}
