package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.ai.x;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.engine.understanding.C79159q;
import com.google.android.apps.gsa.nga.engine.understanding.C79160r;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.knowledge.p4661a.p4662a.C61752n;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.o */
/* compiled from: PG */
public final /* synthetic */ class C79101o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C79160r f217484a;

    public /* synthetic */ C79101o(C79160r rVar) {
        this.f217484a = rVar;
    }

    public final C60870cx apply(Object obj) {
        C79160r rVar = this.f217484a;
        C78983aj ajVar = (C78983aj) obj;
        if (!ajVar.mo73747b().isEmpty()) {
            C80515d a = C80515d.m128185a(((C80513b) ajVar.mo73747b().get()).f221019d);
            if (a == null) {
                a = C80515d.UNRECOGNIZED;
            }
            if (!a.equals(C80515d.CANTEEN)) {
                int b = ajVar.mo73746a().mo71152e().mo71143b();
                if (b == 0) {
                    throw null;
                } else if (b == 1) {
                    x xVar = rVar.f217612c;
                    String c = ajVar.mo73746a().mo71152e().mo71141c().mo71146c();
                    C61752n nVar = ((C80513b) ajVar.mo73747b().get()).f221016a;
                    if (nVar == null) {
                        nVar = C61752n.f166808f;
                    }
                    return rVar.f217611b.mo28209i(xVar.a(c, nVar, rVar.f217610a), "[NGA] IgdpTransform.handleResponse.", new C79159q(ajVar));
                }
            }
        }
        return C60856cj.m92900i(C58485gu.m89846n(ajVar));
    }
}
