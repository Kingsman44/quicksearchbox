package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6081b;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.b.m */
/* compiled from: PG */
public final /* synthetic */ class C76816m implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76817n f212207a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212208b;

    /* renamed from: c */
    public final /* synthetic */ String f212209c;

    /* renamed from: d */
    public final /* synthetic */ C76590bg f212210d;

    public /* synthetic */ C76816m(C76817n nVar, C74965n nVar2, String str, C76590bg bgVar) {
        this.f212207a = nVar;
        this.f212208b = nVar2;
        this.f212209c = str;
        this.f212210d = bgVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76817n nVar = this.f212207a;
        C74965n nVar2 = this.f212208b;
        String str = this.f212209c;
        C76590bg bgVar = this.f212210d;
        C80401n nVar3 = (C80401n) obj;
        if (!C81442m.m129553o(nVar3)) {
            return C60856cj.m92900i(nVar3);
        }
        return nVar.f212212b.mo28210j(C118826c.m197213c(nVar.f212211a.d("TELEPORT", nVar2.mo71336k(), true)), "[NGA] SearchOnWebsiteFulfiller: Retrying if we have search", new C76814k(nVar, str, bgVar));
    }
}
