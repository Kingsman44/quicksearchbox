package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.widget.TextView;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.a */
/* compiled from: PG */
public final /* synthetic */ class C113648a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterpreterAlternativeTranslationsView f314817a;

    /* renamed from: b */
    public final /* synthetic */ TextView f314818b;

    /* renamed from: c */
    public final /* synthetic */ C113662an f314819c;

    public /* synthetic */ C113648a(InterpreterAlternativeTranslationsView interpreterAlternativeTranslationsView, TextView textView, C113662an anVar) {
        this.f314817a = interpreterAlternativeTranslationsView;
        this.f314818b = textView;
        this.f314819c = anVar;
    }

    public final void run() {
        InterpreterAlternativeTranslationsView interpreterAlternativeTranslationsView = this.f314817a;
        TextView textView = this.f314818b;
        C113662an anVar = this.f314819c;
        if (textView.getText() != null) {
            String obj = textView.getText().toString();
            String str = interpreterAlternativeTranslationsView.f314710b;
            C59104x b = InterpreterMainTextView.f314755a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) b).mo56372aa(28245)).mo56386p("Alternative translations requesting play TTS");
            anVar.f314845a.mo100432u(obj, str);
        }
    }
}
