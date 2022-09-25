package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.bc */
/* compiled from: PG */
public final /* synthetic */ class C112485bc implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C112519cj f312012a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f312013b;

    public /* synthetic */ C112485bc(C112519cj cjVar, C58485gu guVar) {
        this.f312012a = cjVar;
        this.f312013b = guVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58485gu j;
        C58528ij F;
        C112519cj cjVar = this.f312012a;
        C58485gu guVar = this.f312013b;
        synchronized (cjVar.f312075h) {
            j = C58485gu.m89842j(cjVar.f312084q);
            cjVar.f312084q.addAll(guVar);
        }
        synchronized (cjVar.f312073f) {
            F = C58528ij.m90006F(cjVar.f312071d.keySet());
        }
        C58976aa aaVar = C58975e.f156826a;
        C112519cj.f312068a.mo105242k("initFetchersDataMap", cjVar.f312073f, new C112499bq(cjVar, (C58495hd) Collection.EL.stream(cjVar.f312080m.entrySet()).filter(new C112475at(guVar, F, j)).collect(C58370cn.m89403c(C112487be.f312016a, new C112497bo(cjVar), C112498bp.f312033a))));
        return true;
    }
}
