package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.j */
/* compiled from: PG */
public final /* synthetic */ class C109154j implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C109144ac f303960a;

    /* renamed from: b */
    public final /* synthetic */ Set f303961b;

    public /* synthetic */ C109154j(C109144ac acVar, Set set) {
        this.f303960a = acVar;
        this.f303961b = set;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C109144ac acVar = this.f303960a;
        C58528ij ijVar = (C58528ij) Collection.EL.stream(this.f303961b).peek(new C109166v(acVar)).map(new C109167w(acVar)).collect(C58370cn.f155947b);
        ((C58970a) ((C58970a) acVar.f303932a.mo56224b()).mo56372aa(23890)).mo56387q("created monitors of size %d", ijVar.size());
        return ijVar;
    }
}
