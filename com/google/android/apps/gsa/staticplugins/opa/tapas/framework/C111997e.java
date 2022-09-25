package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112686ax;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.LatencyValidatorImpl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58495hd;
import dagger.C68214a;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.e */
/* compiled from: PG */
public final class C111997e {

    /* renamed from: a */
    private final C68214a f311143a;

    /* renamed from: b */
    private final C86124t f311144b;

    /* renamed from: c */
    private final C21370a f311145c;

    public C111997e(C86124t tVar, C68214a aVar, C21370a aVar2) {
        this.f311143a = aVar;
        this.f311144b = tVar;
        this.f311145c = aVar2;
    }

    /* renamed from: a */
    public final void mo99332a(C58495hd hdVar) {
        Map.EL.forEach(this.f311144b.mo79751q(C90063do.f249494eb), new C111886c(hdVar));
    }

    /* renamed from: b */
    public final void mo99333b(C113405ep epVar, int i) {
        long a = C113190cu.m187214a(epVar, this.f311145c);
        C112686ax axVar = (C112686ax) this.f311143a.mo27525b();
        long b = epVar.mo100017b();
        int length = epVar.mo100033p().length();
        if (((LatencyValidatorImpl) axVar.f312367a.mo27525b()).mo99611a(b)) {
            C118831d dVar = axVar.f312381o;
            long j = i != 1 ? 0 : 1;
            dVar.mo104025g(j);
            if (length == 0) {
                axVar.f312380n.mo104025g(a);
                axVar.f312382p.mo104025g(j);
            } else {
                axVar.f312383q.mo104025g(a);
                axVar.f312384r.mo104025g(j);
            }
            axVar.f312379m.mo104025g(a);
        }
    }
}
