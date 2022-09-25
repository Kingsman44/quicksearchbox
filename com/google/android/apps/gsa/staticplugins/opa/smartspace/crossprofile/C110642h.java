package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58714pg;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.h */
/* compiled from: PG */
public final /* synthetic */ class C110642h implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110645k f308312a;

    /* renamed from: b */
    public final /* synthetic */ C58714pg f308313b;

    /* renamed from: c */
    public final /* synthetic */ C58528ij f308314c;

    public /* synthetic */ C110642h(C110645k kVar, C58714pg pgVar, C58528ij ijVar) {
        this.f308312a = kVar;
        this.f308313b = pgVar;
        this.f308314c = ijVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C110645k kVar = this.f308312a;
        C58714pg pgVar = this.f308313b;
        return (Map) Collection.EL.stream(kVar.f308319b.mo83624f(((Long) pgVar.f156456b.mo55176b()).longValue(), ((Long) pgVar.f156457c.mo55176b()).longValue() - ((Long) pgVar.f156456b.mo55176b()).longValue(), true)).filter(new C110638d(this.f308314c)).collect(Collectors.groupingBy(C110639e.f308309a, Collectors.mapping(C110640f.f308310a, C58370cn.f155947b)));
    }
}
