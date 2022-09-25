package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.google.android.apps.gsa.assistant.settings.features.v.f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.n */
/* compiled from: PG */
public final /* synthetic */ class C102183n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102186q f285060a;

    /* renamed from: b */
    public final /* synthetic */ int f285061b;

    public /* synthetic */ C102183n(C102186q qVar, int i) {
        this.f285060a = qVar;
        this.f285061b = i;
    }

    public final C60870cx apply(Object obj) {
        C102186q qVar = this.f285060a;
        int i = this.f285061b;
        Void voidR = (Void) obj;
        if (!qVar.f285065c.mo56113h()) {
            return C60856cj.m92899h(new Throwable("HelpImproveAssistant auditor not available."));
        }
        return ((f) qVar.f285065c.mo56107c()).a(i);
    }
}
