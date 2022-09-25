package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74886bd;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.cp */
/* compiled from: PG */
public final class C77217cp implements C76591c {

    /* renamed from: a */
    public static final C58974d f213046a = C58974d.m91136j();

    /* renamed from: b */
    public final C83216f f213047b;

    /* renamed from: c */
    public final C81515c f213048c;

    /* renamed from: d */
    private final C22871g f213049d;

    public C77217cp(C81515c cVar, C22871g gVar, C83251g gVar2) {
        this.f213048c = cVar;
        this.f213049d = gVar;
        this.f213047b = gVar2.mo76652a(C82831ca.RESET_STOPWATCH);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.RESET_STOPWATCH));
        h.mo72277g("Reset_stopwatch", C90126fx.f251439io);
        ((C76541a) h).f211766c = 10909;
        h.mo72244c(C58485gu.m89846n("Reset_stopwatch"));
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C74886bd c = nVar.mo71328c();
        if (c.mo71266e()) {
            return this.f213049d.mo28209i(c.mo71262a(), "[NGA] ResetStopwatchFulfiller.fulfill", new C77216co(this, nVar));
        }
        this.f213047b.mo76648a(nVar.mo71336k(), C82835ce.SUPPORTED_APPLICATION_NOT_FOUND, C83044e.f226656a);
        return C81442m.f222851a;
    }
}
