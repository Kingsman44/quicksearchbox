package com.google.android.libraries.assistant.pcp.p1579n.p1582c;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18710b;
import com.google.android.libraries.assistant.pcp.p1578m.C18981k;
import com.google.android.libraries.assistant.pcp.p1579n.C19004c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3809c.C49051eq;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.n.c.f */
/* compiled from: PG */
public final class C19010f implements C19004c {

    /* renamed from: a */
    private final Executor f53383a;

    public C19010f(Executor executor) {
        this.f53383a = executor;
    }

    /* renamed from: a */
    public final C18579g mo24245a() {
        return C18579g.m36038b(C49051eq.ZEROSTATE_CONTEXTUAL_SUGGESTIONS);
    }

    /* renamed from: b */
    public final C18981k mo24246b() {
        return C18981k.CONTEXTUAL_SUGGESTIONS;
    }

    /* renamed from: c */
    public final C60870cx mo24247c(C53306j jVar, C18718c cVar) {
        C60870cx a = cVar.mo24114a(C18710b.f52780b);
        C19006b bVar = new C19006b();
        return C60922j.m93044g(a, C47810es.m84963c(bVar), this.f53383a);
    }
}
