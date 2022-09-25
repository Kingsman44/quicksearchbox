package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123727au;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60744a;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.v */
/* compiled from: PG */
public final /* synthetic */ class C106968v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C106867ab f297958a;

    public /* synthetic */ C106968v(C106867ab abVar) {
        this.f297958a = abVar;
    }

    public final Object call() {
        C106867ab abVar = this.f297958a;
        C123727au auVar = (C123727au) C123728av.f341753l.createBuilder();
        auVar.mo106112a((C58485gu) Collection.EL.stream(abVar.f297764d.mo81728g()).sorted(Comparator.CC.comparing(C106969w.f297959a, C60744a.TRUE_FIRST)).filter(new C106970x(abVar)).map(new C106971y(abVar)).filter(C106972z.f297962a).map(C106866aa.f297760a).collect(C58370cn.f155946a));
        return (C123728av) auVar.build();
    }
}
