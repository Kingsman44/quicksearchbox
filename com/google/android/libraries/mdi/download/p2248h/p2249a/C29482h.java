package com.google.android.libraries.mdi.download.p2248h.p2249a;

import com.google.android.libraries.mdi.download.p2248h.C29614k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.h.a.h */
/* compiled from: PG */
public final class C29482h implements C29614k {

    /* renamed from: a */
    private final C58881cr f79907a;

    /* renamed from: b */
    private final Executor f79908b;

    public C29482h(C29481g gVar) {
        this.f79908b = gVar.f79906b;
        this.f79907a = gVar.f79905a;
    }

    /* renamed from: b */
    public final C60870cx mo34749b(List list) {
        C29479e eVar = new C29479e(list);
        C60870cx g = C60922j.m93044g((C60870cx) this.f79907a.mo6453a(), C47810es.m84963c(eVar), this.f79908b);
        C29478d dVar = new C29478d(list);
        return C60922j.m93044g(g, C47810es.m84963c(dVar), this.f79908b);
    }
}
