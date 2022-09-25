package com.google.android.apps.gsa.shared.p7038f.p7039a;

import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130332g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3825an.p3830c.p3831a.C49292bk;
import com.google.assistant.p3825an.p3830c.p3831a.C49293bl;
import com.google.common.p4522b.C58370cn;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.shared.f.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C89733aj implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C49293bl f242907a;

    public /* synthetic */ C89733aj(C49293bl blVar) {
        this.f242907a = blVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C49293bl blVar = this.f242907a;
        C49292bk bkVar = (C49292bk) C49293bl.f127401b.createBuilder();
        bkVar.mo53227a((Iterable) Collection.EL.stream(blVar.f127403a).filter(new C89732ai((C130332g) obj)).collect(C58370cn.f155946a));
        return (C49293bl) bkVar.build();
    }
}
