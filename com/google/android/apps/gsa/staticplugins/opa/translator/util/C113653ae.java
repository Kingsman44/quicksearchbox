package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113600m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.ae */
/* compiled from: PG */
public final /* synthetic */ class C113653ae implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InterpreterMainTextView f314825a;

    /* renamed from: b */
    public final /* synthetic */ C113600m f314826b;

    public /* synthetic */ C113653ae(InterpreterMainTextView interpreterMainTextView, C113600m mVar) {
        this.f314825a = interpreterMainTextView;
        this.f314826b = mVar;
    }

    public final void onClick(View view) {
        InterpreterMainTextView interpreterMainTextView = this.f314825a;
        C113600m mVar = this.f314826b;
        if (interpreterMainTextView.f314771p != C113668at.TRANSLATION) {
            return;
        }
        if (interpreterMainTextView.f314781z == 5) {
            mVar.f314531a.mo100345t(interpreterMainTextView.mo100426n().getText().toString());
        } else if (interpreterMainTextView.f314781z == 6) {
            mVar.f314531a.mo100346u(interpreterMainTextView.mo100426n().getText().toString());
        }
    }
}
