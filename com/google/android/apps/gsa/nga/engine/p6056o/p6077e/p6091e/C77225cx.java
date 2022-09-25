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

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.cx */
/* compiled from: PG */
public final class C77225cx implements C76591c {

    /* renamed from: a */
    public final C83216f f213058a;

    /* renamed from: b */
    private final C77196bv f213059b;

    public C77225cx(C77196bv bvVar, C83251g gVar) {
        this.f213059b = bvVar;
        this.f213058a = gVar.mo76652a(C82831ca.RESUME_TIMER);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.RESUME_TIMER));
        h.mo72277g("Resume_timer", C90126fx.f251441iq);
        h.mo72244c(C58485gu.m89846n("Resume_timer"));
        ((C76541a) h).f211766c = 10914;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C77191bq h = C77192br.m123911h(this.f213059b);
        C77279z zVar = (C77279z) h;
        zVar.f213152e = this.f213058a;
        h.mo72483b(c.c);
        zVar.f213149b = C77222cu.f213055a;
        zVar.f213150c = new C77223cv(this);
        C77192br a = h.mo72482a();
        return a.mo72454c().mo72485a(a, bgVar, nVar);
    }
}
