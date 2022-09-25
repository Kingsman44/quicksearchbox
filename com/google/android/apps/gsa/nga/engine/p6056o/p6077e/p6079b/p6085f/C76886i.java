package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6085f;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.f.i */
/* compiled from: PG */
public final /* synthetic */ class C76886i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76889l f212319a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212320b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f212321c;

    /* renamed from: d */
    public final /* synthetic */ String f212322d;

    public /* synthetic */ C76886i(C76889l lVar, C74965n nVar, C58485gu guVar, String str) {
        this.f212319a = lVar;
        this.f212320b = nVar;
        this.f212321c = guVar;
        this.f212322d = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76889l lVar = this.f212319a;
        C74965n nVar = this.f212320b;
        C58485gu guVar = this.f212321c;
        String str = this.f212322d;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return lVar.mo72341c((String) optional.get(), nVar);
        }
        return guVar.isEmpty() ? C80401n.f220656k : lVar.mo72341c(str, nVar);
    }
}
