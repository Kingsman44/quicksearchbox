package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.p5900ag.C74820be;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74886bd;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6029g.C76087c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.bv */
/* compiled from: PG */
public final class C77196bv {

    /* renamed from: a */
    public final C81515c f213007a;

    /* renamed from: b */
    private final C22871g f213008b;

    /* renamed from: c */
    private final C76087c f213009c;

    /* renamed from: d */
    private final C74820be f213010d;

    public C77196bv(C22871g gVar, C81515c cVar, C76087c cVar2, C74820be beVar) {
        C58974d.m91134h(getClass().getName());
        this.f213008b = gVar;
        this.f213007a = cVar;
        this.f213009c = cVar2;
        this.f213010d = beVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo72485a(C77192br brVar, C76590bg bgVar, C74965n nVar) {
        C74886bd c = nVar.mo71328c();
        if (!this.f213009c.mo72032d() || this.f213010d.mo71218c()) {
            return ((C77194bt) brVar.mo72458f().orElse(new C77189bo(brVar, nVar))).mo72468a(nVar);
        }
        if (!c.mo71263b()) {
            brVar.mo72456e().mo76648a(nVar.mo71336k(), C82835ce.SUPPORTED_APPLICATION_NOT_FOUND, C83044e.f226656a);
            return C81442m.f222851a;
        }
        C22871g gVar = this.f213008b;
        C60870cx a = nVar.mo71328c().mo71262a();
        String simpleName = getClass().getSimpleName();
        return gVar.mo28210j(a, "[NGA] " + simpleName + ".fulfill", new C77190bp(this, brVar, bgVar, nVar));
    }
}
