package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.f */
/* compiled from: PG */
public final class C111725f {

    /* renamed from: a */
    public static final C59071e f310570a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.f");

    /* renamed from: b */
    public final C22871g f310571b;

    /* renamed from: c */
    public final C86124t f310572c;

    /* renamed from: d */
    public final C113190cu f310573d;

    /* renamed from: e */
    private int f310574e;

    public C111725f(C22871g gVar, C86124t tVar, C113190cu cuVar) {
        this.f310571b = gVar;
        this.f310572c = tVar;
        this.f310573d = cuVar;
    }

    /* renamed from: a */
    public final void mo99218a(C113405ep epVar, C111644a aVar) {
        if (this.f310574e < ((int) this.f310572c.mo79743a(C90063do.f249629hd))) {
            this.f310574e++;
            C22871g gVar = this.f310571b;
            long a = this.f310572c.mo79743a(C90063do.f249632hg);
            int i = this.f310574e;
            gVar.mo28213m("Retry Tapas Suggestion request", a + (i != 0 ? i != 1 ? 1000 : 300 : 0), new C111709b(this, aVar, epVar));
        }
    }
}
