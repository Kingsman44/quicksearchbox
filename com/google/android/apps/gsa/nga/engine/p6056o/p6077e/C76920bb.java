package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.g.e.a;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74816ba;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.p5851g.p5853e.C74526f;
import com.google.android.apps.gsa.shared.p7066m.C90042cu;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.bb */
/* compiled from: PG */
public final class C76920bb implements C76591c {

    /* renamed from: a */
    private final C74526f f212384a;

    public C76920bb(C74526f fVar) {
        this.f212384a = fVar;
    }

    /* renamed from: c */
    private static C58833ax m123541c(C76590bg bgVar, String str) {
        Optional g = bgVar.mo72265g(C76564ah.f211801a, str);
        return g.isPresent() ? C58833ax.m90834k((String) g.get()) : C58836b.f156633a;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.INTERPRETER));
        h.mo72277g("Activate_interpreter", C90042cu.f248705f);
        h.mo72244c(C58485gu.m89846n("Activate_interpreter"));
        ((C76541a) h).f211766c = 52001;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        if (nVar.mo71327b().mo71208c(C74816ba.m120965d())) {
            return C81442m.f222851a;
        }
        a aVar = new a();
        aVar.b(nVar.mo71342q());
        aVar.a = m123541c(bgVar, "language");
        aVar.b = m123541c(bgVar, "source_language");
        aVar.c = m123541c(bgVar, "target_language");
        return C60922j.m93044g(C60838bs.m92859i(this.f212384a.mo70832a(aVar.a())), C76919ba.f212383a, C60826bg.f164896a);
    }
}
