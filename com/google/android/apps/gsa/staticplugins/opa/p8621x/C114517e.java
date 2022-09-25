package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.view.KeyEvent;
import android.widget.RadioButton;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.e */
/* compiled from: PG */
public final /* synthetic */ class C114517e implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C114524l f317578a;

    /* renamed from: b */
    public final /* synthetic */ TextView f317579b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f317580c;

    public /* synthetic */ C114517e(C114524l lVar, TextView textView, RadioButton radioButton) {
        this.f317578a = lVar;
        this.f317579b = textView;
        this.f317580c = radioButton;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C114524l lVar = this.f317578a;
        TextView textView2 = this.f317579b;
        RadioButton radioButton = this.f317580c;
        if (i != 4 || !textView2.isClickable()) {
            return false;
        }
        String obj = textView.getText().toString();
        lVar.f317600h = true;
        lVar.mo101385c(radioButton, obj);
        return true;
    }
}
