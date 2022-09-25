package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74849ah;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.t */
/* compiled from: PG */
public final class C76976t implements C76591c {

    /* renamed from: a */
    public final Context f212496a;

    /* renamed from: b */
    private final C74849ah f212497b;

    public C76976t(Context context, C74849ah ahVar) {
        this.f212496a = context;
        this.f212497b = ahVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.DELETE_SCREENSHOT));
        h.mo72277g("Delete_screenshot", C90126fx.f251248fI);
        ((C76541a) h).f211766c = 11123;
        h.mo72244c(C58485gu.m89846n("Delete_screenshot"));
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        this.f212497b.mo71237b().ifPresent(new C76975s(this, lVar));
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
