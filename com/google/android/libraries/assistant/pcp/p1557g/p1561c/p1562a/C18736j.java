package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.android.apps.gsa.binaries.satin.app.ana;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.C18769h;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18711c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18713e;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18717i;
import com.google.android.libraries.assistant.pcp.p1573k.C18912aa;
import com.google.android.libraries.assistant.pcp.p1573k.C18930j;
import com.google.android.libraries.assistant.pcp.p1573k.C18932l;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18948a;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18951d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.j */
/* compiled from: PG */
public final class C18736j implements C18769h {

    /* renamed from: a */
    public static final C59071e f52828a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.g.c.a.j");

    /* renamed from: b */
    public final C18930j f52829b;

    /* renamed from: c */
    public final C18932l f52830c;

    /* renamed from: d */
    public final C18912aa f52831d;

    /* renamed from: e */
    public final Executor f52832e;

    /* renamed from: f */
    private final ana f52833f;

    public C18736j(C18930j jVar, C18932l lVar, C18912aa aaVar, Executor executor, ana ana) {
        this.f52829b = jVar;
        this.f52830c = lVar;
        this.f52831d = aaVar;
        this.f52832e = executor;
        this.f52833f = ana;
    }

    /* renamed from: a */
    public final C18713e mo21204a() {
        return C18711c.f52782b;
    }

    /* renamed from: b */
    public final C60870cx mo21205b(C18718c cVar) {
        C18951d a = this.f52833f.mo65974a(C18948a.PCP_FETCH_ON_DEVICE_MEDIA_RECS);
        C60870cx a2 = cVar.mo24114a(C18717i.f52795a);
        C60870cx a3 = cVar.mo24114a(C18711c.f52784d);
        return C47636i.m84746e(a2, a3).mo51519b(new C18733g(this, a2, a3), this.f52832e).mo51516i(new C18734h(this, a2, a), this.f52832e).mo51513e(Throwable.class, new C18735i(a), this.f52832e);
    }
}
