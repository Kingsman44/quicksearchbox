package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8535a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8537c.C111858i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C111837a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111844h f310805a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310806b;

    public /* synthetic */ C111837a(C111844h hVar, C113405ep epVar) {
        this.f310805a = hVar;
        this.f310806b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111844h hVar = this.f310805a;
        C113408es esVar = (C113408es) obj;
        this.f310806b.mo100033p();
        C58485gu o = esVar.mo100053o();
        int size = o.size();
        C58976aa aaVar = C58975e.f156826a;
        int i = 0;
        while (i < size) {
            C113415ez ezVar = (C113415ez) o.get(i);
            i++;
            ezVar.mo100210j().name();
            ezVar.mo100211k().name();
            ezVar.mo100199L();
        }
        Stream stream = Collection.EL.stream(esVar.mo100053o());
        C111858i iVar = (C111858i) hVar.f310819f.get();
        Objects.requireNonNull(iVar);
        C58485gu guVar = (C58485gu) stream.map(new C111838b(iVar)).collect(C58370cn.f155946a);
        return C60856cj.m92892a(guVar).mo57334a(new C111839c(guVar), C60826bg.f164896a);
    }
}
