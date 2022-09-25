package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116428g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.i */
/* compiled from: PG */
public final /* synthetic */ class C116403i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C116420z f322786a;

    /* renamed from: b */
    public final /* synthetic */ C116424c f322787b;

    public /* synthetic */ C116403i(C116420z zVar, C116424c cVar) {
        this.f322786a = zVar;
        this.f322787b = cVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C116420z zVar = this.f322786a;
        C116424c cVar = this.f322787b;
        C116428g gVar = (C116428g) obj;
        if (gVar.f322837c.isEmpty()) {
            return C60856cj.m92900i(gVar);
        }
        C22871g gVar2 = zVar.f322811b;
        C57663x xVar = ((C57569am) gVar.f322837c.get(0)).f153801c;
        if (xVar == null) {
            xVar = C57663x.f153984d;
        }
        return gVar2.mo28209i(zVar.mo102685c(cVar, xVar), "Return result after removing", new C116418x(gVar));
    }
}
