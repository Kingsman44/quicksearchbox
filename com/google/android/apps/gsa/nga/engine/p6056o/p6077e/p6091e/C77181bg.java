package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.z.c;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74885bc;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.bg */
/* compiled from: PG */
public final /* synthetic */ class C77181bg implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77188bn f212991a;

    /* renamed from: b */
    public final /* synthetic */ C77185bk f212992b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f212993c;

    /* renamed from: d */
    public final /* synthetic */ C76590bg f212994d;

    public /* synthetic */ C77181bg(C77188bn bnVar, C77185bk bkVar, C74965n nVar, C76590bg bgVar) {
        this.f212991a = bnVar;
        this.f212992b = bkVar;
        this.f212993c = nVar;
        this.f212994d = bgVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77188bn bnVar = this.f212991a;
        C77185bk bkVar = this.f212992b;
        C74965n nVar = this.f212993c;
        C76590bg bgVar = this.f212994d;
        C74885bc bcVar = (C74885bc) obj;
        C58485gu a = bkVar.mo72473a().mo72465a(bgVar, bcVar.mo71273a());
        if (((c) bgVar.mo72271m(C77149ab.f212920d).orElse(c.c)).a(a.size())) {
            return bkVar.mo72474b().mo72466a(bgVar, nVar, a);
        }
        boolean z = !bcVar.mo71273a().isEmpty();
        if (!a.isEmpty()) {
            a.size();
            bkVar.mo72476d().mo76648a(nVar.mo71336k(), C82835ce.ALARM_NOT_RESOLVED, C83044e.f226656a);
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        bnVar.mo72481b(nVar.mo71342q(), lVar, z);
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
