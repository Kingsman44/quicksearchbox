package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.am.z.c;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.cj */
/* compiled from: PG */
public final class C77211cj implements C76591c {

    /* renamed from: a */
    public final C83216f f213036a;

    /* renamed from: b */
    private final C77196bv f213037b;

    public C77211cj(C77196bv bvVar, C83251g gVar) {
        this.f213037b = bvVar;
        this.f213036a = gVar.mo76652a(C82831ca.PAUSE_TIMER);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.PAUSE_TIMER));
        h.mo72277g("Pause_timer", C90126fx.f251316gX);
        h.mo72244c(C58485gu.m89846n("Pause_timer"));
        ((C76541a) h).f211766c = 10913;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C77191bq h = C77192br.m123911h(this.f213037b);
        h.mo72483b(c.c);
        C77279z zVar = (C77279z) h;
        zVar.f213152e = this.f213036a;
        zVar.f213149b = C77209ch.f213034a;
        zVar.f213150c = new C77210ci(this);
        C77192br a = h.mo72482a();
        return a.mo72454c().mo72485a(a, bgVar, nVar);
    }
}
