package com.google.android.apps.gsa.nga.engine.p6056o.p6059c.p6060a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.a.a */
/* compiled from: PG */
public final class C76542a implements C76591c {

    /* renamed from: a */
    public final Object f211771a = new Object();

    /* renamed from: b */
    public final Map f211772b;

    /* renamed from: c */
    public C74965n f211773c = null;

    /* renamed from: d */
    private final C76591c f211774d;

    public C76542a(C76591c cVar) {
        this.f211774d = cVar;
        this.f211772b = new HashMap();
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        return this.f211774d.mo71711a();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C60870cx cxVar;
        C61752n a = C76546e.m123188a(bgVar);
        synchronized (this.f211771a) {
            if (nVar != this.f211773c) {
                this.f211772b.clear();
                this.f211773c = nVar;
            }
            if (this.f211772b.containsKey(a)) {
                cxVar = (C60870cx) this.f211772b.get(a);
            } else {
                C60870cx b = this.f211774d.mo71712b(new C76590bg(a), nVar);
                this.f211772b.put(a, b);
                cxVar = b;
            }
        }
        return C60856cj.m92901j(cxVar);
    }
}
