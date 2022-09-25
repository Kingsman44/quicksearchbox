package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c;

import com.google.android.apps.gsa.opa.p6441f.p6442a.C83615ad;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83617af;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83618ag;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.c.f */
/* compiled from: PG */
public final /* synthetic */ class C107755f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107759j f299823a;

    /* renamed from: b */
    public final /* synthetic */ Query f299824b;

    public /* synthetic */ C107755f(C107759j jVar, Query query) {
        this.f299823a = jVar;
        this.f299824b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107759j jVar = this.f299823a;
        Query query = this.f299824b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && ((C51195j) axVar.mo56107c()).f133278m) {
            C83615ad adVar = (C83615ad) C83618ag.f227962c.createBuilder();
            C83617af afVar = C83617af.INVALID_REQUEST;
            adVar.copyOnWrite();
            C83618ag agVar = (C83618ag) adVar.instance;
            agVar.f227965b = afVar.f227961c;
            agVar.f227964a |= 1;
            C83618ag agVar2 = (C83618ag) adVar.build();
            C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
            wVar.copyOnWrite();
            C83673y yVar = (C83673y) wVar.instance;
            agVar2.getClass();
            yVar.f228084c = agVar2;
            yVar.f228083b = 18;
            C58833ax a = C107759j.m178903a(query);
            if (a.mo56113h()) {
                String str = (String) a.mo56107c();
                wVar.copyOnWrite();
                C83673y yVar2 = (C83673y) wVar.instance;
                str.getClass();
                yVar2.f228082a |= 1;
                yVar2.f228085d = str;
            }
            jVar.mo96274j(wVar);
        }
    }
}
