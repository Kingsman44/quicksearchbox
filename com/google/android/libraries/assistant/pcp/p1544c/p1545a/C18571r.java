package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18586g;
import com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18589j;
import com.google.android.libraries.assistant.pcp.datastore.p1549b.p1550a.C18591b;
import com.google.android.libraries.assistant.pcp.p1544c.C18553a;
import com.google.android.libraries.assistant.pcp.p1554e.C18630a;
import com.google.android.libraries.assistant.pcp.p1554e.C18650at;
import com.google.android.libraries.assistant.pcp.p1554e.C18666q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.r */
/* compiled from: PG */
public final class C18571r implements C18553a {

    /* renamed from: a */
    public final C68214a f52588a;

    /* renamed from: b */
    public final C18630a f52589b;

    /* renamed from: c */
    public final Executor f52590c;

    /* renamed from: d */
    private final C18589j f52591d;

    public C18571r(C68214a aVar, C18630a aVar2, C18589j jVar, Executor executor) {
        this.f52588a = aVar;
        this.f52589b = aVar2;
        this.f52591d = jVar;
        this.f52590c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo24052a(Set set) {
        if (set.isEmpty()) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        C60870cx b = mo24055b();
        C18561h hVar = new C18561h(this);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(hVar), this.f52590c);
        C18567n nVar = new C18567n(set);
        return C60922j.m93044g(h, C47810es.m84963c(nVar), this.f52590c);
    }

    /* renamed from: b */
    public final C60870cx mo24055b() {
        C18589j jVar = this.f52591d;
        C60870cx d = jVar.f52614b.f52621a.mo46042d();
        C18591b bVar = C18591b.f52615a;
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(bVar), C60826bg.f164896a);
        C18586g gVar = C18586g.f52610a;
        C60870cx g2 = C60922j.m93044g(g, C47810es.m84963c(gVar), jVar.f52613a);
        C18650at atVar = (C18650at) this.f52589b;
        C60870cx d2 = atVar.mo24095d();
        C18666q qVar = C18666q.f52698a;
        C60870cx g3 = C60922j.m93044g(d2, C47810es.m84963c(qVar), atVar.f52678b);
        return C47638k.m84751b(g3, g2).mo51520a(new C18566m(this, g2, g3), this.f52590c);
    }
}
