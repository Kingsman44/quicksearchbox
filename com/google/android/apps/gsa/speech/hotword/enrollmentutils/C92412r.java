package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.r */
/* compiled from: PG */
public final /* synthetic */ class C92412r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ int f257717a;

    public /* synthetic */ C92412r(int i) {
        this.f257717a = i;
    }

    public final C60870cx apply(Object obj) {
        int i = this.f257717a;
        C92419y yVar = (C92419y) obj;
        if (C92413s.m151755g(i) && !yVar.f257742b) {
            return C60856cj.m92899h(new Exception("Hotword model generation failed."));
        }
        if (!C92413s.m151756h(i) || yVar.f257743c) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92899h(new Exception("TISID model generation failed."));
    }
}
