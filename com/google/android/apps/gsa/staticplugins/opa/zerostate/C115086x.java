package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.opa.p6440e.C83608a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115024ca;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64328d;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64350z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.x */
/* compiled from: PG */
public final /* synthetic */ class C115086x implements C83608a {

    /* renamed from: a */
    public final /* synthetic */ C115087y f319478a;

    public /* synthetic */ C115086x(C115087y yVar) {
        this.f319478a = yVar;
    }

    /* renamed from: a */
    public final void mo76967a(C64328d dVar) {
        C115087y yVar = this.f319478a;
        C58480gp e = C58485gu.m89837e();
        if (dVar.f173912a == 4) {
            C58485gu j = C58485gu.m89842j(((C64350z) dVar.f173913b).f173951a);
            j.getClass();
            e.mo55395g(new C115024ca(j));
        }
        C58485gu f = e.mo55394f();
        if (yVar.f319479a.isDone()) {
            C58976aa aaVar = C58975e.f156826a;
            yVar.f319479a = new SettableFuture();
        }
        yVar.f319479a.mo57356n(f);
    }
}
