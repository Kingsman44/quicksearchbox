package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.cg */
/* compiled from: PG */
public final /* synthetic */ class C126247cg implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126257cq f347865a;

    public /* synthetic */ C126247cg(C126257cq cqVar) {
        this.f347865a = cqVar;
    }

    public final Object apply(Object obj) {
        C126257cq cqVar = this.f347865a;
        synchronized (cqVar.f347888g) {
            C58838bb.m90883r(cqVar.f347890i.equals(C126250cj.SHUTTING_DOWN));
            cqVar.f347890i = C126250cj.SHUTDOWN;
        }
        return null;
    }
}
