package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.am.d.m;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6246w.C79402e;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.be */
/* compiled from: PG */
public final class C77179be implements C76591c {

    /* renamed from: a */
    public static final C58974d f212981a = C58974d.m91136j();

    /* renamed from: b */
    public final C81515c f212982b;

    /* renamed from: c */
    public final C79402e f212983c;

    /* renamed from: d */
    public final C77276w f212984d;

    /* renamed from: e */
    public final C91142g f212985e;

    /* renamed from: f */
    public final m f212986f;

    /* renamed from: g */
    public final C83216f f212987g;

    /* renamed from: h */
    private final C77188bn f212988h;

    public C77179be(C81515c cVar, C79402e eVar, C77276w wVar, C91142g gVar, m mVar, C77188bn bnVar, C83251g gVar2) {
        this.f212982b = cVar;
        this.f212983c = eVar;
        this.f212984d = wVar;
        this.f212985e = gVar;
        this.f212986f = mVar;
        this.f212988h = bnVar;
        this.f212987g = gVar2.mo76652a(C82831ca.DISABLE_ALARM);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.DISABLE_ALARM));
        h.mo72277g("Disable_alarm", C90126fx.f251162dc);
        h.mo72244c(C58485gu.m89846n("Disable_alarm"));
        ((C76541a) h).f211766c = 10915;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C77184bj h = C77185bk.m123894h(this.f212988h);
        C77277x xVar = (C77277x) h;
        xVar.f213137e = this.f212987g;
        xVar.f213134b = new C77177bc(this);
        xVar.f213135c = new C77178bd(this);
        h.mo72471b(false);
        C77185bk a = h.mo72470a();
        return a.mo72475c().mo72480a(a, bgVar, nVar);
    }
}
