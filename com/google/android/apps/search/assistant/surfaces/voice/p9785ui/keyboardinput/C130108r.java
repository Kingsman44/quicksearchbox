package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.view.ViewTreeObserver;
import android.widget.EditText;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.r */
/* compiled from: PG */
final class C130108r implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ EditText f356749a;

    /* renamed from: b */
    final /* synthetic */ C130109s f356750b;

    public C130108r(C130109s sVar, EditText editText) {
        this.f356750b = sVar;
        this.f356749a = editText;
    }

    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            EditText editText = this.f356749a;
            editText.post(new C130107q(this, editText));
            this.f356749a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
