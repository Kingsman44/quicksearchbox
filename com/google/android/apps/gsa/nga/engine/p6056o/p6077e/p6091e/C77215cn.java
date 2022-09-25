package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.am.z.c;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.cn */
/* compiled from: PG */
public final class C77215cn implements C76591c {

    /* renamed from: a */
    public final C81515c f213041a;

    /* renamed from: b */
    public final C83216f f213042b;

    /* renamed from: c */
    private final C77196bv f213043c;

    public C77215cn(C81515c cVar, C77196bv bvVar, C83251g gVar) {
        this.f213041a = cVar;
        this.f213043c = bvVar;
        this.f213042b = gVar.mo76652a(C82831ca.REMOVE_TIME_FROM_TIMER);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.REMOVE_TIME_FROM_TIMER));
        h.mo72277g("Remove_time_from_timer", C90126fx.f251431ig);
        h.mo72244c(C58485gu.m89846n("Remove_time_from_timer"));
        ((C76541a) h).f211766c = 10919;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C77191bq h = C77192br.m123911h(this.f213043c);
        h.mo72483b(c.c);
        C77279z zVar = (C77279z) h;
        zVar.f213152e = this.f213042b;
        zVar.f213150c = new C77212ck(this);
        zVar.f213149b = C77213cl.f213039a;
        C77192br a = h.mo72482a();
        return a.mo72454c().mo72485a(a, bgVar, nVar);
    }
}
