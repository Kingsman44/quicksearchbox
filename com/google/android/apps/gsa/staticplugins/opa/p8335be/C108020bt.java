package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import com.google.android.apps.gsa.contacts.bg;
import com.google.android.apps.gsa.opa.C83584ao;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55088fk;
import com.google.p4152bb.p4153a.C55089fl;
import com.google.p4152bb.p4153a.C55097ft;
import com.google.protobuf.C62947c;
import dagger.C68214a;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.bt */
/* compiled from: PG */
public final class C108020bt implements C83584ao {

    /* renamed from: a */
    public static final C59071e f300514a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.be.bt");

    /* renamed from: b */
    private final bg f300515b;

    /* renamed from: c */
    private final C22871g f300516c;

    /* renamed from: d */
    private final C68214a f300517d;

    /* renamed from: e */
    private final C118827a f300518e;

    /* renamed from: f */
    private final C86054o f300519f;

    public C108020bt(bg bgVar, C22871g gVar, C68214a aVar, C118827a aVar2, C86054o oVar) {
        this.f300515b = bgVar;
        this.f300516c = gVar;
        this.f300517d = aVar;
        this.f300518e = aVar2;
        this.f300519f = oVar;
    }

    /* renamed from: a */
    public final List mo76945a(Query query, List list, C55097ft ftVar, Map map, Set set) {
        this.f300519f.mo79659F();
        C55088fk fkVar = (C55088fk) C55089fl.f144954j.createBuilder();
        fkVar.copyOnWrite();
        C55089fl flVar = (C55089fl) fkVar.instance;
        flVar.mo54188a();
        C62947c.addAll((Iterable) list, (List) flVar.f144957b);
        if (ftVar != null) {
            fkVar.copyOnWrite();
            C55089fl flVar2 = (C55089fl) fkVar.instance;
            flVar2.f144961g = ftVar;
            flVar2.f144956a |= 2;
        }
        List a = this.f300515b.a(query, (C55089fl) fkVar.build(), map, set, "agsa_opa_peoplestore");
        this.f300516c.mo28211k(((C89037bh) this.f300517d.mo27525b()).mo27378c(), "Logging People Requests with Network ConnectivityInfo", new C108019bs(this.f300515b.k(), this.f300518e, !a.isEmpty(), this.f300515b.j()));
        return a;
    }
}
