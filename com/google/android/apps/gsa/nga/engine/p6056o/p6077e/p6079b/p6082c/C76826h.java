package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6082c;

import com.google.android.apps.gsa.nga.engine.am.l.c.r;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18102c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.c.h */
/* compiled from: PG */
public final class C76826h implements C76591c {

    /* renamed from: a */
    public static final C58827ar f212226a = new C58827ar(", ");

    /* renamed from: b */
    public static final C58827ar f212227b = new C58827ar("<br>");

    /* renamed from: c */
    private final r f212228c;

    /* renamed from: d */
    private final C22871g f212229d;

    public C76826h(r rVar, C22871g gVar) {
        this.f212228c = rVar;
        this.f212229d = gVar;
    }

    /* renamed from: c */
    public static C58485gu m123446c(C18102c cVar, String str) {
        return (C58485gu) Optional.ofNullable(cVar.mo23595a()).map(new C76822d(str)).map(C76823e.f212223a).map(C76824f.f212224a).orElse(C58485gu.m89846n("🤦"));
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.ACTION_LISTING));
        h.mo72277g("Debug_list_actions", C90126fx.f251035bH);
        h.mo72244c(C58485gu.m89846n("Debug_list_actions"));
        ((C76541a) h).f211766c = 15002;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        return this.f212229d.mo28209i(this.f212228c.c(nVar.mo71336k()), "[NGA] list direct actions", new C76819a());
    }
}
