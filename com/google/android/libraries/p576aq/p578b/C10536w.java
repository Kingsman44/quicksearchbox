package com.google.android.libraries.p576aq.p578b;

import android.widget.EditText;

/* renamed from: com.google.android.libraries.aq.b.w */
/* compiled from: PG */
public final /* synthetic */ class C10536w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EditText f35289a;

    public /* synthetic */ C10536w(EditText editText) {
        this.f35289a = editText;
    }

    public final void run() {
        EditText editText = this.f35289a;
        editText.requestFocus();
        C10537x.m25481a(editText).showSoftInput(editText, 0);
    }
}
