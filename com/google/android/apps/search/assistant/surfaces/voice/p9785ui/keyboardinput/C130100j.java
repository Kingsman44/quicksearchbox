package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.view.View;
import android.widget.EditText;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.j */
/* compiled from: PG */
public final /* synthetic */ class C130100j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C130109s f356736a;

    /* renamed from: b */
    public final /* synthetic */ String f356737b;

    public /* synthetic */ C130100j(C130109s sVar, String str) {
        this.f356736a = sVar;
        this.f356737b = str;
    }

    public final void onClick(View view) {
        C130109s sVar = this.f356736a;
        String str = this.f356737b;
        EditText a = C130109s.m212407a(sVar.f356752b);
        a.setText(str);
        a.setSelection(a.getText().length());
    }
}
