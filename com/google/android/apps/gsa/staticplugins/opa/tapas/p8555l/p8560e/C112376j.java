package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import android.util.Base64;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.research.p5181a.p5183b.p5184a.C66302c;
import com.google.research.p5181a.p5187e.C66361k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.j */
/* compiled from: PG */
public final /* synthetic */ class C112376j implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311806a;

    /* renamed from: b */
    public final /* synthetic */ C113408es f311807b;

    /* renamed from: c */
    public final /* synthetic */ C113415ez f311808c;

    public /* synthetic */ C112376j(C112312ag agVar, C113408es esVar, C113415ez ezVar) {
        this.f311806a = agVar;
        this.f311807b = esVar;
        this.f311808c = ezVar;
    }

    public final void run() {
        C112312ag agVar = this.f311806a;
        C113408es esVar = this.f311807b;
        C113415ez ezVar = this.f311808c;
        C112368ci ciVar = agVar.f311671c;
        C113405ep a = esVar.mo100118a();
        C58495hd c = esVar.mo100120c();
        C66302c cVar = new C66302c();
        C112365cf.m186224a(a, c, ciVar.f311792a, cVar, ciVar.f311793b.mo99464a());
        C112365cf.m186225b(ezVar, cVar, ciVar.f311793b.mo99464a());
        C58976aa aaVar = C58975e.f156826a;
        Base64.encodeToString(cVar.mo59462e(), 2);
        String c2 = cVar.mo59460c();
        synchronized (agVar) {
            C112341bi biVar = (C112341bi) agVar.f311682n.get();
            for (C66361k kVar : biVar.f180453g) {
                C112341bi.m186204b(ezVar, C112341bi.m186203a(kVar)).ifPresent(new C112337be(cVar, kVar));
            }
            biVar.f180452f++;
            cVar.mo59469l(c2);
            agVar.f311681m.mo59583b(cVar);
        }
    }
}
