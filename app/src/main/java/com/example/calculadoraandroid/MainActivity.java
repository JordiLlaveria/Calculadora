package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textOperacions;
    TextView textFormat;
    TextView textTrigonometria;
    String operacio = null;
    String operaciotrigonometrica = null;
    boolean operacioabans = false;
    double resultattotal = 0;
    String format = "Degree";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textOperacions = findViewById(R.id.TextOperacions);
        textFormat = findViewById(R.id.TextFormat);
        textTrigonometria = findViewById(R.id.TextTrigonometria);
    }

    public void AsignarOperaci√≥(String operacio) {
        this.resultattotal = Double.parseDouble(String.valueOf(textOperacions.getText()));
        this.operacio = operacio;
        this.operacioabans = true;
    }
    public void AsignarOperaci√≥Trigonometrica(String operacio){
        this.operaciotrigonometrica = operacio;
    }
    public void RealitzarOperaci√≥(double numero1) {
        if (operacio == "Suma") {
            if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Sin"){
                this.resultattotal = this.resultattotal + Math.sin(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Sin"){
                this.resultattotal = this.resultattotal + Math.sin(numero1);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Cos"){
                this.resultattotal = this.resultattotal + Math.cos(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Cos"){
                this.resultattotal = this.resultattotal + Math.cos(numero1);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Tan"){
                this.resultattotal = this.resultattotal + Math.tan(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Tan"){
                this.resultattotal = this.resultattotal + Math.tan(numero1);
                this.operaciotrigonometrica=null;
            }
            else {
                this.resultattotal = this.resultattotal + numero1;
            }
        } else if (operacio == "Resta") {
            if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Sin"){
                this.resultattotal = this.resultattotal - Math.sin(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Sin"){
                this.resultattotal = this.resultattotal - Math.sin(numero1);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Cos"){
                this.resultattotal = this.resultattotal - Math.cos(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Cos"){
                this.resultattotal = this.resultattotal - Math.cos(numero1);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Tan"){
                this.resultattotal = this.resultattotal - Math.tan(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Tan"){
                this.resultattotal = this.resultattotal - Math.tan(numero1);
                this.operaciotrigonometrica=null;
            }
            else {
                this.resultattotal = this.resultattotal - numero1;
            }
        } else if (operacio == "Multiplicaci√≥") {
            if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Sin"){
                this.resultattotal = this.resultattotal * Math.sin(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Sin"){
                this.resultattotal = this.resultattotal * Math.sin(numero1);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Cos"){
                this.resultattotal = this.resultattotal * Math.cos(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Cos"){
                this.resultattotal = this.resultattotal * Math.cos(numero1);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Tan"){
                this.resultattotal = this.resultattotal * Math.tan(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Tan"){
                this.resultattotal = this.resultattotal * Math.tan(numero1);
                this.operaciotrigonometrica=null;
            }
            else {
                this.resultattotal = this.resultattotal * numero1;
            }
        } else if (operacio == "Divisi√≥") {
            if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Sin"){
                this.resultattotal = this.resultattotal / Math.sin(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Sin"){
                this.resultattotal = this.resultattotal / Math.sin(numero1);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Cos"){
                this.resultattotal = this.resultattotal / Math.cos(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Cos"){
                this.resultattotal = this.resultattotal / Math.cos(numero1);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Degree")==true && operaciotrigonometrica=="Tan"){
                this.resultattotal = this.resultattotal / Math.tan(numero1 * Math.PI/180);
                this.operaciotrigonometrica=null;
            }
            else if (textFormat.getText().equals("Radians")==true && operaciotrigonometrica=="Tan"){
                this.resultattotal = this.resultattotal / Math.tan(numero1);
                this.operaciotrigonometrica=null;
            }
            else {
                this.resultattotal = this.resultattotal / numero1;
            }
        } else if (operacio == "Sin" && textFormat.getText().equals("Degree")==true) {
            numero1 = numero1 * Math.PI/180;
            this.operaciotrigonometrica=null;
            this.resultattotal = Math.sin(numero1);
        } else if (operacio == "Cos" && textFormat.getText().equals("Degree")==true) {
            numero1 = numero1 * Math.PI/180;
            this.operaciotrigonometrica=null;
            this.resultattotal = Math.cos(numero1);
        } else if (operacio == "Tan" && textFormat.getText().equals("Degree")==true) {
            numero1 = numero1 * Math.PI/180;
            this.operaciotrigonometrica=null;
            this.resultattotal = Math.tan(numero1);
        } else if (operacio == "Sin" && textFormat.getText().equals("Radians")==true) {
            this.resultattotal = Math.sin(numero1);
            this.operaciotrigonometrica=null;
        } else if (operacio == "Cos" && textFormat.getText().equals("Radians")==true) {
            this.resultattotal = Math.cos(numero1);
            this.operaciotrigonometrica=null;
        } else if (operacio == "Tan" && textFormat.getText().equals("Radians")==true) {
            this.resultattotal = Math.tan(numero1);
            this.operaciotrigonometrica=null;
        }
        textOperacions.setText(Double.toString(this.resultattotal));
        this.operacio = null;
        this.operacioabans = false;
    }
    public void clickNumero(View v){
        Button bt = (Button)v;
        String numero = (String) bt.getText();
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText(numero);
        }
        else{
            textOperacions.setText(textOperacions.getText() + numero);
        }
    }
    /*
    public void click1(View v) {
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("1");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "1");
        }
    }

    public void click2(View v) {

        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("2");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "2");
        }
    }

    public void click3(View v) {
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("3");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "3");
        }
    }
    public void click4(View v) {
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("4");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "4");
        }
    }
    public void click5(View v) {
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("5");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "5");
        }
    }
    public void click6(View v) {
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("6");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "6");
        }
    }
    public void click7(View v) {
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("7");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "7");
        }
    }
    public void click8(View v) {
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("8");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "8");
        }
    }
    public void click9(View v) {
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("9");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "9");
        }
    }
    public void click0(View v) {
        if (operacioabans==true) {
            textOperacions.setText(null);
            this.operacioabans=false;
        }
        if (textOperacions.getText().equals("0") == true){
            textOperacions.setText("0");
        }
        else{
            textOperacions.setText(textOperacions.getText() + "0");
        }
    }
    */
    public void clickOperacio(View v){
        if (this.operacio == null) {
            Button bt = (Button)v;
            if (bt.getText().equals("+") == true) {
                AsignarOperaci√≥("Suma");
            }
            else if (bt.getText().equals("-") == true){
                AsignarOperaci√≥("Resta");
            }
            else if (bt.getText().equals("*") == true){
                AsignarOperaci√≥("Multiplicaci√≥");
            }
            else if (bt.getText().equals("/") == true){
                AsignarOperaci√≥("Divisi√≥");
            }
        }
        else {
            RealitzarOperaci√≥(Double.parseDouble(String.valueOf(textOperacions.getText())));
        }
        textTrigonometria.setText("");
    }
    /*
    public void clickSuma(View v){
        if (this.operacio == null) {
            AsignarOperaci√≥("Suma");
        }
        else {
            RealitzarOperaci√≥(Double.parseDouble(String.valueOf(textOperacions.getText())));
        }
        textTrigonometria.setText("");
    }
    public void clickSubstract(View v){
        if (this.operacio == null) {
            AsignarOperaci√≥("Resta");
        }
        else {
            RealitzarOperaci√≥(Double.parseDouble(String.valueOf(textOperacions.getText())));
        }
        textTrigonometria.setText("");
    }
    public void clickMultiply(View v){
        if (this.operacio == null) {
            AsignarOperaci√≥("Multiplicaci√≥");
        }
        else {
            RealitzarOperaci√≥(Double.parseDouble(String.valueOf(textOperacions.getText())));
        }
        textTrigonometria.setText("");
    }
    public void clickDivide(View v){
        if (this.operacio == null) {
            AsignarOperaci√≥("Divisi√≥");
        }
        else {
            RealitzarOperaci√≥(Double.parseDouble(String.valueOf(textOperacions.getText())));
        }
        textTrigonometria.setText("");
    }
    */
    public void clickEqual(View v){
        RealitzarOperaci√≥(Double.parseDouble(String.valueOf(textOperacions.getText())));
        textOperacions.setText(Double.toString(this.resultattotal));
        textTrigonometria.setText("");
        this.operacio = null;
        this.operacioabans = false;
    }
    public void clickClear(View v){
        textOperacions.setText("0");
        this.resultattotal=0;
        textTrigonometria.setText("");
    }
    public void changeDegree(View v) {
        textFormat.setText("Degree");
    }
    public void changeRadians(View v){
        textFormat.setText("Radians");
    }
    public void clickCos(View v){
        if (operacio==null){
            AsignarOperaci√≥("Cos");
        }
        else{
            AsignarOperaci√≥Trigonometrica("Cos");
        }
        textTrigonometria.setText("cos(");
        textOperacions.setText("0");
    }
    public void clickSin(View v){
        textTrigonometria.setText("sin(");
        textOperacions.setText("0");
        if (operacio==null){
            AsignarOperaci√≥("Sin");
        }
        else{
            AsignarOperaci√≥Trigonometrica("Sin");
        }
    }
    public void clickTan(View v){
        textTrigonometria.setText("tan(");
        textOperacions.setText("0");
        if (operacio==null){
            AsignarOperaci√≥("Tan");
        }
        else{
            AsignarOperaci√≥Trigonometrica("Tan");
        }
    }
}