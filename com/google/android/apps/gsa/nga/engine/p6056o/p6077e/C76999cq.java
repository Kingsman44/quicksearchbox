package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.education.C75745be;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.cq */
/* compiled from: PG */
public final class C76999cq implements C76591c {

    /* renamed from: a */
    public final C75745be f212542a;

    /* renamed from: b */
    public final C76998cp f212543b;

    /* renamed from: c */
    private final C22871g f212544c;

    public C76999cq(C75745be beVar, C22871g gVar, C76998cp cpVar) {
        this.f212542a = beVar;
        this.f212544c = gVar;
        this.f212543b = cpVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.WCYD));
        h.mo72277g("What_can_you_do", C90126fx.f251475jX);
        h.mo72244c(C58485gu.m89846n("What_can_you_do"));
        ((C76541a) h).f211766c = 30001;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        return this.f212544c.mo28201a("[NGA] WcydFulfiller.fulfill", new C76997co(this, nVar));
    }
}
