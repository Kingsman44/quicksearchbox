package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.engine.understanding.p6239f.C79131r;
import com.google.android.apps.gsa.nga.engine.understanding.p6239f.C79133t;
import com.google.android.apps.gsa.nga.engine.understanding.p6239f.C79136w;
import com.google.android.apps.gsa.nga.engine.understanding.p6239f.C79137x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.knowledge.p4661a.p4662a.C61752n;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.u */
/* compiled from: PG */
public final /* synthetic */ class C79107u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C79086ak f217493a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f217494b;

    public /* synthetic */ C79107u(C79086ak akVar, C74965n nVar) {
        this.f217493a = akVar;
        this.f217494b = nVar;
    }

    public final C60870cx apply(Object obj) {
        C79086ak akVar = this.f217493a;
        C74965n nVar = this.f217494b;
        C78983aj ajVar = (C78983aj) obj;
        C79137x xVar = akVar.f217447c;
        if (ajVar.mo73747b().isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89846n(ajVar));
        }
        C80513b bVar = (C80513b) ajVar.mo73747b().get();
        C61752n nVar2 = bVar.f221016a;
        if (nVar2 == null) {
            nVar2 = C61752n.f166808f;
        }
        C80515d a = C80515d.m128185a(bVar.f221019d);
        if (a == null) {
            a = C80515d.UNRECOGNIZED;
        }
        C60870cx i = C60856cj.m92900i(C58485gu.m89846n(nVar2));
        for (C79131r wVar : xVar.f217539a) {
            i = xVar.f217540b.mo28210j(i, "[NGA] Resolvers.resolveFunctionCall", new C79136w(xVar, wVar, a, nVar));
        }
        return xVar.f217540b.mo28209i(i, "[NGA] Resolvers.resolve", new C79133t(ajVar, bVar));
    }
}
