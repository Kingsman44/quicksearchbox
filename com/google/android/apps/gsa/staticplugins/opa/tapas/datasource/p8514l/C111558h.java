package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8514l;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48678am;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.l.h */
/* compiled from: PG */
public final /* synthetic */ class C111558h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111565o f310265a;

    public /* synthetic */ C111558h(C111565o oVar) {
        this.f310265a = oVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111565o oVar = this.f310265a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return C60856cj.m92896e((Iterable) Collection.EL.stream(((C48678am) axVar.mo56107c()).f125939a).map(new C111551a(oVar)).collect(C58370cn.f155946a));
        }
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
