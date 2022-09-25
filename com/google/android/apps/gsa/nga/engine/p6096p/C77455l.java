package com.google.android.apps.gsa.nga.engine.p6096p;

import com.google.android.apps.gsa.n.g.b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.p.l */
/* compiled from: PG */
public final /* synthetic */ class C77455l implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C77467x f213478a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f213479b;

    public /* synthetic */ C77455l(C77467x xVar, C65753ak akVar) {
        this.f213478a = xVar;
        this.f213479b = akVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C77467x xVar = this.f213478a;
        C65753ak akVar = this.f213479b;
        Optional d = xVar.f213497d.mo72021b().mo72038d();
        if (!d.isPresent()) {
            return C60856cj.m92900i(C65033ar.f176111c);
        }
        C60870cx h = C60922j.m93045h((C60870cx) xVar.f213495b.a.mo6453a(), new b((String) d.get(), akVar, C63662ac.f172144a), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }
}
