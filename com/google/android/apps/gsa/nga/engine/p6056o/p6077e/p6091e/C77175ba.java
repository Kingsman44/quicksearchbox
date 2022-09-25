package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.am.z.c;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6246w.C79402e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.ba */
/* compiled from: PG */
public final class C77175ba implements C76591c {

    /* renamed from: a */
    public final C81515c f212974a;

    /* renamed from: b */
    public final C79402e f212975b;

    /* renamed from: c */
    public final C83216f f212976c;

    /* renamed from: d */
    private final C77196bv f212977d;

    public C77175ba(C81515c cVar, C79402e eVar, C77196bv bvVar, C83251g gVar) {
        this.f212974a = cVar;
        this.f212975b = eVar;
        this.f212977d = bvVar;
        this.f212976c = gVar.mo76652a(C82831ca.DELETE_TIMER);
    }

    /* renamed from: c */
    public static C80399l m123880c() {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(24444);
        return lVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.DELETE_TIMER));
        h.mo72277g("Delete_timer", C90126fx.f251104cX);
        h.mo72244c(C58485gu.m89846n("Delete_timer"));
        ((C76541a) h).f211766c = 10916;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C77191bq h = C77192br.m123911h(this.f212977d);
        h.mo72483b(c.c);
        C77279z zVar = (C77279z) h;
        zVar.f213149b = C77171ax.f212970a;
        zVar.f213150c = new C77172ay(this);
        zVar.f213151d = Optional.m71637of(new C77173az(this));
        zVar.f213152e = this.f212976c;
        C77192br a = h.mo72482a();
        return a.mo72454c().mo72485a(a, bgVar, nVar);
    }
}
