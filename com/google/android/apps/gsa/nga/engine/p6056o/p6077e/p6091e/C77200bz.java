package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.am.z.c;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74820be;
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
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.bz */
/* compiled from: PG */
public final class C77200bz implements C76591c {

    /* renamed from: a */
    public final C91142g f213014a;

    /* renamed from: b */
    public final C74820be f213015b;

    /* renamed from: c */
    private final C77196bv f213016c;

    /* renamed from: d */
    private final C83216f f213017d;

    public C77200bz(C77196bv bvVar, C83251g gVar, C74820be beVar, C91142g gVar2) {
        this.f213016c = bvVar;
        this.f213017d = gVar.mo76652a(C82831ca.GET_TIMER_INFO);
        this.f213015b = beVar;
        this.f213014a = gVar2;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.GET_TIMER_INFO));
        h.mo72277g("Get_timer_info", C90126fx.f251223ek);
        h.mo72244c(C58485gu.m89846n("Get_timer_info"));
        ((C76541a) h).f211766c = 10906;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C77191bq h = C77192br.m123911h(this.f213016c);
        C77279z zVar = (C77279z) h;
        zVar.f213149b = C77198bx.f213012a;
        zVar.f213150c = new C77199by(this);
        h.mo72483b(c.a);
        zVar.f213152e = this.f213017d;
        C77192br a = h.mo72482a();
        return a.mo72454c().mo72485a(a, bgVar, nVar);
    }
}
