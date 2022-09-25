package com.google.android.libraries.assistant.pcp.p1557g.p1563d;

import com.google.android.libraries.assistant.pcp.p1554e.C18630a;
import com.google.android.libraries.assistant.pcp.p1554e.C18643am;
import com.google.android.libraries.assistant.pcp.p1554e.C18650at;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.C18769h;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18712d;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18713e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.g.d.c */
/* compiled from: PG */
public final class C18759c implements C18769h {

    /* renamed from: a */
    private final Executor f52865a;

    /* renamed from: b */
    private final C18630a f52866b;

    public C18759c(C18630a aVar, Executor executor) {
        this.f52866b = aVar;
        this.f52865a = executor;
    }

    /* renamed from: a */
    public final C18713e mo21204a() {
        return C18712d.f52787c;
    }

    /* renamed from: b */
    public final C60870cx mo21205b(C18718c cVar) {
        C18650at atVar = (C18650at) this.f52866b;
        C60870cx d = atVar.mo24095d();
        C18643am amVar = C18643am.f52669a;
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(amVar), atVar.f52678b);
        C18757b bVar = C18757b.f52864a;
        return C60922j.m93044g(g, C47810es.m84963c(bVar), this.f52865a);
    }
}
