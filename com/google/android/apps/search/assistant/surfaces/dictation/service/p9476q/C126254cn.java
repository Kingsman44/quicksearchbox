package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126325bf;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.cn */
/* compiled from: PG */
public final /* synthetic */ class C126254cn implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f347878a;

    public /* synthetic */ C126254cn(C58485gu guVar) {
        this.f347878a = guVar;
    }

    public final C60870cx apply(Object obj) {
        C58485gu guVar = this.f347878a;
        C126223bj bjVar = (C126223bj) obj;
        C47558bi a = C47831fm.m85006a("SD.OrationQueue.ProcessKeyboardUiSuggestions");
        try {
            bjVar.f347813m.set(new C126325bf(guVar));
            bjVar.f347805e.mo107286j(guVar);
            C60870cx cxVar = C60866ct.f164955a;
            a.mo51417a(cxVar);
            a.close();
            return cxVar;
        } catch (Throwable th) {
            C126251ck.m206437a(th, th);
        }
        throw th;
    }
}
