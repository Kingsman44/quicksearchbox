package com.google.android.libraries.assistant.pcp.p1579n;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.n.f */
/* compiled from: PG */
public final class C19018f implements C18998a {

    /* renamed from: a */
    private final C19004c f53399a;

    /* renamed from: b */
    private final Executor f53400b;

    public C19018f(C19004c cVar, Executor executor) {
        this.f53399a = cVar;
        this.f53400b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo24237a(C18579g gVar, C53306j jVar, C18718c cVar) {
        if (!gVar.equals(this.f53399a.mo24245a())) {
            String d = gVar.mo24074d();
            String valueOf = String.valueOf(this.f53399a.mo24245a());
            return C60856cj.m92899h(new IllegalArgumentException("Feature type mismatch: " + d + " vs " + valueOf));
        }
        C60870cx c = this.f53399a.mo24247c(jVar, cVar);
        C19016d dVar = new C19016d(jVar);
        return C60922j.m93044g(c, C47810es.m84963c(dVar), this.f53400b);
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("proactiveDataSourceId", this.f53399a.mo24246b().name());
        b.mo56102b("featureType", this.f53399a.mo24245a());
        return b.toString();
    }
}
