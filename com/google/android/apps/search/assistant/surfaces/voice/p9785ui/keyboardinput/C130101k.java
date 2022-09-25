package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.k */
/* compiled from: PG */
public final /* synthetic */ class C130101k implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C130109s f356738a;

    /* renamed from: b */
    public final /* synthetic */ EditText f356739b;

    public /* synthetic */ C130101k(C130109s sVar, EditText editText) {
        this.f356738a = sVar;
        this.f356739b = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C130109s sVar = this.f356738a;
        EditText editText = this.f356739b;
        if (i != 2) {
            return false;
        }
        if (editText.getText().toString().trim().isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        }
        sVar.mo109500e(editText.getText().toString());
        return true;
    }
}
