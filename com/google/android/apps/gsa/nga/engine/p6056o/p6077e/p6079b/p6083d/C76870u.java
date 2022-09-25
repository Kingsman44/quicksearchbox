package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.u */
/* compiled from: PG */
public final class C76870u implements C76591c {
    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.CONTACT_NOT_FOUND));
        h.mo72244c(C58485gu.m89846n("Contact_not_found"));
        C76541a aVar = (C76541a) h;
        aVar.f211766c = 10211;
        aVar.f211765b = Optional.m71637of("ContactNotFoundFullfiller");
        h.mo72277g("Contact_not_found", C90126fx.f251225em);
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        String format = String.format("Couldn't find %s in your phone contacts. Cloud contacts lookup is coming soon.", new Object[]{(String) bgVar.mo72265g(C76564ah.f211801a, "contact").get()});
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(4);
        C81442m.m129557s(lVar, t.r(format));
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
