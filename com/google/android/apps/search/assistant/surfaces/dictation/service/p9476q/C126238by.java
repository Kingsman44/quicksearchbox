package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.by */
/* compiled from: PG */
public final /* synthetic */ class C126238by implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C126257cq f347854a;

    public /* synthetic */ C126238by(C126257cq cqVar) {
        this.f347854a = cqVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C126257cq cqVar = this.f347854a;
        synchronized (cqVar.f347888g) {
            if (cqVar.f347890i.equals(C126250cj.INITIALIZING)) {
                String d = cqVar.mo107484d();
                throw new TimeoutException("ProcessingQueue initialization timed out; " + d);
            }
        }
        return C60866ct.f164955a;
    }
}
