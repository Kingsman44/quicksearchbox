package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.am.v.d;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74849ah;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
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

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.u */
/* compiled from: PG */
public final class C76977u implements C76591c {

    /* renamed from: a */
    private final C74849ah f212498a;

    /* renamed from: b */
    private final d f212499b;

    public C76977u(C74849ah ahVar, d dVar) {
        this.f212498a = ahVar;
        this.f212499b = dVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.EDIT_PHOTO));
        h.mo72277g("Edit_photo", C90126fx.f251249fJ);
        ((C76541a) h).f211766c = 11122;
        h.mo72244c(C58485gu.m89846n("Edit_photo"));
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        Optional b = this.f212498a.mo71237b();
        if (b.isEmpty()) {
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(5);
        C81442m.m129557s(lVar, t.u(this.f212499b.a((Uri) b.get()), 1, nVar.mo71336k(), false, true));
        lVar.mo74319k(79954);
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
