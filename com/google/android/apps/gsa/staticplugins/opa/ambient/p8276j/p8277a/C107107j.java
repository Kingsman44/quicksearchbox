package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.opa.smartspace.C83804t;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.j */
/* compiled from: PG */
public final /* synthetic */ class C107107j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f298178a;

    public /* synthetic */ C107107j(C58528ij ijVar) {
        this.f298178a = ijVar;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f298178a;
        C58528ij ijVar2 = C107115r.f298187a;
        Stream map = Collection.EL.stream(((C83804t) obj).mo77131a()).map(C107103f.f298174a);
        C58528ij ijVar3 = C107115r.f298187a;
        Objects.requireNonNull(ijVar3);
        return (C58528ij) map.filter(new C107104g(ijVar3)).filter(new C107105h(ijVar)).collect(C58370cn.f155947b);
    }
}
