package com.google.android.libraries.surveys.internal.view;

import android.widget.EditText;

/* renamed from: com.google.android.libraries.surveys.internal.view.f */
/* compiled from: PG */
public final /* synthetic */ class C43148f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EditText f112837a;

    public /* synthetic */ C43148f(EditText editText) {
        this.f112837a = editText;
    }

    public final void run() {
        EditText editText = this.f112837a;
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
    }
}
