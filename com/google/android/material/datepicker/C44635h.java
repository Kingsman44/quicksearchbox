package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C44741bm;

/* renamed from: com.google.android.material.datepicker.h */
/* compiled from: PG */
public final /* synthetic */ class C44635h implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText[] f116297a;

    public /* synthetic */ C44635h(EditText[] editTextArr) {
        this.f116297a = editTextArr;
    }

    public final void onFocusChange(View view, boolean z) {
        EditText[] editTextArr = this.f116297a;
        int i = 0;
        while (i <= 0) {
            if (!editTextArr[i].hasFocus()) {
                i++;
            } else {
                return;
            }
        }
        C44741bm.m79314g(view, true);
    }
}
