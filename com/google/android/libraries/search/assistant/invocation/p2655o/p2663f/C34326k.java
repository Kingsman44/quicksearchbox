package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121721c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34373s;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34421k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5463a.C69498ao;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.k */
/* compiled from: PG */
public final class C34326k implements C34421k {

    /* renamed from: a */
    public static final C59071e f91272a = C59071e.m91331h();

    /* renamed from: b */
    public final C121721c f91273b;

    /* renamed from: c */
    public final C71422aw f91274c;

    /* renamed from: d */
    public final AtomicReference f91275d = new AtomicReference(C69498ao.f185920a);

    /* renamed from: e */
    public final C34373s f91276e;

    public C34326k(C121721c cVar, C34373s sVar, C71422aw awVar) {
        C69664n.m101061g(cVar, "invocationManager");
        C69664n.m101061g(sVar, "triggeringConnectionsAccessor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91273b = cVar;
        this.f91276e = sVar;
        this.f91274c = awVar;
    }

    /* renamed from: c */
    public final C60870cx mo39256c() {
        return C71663i.m104692e(this.f91274c, (C71424ay) null, new C34322g(this, (C69577g) null), 3);
    }
}
