package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48599ao;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62995dn;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.d */
/* compiled from: PG */
public final class C111054d {

    /* renamed from: a */
    public final C86124t f309270a;

    /* renamed from: b */
    private final C68214a f309271b;

    public C111054d(C86124t tVar, C68214a aVar) {
        this.f309270a = tVar;
        this.f309271b = aVar;
    }

    /* renamed from: a */
    public final double mo99037a(String str, double d, double d2) {
        double b = mo99038b(str);
        C58976aa aaVar = C58975e.f156826a;
        return this.f309270a.mo79747m(C90063do.f249641q) + (this.f309270a.mo79747m(C90063do.f249640p) * d) + (this.f309270a.mo79747m(C90063do.f249644t) * d2) + (this.f309270a.mo79747m(C90063do.f249643s) * b);
    }

    /* renamed from: b */
    public final double mo99038b(String str) {
        double m = this.f309270a.mo79747m(C90063do.f249510er);
        Optional j = ((C112471ap) this.f309271b.mo27525b()).mo99539j();
        if (!j.isPresent()) {
            return m;
        }
        str.getClass();
        C62995dn dnVar = ((C48599ao) j.get()).f125609a;
        return dnVar.containsKey(str) ? ((Double) dnVar.get(str)).doubleValue() : m;
    }
}
