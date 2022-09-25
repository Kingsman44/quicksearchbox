package com.google.android.libraries.assistant.pcp.p1570j.p1571a.p1572a;

import com.google.android.libraries.assistant.pcp.p1544c.p1545a.C18565l;
import com.google.android.libraries.assistant.pcp.p1544c.p1545a.C18571r;
import com.google.android.libraries.assistant.pcp.p1570j.p1571a.C18796d;
import com.google.android.libraries.assistant.pcp.p1570j.p1571a.C18797e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.j.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C18790h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18793k f52920a;

    /* renamed from: b */
    public final /* synthetic */ C18792j f52921b;

    /* renamed from: c */
    public final /* synthetic */ Optional f52922c;

    public /* synthetic */ C18790h(C18793k kVar, C18792j jVar, Optional optional) {
        this.f52920a = kVar;
        this.f52921b = jVar;
        this.f52922c = optional;
    }

    public final Object apply(Object obj) {
        C18793k kVar = this.f52920a;
        C18792j jVar = this.f52921b;
        Optional optional = this.f52922c;
        Void voidR = (Void) obj;
        C18571r rVar = (C18571r) kVar.f52923a;
        C60870cx b = rVar.mo24055b();
        C18565l lVar = C18565l.f52577a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(lVar), rVar.f52590c);
        C18786d dVar = new C18786d(kVar, jVar, optional);
        C46459k.m82829b(C60922j.m93045h(g, C47810es.m84966f(dVar), kVar.f52924b), "notifySubscribedClients failed", new Object[0]);
        C18796d c = C18797e.m36218c();
        c.mo24122c(jVar.mo24127a());
        c.mo24121b(true);
        return c.mo24120a();
    }
}
