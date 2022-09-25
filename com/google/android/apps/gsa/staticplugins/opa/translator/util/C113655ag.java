package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113600m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.ag */
/* compiled from: PG */
public final /* synthetic */ class C113655ag implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InterpreterMainTextView f314829a;

    /* renamed from: b */
    public final /* synthetic */ C113600m f314830b;

    public /* synthetic */ C113655ag(InterpreterMainTextView interpreterMainTextView, C113600m mVar) {
        this.f314829a = interpreterMainTextView;
        this.f314830b = mVar;
    }

    public final void onClick(View view) {
        InterpreterMainTextView interpreterMainTextView = this.f314829a;
        C113600m mVar = this.f314830b;
        if (interpreterMainTextView.f314771p != C113668at.TRANSLATION) {
            return;
        }
        if (interpreterMainTextView.f314781z == 5) {
            mVar.f314531a.mo100346u(interpreterMainTextView.mo100422j().getText().toString());
        } else if (interpreterMainTextView.f314781z == 6) {
            mVar.f314531a.mo100345t(interpreterMainTextView.mo100422j().getText().toString());
        }
    }
}
