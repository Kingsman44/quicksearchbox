package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58714pg;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.au */
/* compiled from: PG */
public final /* synthetic */ class C110749au implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308570a;

    /* renamed from: b */
    public final /* synthetic */ C58714pg f308571b;

    /* renamed from: c */
    public final /* synthetic */ long f308572c;

    public /* synthetic */ C110749au(C110764bi biVar, C58714pg pgVar, long j) {
        this.f308570a = biVar;
        this.f308571b = pgVar;
        this.f308572c = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C110764bi biVar = this.f308570a;
        C58714pg pgVar = this.f308571b;
        return (Map) Collection.EL.stream(biVar.f308629t.mo83624f(((Long) pgVar.f156456b.mo55176b()).longValue(), this.f308572c, true)).collect(Collectors.groupingBy(C110730ab.f308530a, Collectors.mapping(C110741am.f308552a, C58370cn.f155947b)));
    }
}
