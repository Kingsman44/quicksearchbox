package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.View;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.al */
/* compiled from: PG */
public final /* synthetic */ class C113660al implements View.OnScrollChangeListener {

    /* renamed from: a */
    public final /* synthetic */ InterpreterMainTextView f314838a;

    /* renamed from: b */
    public final /* synthetic */ TextView f314839b;

    /* renamed from: c */
    public final /* synthetic */ int f314840c;

    public /* synthetic */ C113660al(InterpreterMainTextView interpreterMainTextView, TextView textView, int i) {
        this.f314838a = interpreterMainTextView;
        this.f314839b = textView;
        this.f314840c = i;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        this.f314838a.mo100431t(this.f314839b, this.f314840c);
    }
}
