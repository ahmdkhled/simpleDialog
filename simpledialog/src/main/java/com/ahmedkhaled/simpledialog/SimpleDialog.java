package com.ahmedkhaled.simpledialog;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Ahmed Khaled on 9/11/2017.
 */

public class SimpleDialog {
    private AlertDialog mAlertDialog;
    private LayoutInflater inflater;
    private View view;
    private Button ok,cancel;
    private TextView title_Tv,message_Tv;
    private ViewGroup titleContainer,messageContainer,buttonsContainer;
    private String title;
    private String message;
    private int titleContainerColor,messageContainerColor,buttonsContainerColor;
    private int negativeButttonColor,positiveButttonColor;
    private int titleColor,messageColor;


    public SimpleDialog(Context context) {
        mAlertDialog=new AlertDialog.Builder(context).create();
        inflater=LayoutInflater.from(context);
        setupDefaults();
    }

    public void show(){
        if (view==null) {
            view = inflater.inflate(R.layout.dialog_design, null);
            ok= (Button) view.findViewById(R.id.ok);
            cancel= (Button) view.findViewById(R.id.cancel);
            title_Tv= (TextView) view.findViewById(R.id.title_Tv);
            message_Tv= (TextView) view.findViewById(R.id.message_Tv);

            titleContainer= (ViewGroup) view.findViewById(R.id.titleContainer);
            messageContainer= (ViewGroup) view.findViewById(R.id.messageContainer);
            buttonsContainer= (ViewGroup) view.findViewById(R.id.buttonsContainer);
        }
        title_Tv.setText(getTitle());
        message_Tv.setText(getMessage());

        title_Tv.setTextColor(getTitleColor());
        message_Tv.setTextColor(getMessageColor());

        titleContainer.setBackgroundColor(getTitleContainerColor());
        messageContainer.setBackgroundColor(getMessageContainerColor());
        buttonsContainer.setBackgroundColor(getButtonsContainerColor());

        ok.setBackgroundColor(getPositiveButttonColor());
        cancel.setBackgroundColor(getNegativeButttonColor());



        mAlertDialog.setView(view);
        mAlertDialog.show();

    }

    private void setupDefaults(){
        setMessageColor(Color.parseColor("#000000"));
        setTitleColor(Color.parseColor("#ffffff"));

        setTitleContainerColor(Color.parseColor("#1594e2"));
        setMessageContainerColor(Color.parseColor("#ffffff"));
        setButtonsContainerColor(Color.parseColor("#f9f7f7"));
    }

    public void dismiss(){
        mAlertDialog.dismiss();
    }

    public void setOnPositiveButtonClickListener(String name,View.OnClickListener onClickListener){
        ok.setText(name);
        ok.setOnClickListener(onClickListener);
    }

    public void setOnNegativeButtonClickListener(String name,View.OnClickListener onClickListener){
        cancel.setText(name);
        cancel.setOnClickListener(onClickListener);
    }

    private String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTitleContainerColor() {
        return titleContainerColor;
    }

    public void setTitleContainerColor(int titleContainerColor) {
        this.titleContainerColor = titleContainerColor;
    }

    public int getMessageContainerColor() {
        return messageContainerColor;
    }

    public void setMessageContainerColor(int messageContainerColor) {
        this.messageContainerColor = messageContainerColor;
    }

    public int getButtonsContainerColor() {
        return buttonsContainerColor;
    }

    public void setButtonsContainerColor(int buttonsContainerColor) {
        this.buttonsContainerColor = buttonsContainerColor;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }

    public int getMessageColor() {
        return messageColor;
    }

    public void setMessageColor(int messageColor) {
        this.messageColor = messageColor;
    }

    public int getNegativeButttonColor() {
        return negativeButttonColor;
    }

    public void setNegativeButttonColor(int negativeButttonColor) {
        this.negativeButttonColor = negativeButttonColor;
    }

    public int getPositiveButttonColor() {
        return positiveButttonColor;
    }

    public void setPositiveButttonColor(int positiveButttonColor) {
        this.positiveButttonColor = positiveButttonColor;
    }
}
