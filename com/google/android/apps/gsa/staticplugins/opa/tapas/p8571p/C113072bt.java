package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113399ej;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bt */
/* compiled from: PG */
public final /* synthetic */ class C113072bt implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113083cd f313303a;

    /* renamed from: b */
    public final /* synthetic */ C113415ez f313304b;

    public /* synthetic */ C113072bt(C113083cd cdVar, C113415ez ezVar) {
        this.f313303a = cdVar;
        this.f313304b = ezVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C113083cd cdVar = this.f313303a;
        C113415ez ezVar = this.f313304b;
        if (!((Boolean) obj).booleanValue()) {
            C113083cd.f313320a.mo105240i("extractFeatures_precompute_not_succeeded");
            return C113399ej.f314007x;
        }
        C113083cd.f313320a.mo105240i("extractFeatures_precompute_succeeded");
        return (C113399ej) C113083cd.f313320a.mo105235d("extractFeatures", new C113073bu(cdVar, ezVar));
    }
}
