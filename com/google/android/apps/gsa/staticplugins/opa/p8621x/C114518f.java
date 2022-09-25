package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.f */
/* compiled from: PG */
public final /* synthetic */ class C114518f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114524l f317581a;

    /* renamed from: b */
    public final /* synthetic */ EditText f317582b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f317583c;

    public /* synthetic */ C114518f(C114524l lVar, EditText editText, RadioButton radioButton) {
        this.f317581a = lVar;
        this.f317582b = editText;
        this.f317583c = radioButton;
    }

    public final void onClick(View view) {
        C114524l lVar = this.f317581a;
        EditText editText = this.f317582b;
        RadioButton radioButton = this.f317583c;
        String obj = editText.getText().toString();
        lVar.f317600h = true;
        lVar.mo101385c(radioButton, obj);
    }
}
