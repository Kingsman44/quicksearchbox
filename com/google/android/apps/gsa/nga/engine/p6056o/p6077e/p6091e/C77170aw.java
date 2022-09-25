package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
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
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.aw */
/* compiled from: PG */
public final class C77170aw implements C76591c {

    /* renamed from: a */
    public final C81515c f212965a;

    /* renamed from: b */
    public final C79402e f212966b;

    /* renamed from: c */
    public final C77276w f212967c;

    /* renamed from: d */
    public final C83216f f212968d;

    /* renamed from: e */
    private final C77188bn f212969e;

    public C77170aw(C81515c cVar, C79402e eVar, C77276w wVar, C77188bn bnVar, C83251g gVar) {
        this.f212965a = cVar;
        this.f212966b = eVar;
        this.f212967c = wVar;
        this.f212969e = bnVar;
        this.f212968d = gVar.mo76652a(C82831ca.DELETE_ALARM);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.DELETE_ALARM));
        h.mo72277g("Delete_alarm", C90126fx.f251103cW);
        h.mo72277g("Disable_alarm", C90126fx.f251163dd);
        h.mo72244c(C58485gu.m89847o("Delete_alarm", "Disable_alarm"));
        ((C76541a) h).f211766c = 10912;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C77184bj h = C77185bk.m123894h(this.f212969e);
        C77277x xVar = (C77277x) h;
        xVar.f213134b = new C77168au(this);
        xVar.f213135c = new C77169av(this);
        h.mo72471b(false);
        xVar.f213137e = this.f212968d;
        C77185bk a = h.mo72470a();
        return a.mo72475c().mo72480a(a, bgVar, nVar);
    }
}
