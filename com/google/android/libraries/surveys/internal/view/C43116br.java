package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import android.widget.EditText;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.br */
/* compiled from: PG */
public final /* synthetic */ class C43116br implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f112766a;

    public /* synthetic */ C43116br(EditText editText) {
        this.f112766a = editText;
    }

    public final void onClick(View view) {
        EditText editText = this.f112766a;
        int i = C43122bx.f112781b;
        editText.requestFocus();
        C43066o.m75993n(editText);
        view.scrollTo(0, view.getBottom());
    }
}
