package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4457a.C57978d;
import com.google.p4449cd.p4456g.p4458b.C57982a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.v */
/* compiled from: PG */
public final /* synthetic */ class C92813v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C92816y f258984a;

    /* renamed from: b */
    public final /* synthetic */ long f258985b;

    public /* synthetic */ C92813v(C92816y yVar, long j) {
        this.f258984a = yVar;
        this.f258985b = j;
    }

    public final C60870cx apply(Object obj) {
        C92816y yVar = this.f258984a;
        long j = this.f258985b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        SettableFuture settableFuture = new SettableFuture();
        C57982a aVar = new C57982a();
        C57978d dVar = new C57978d();
        aVar.mo20440jJ(dVar);
        ((C57981b) axVar.mo56107c()).mo20440jJ(new C92815x(yVar, aVar, settableFuture, dVar, j));
        return settableFuture;
    }
}
