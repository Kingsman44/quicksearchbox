package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a;

import android.os.Bundle;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83639ba;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83640bb;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C107811h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C107759j f299987a;

    /* renamed from: b */
    public final /* synthetic */ C107733l f299988b;

    /* renamed from: c */
    public final /* synthetic */ int f299989c;

    public /* synthetic */ C107811h(C107759j jVar, C107733l lVar, int i) {
        this.f299987a = jVar;
        this.f299988b = lVar;
        this.f299989c = i;
    }

    public final void run() {
        C107759j jVar = this.f299987a;
        C107733l lVar = this.f299988b;
        int i = this.f299989c;
        C59071e eVar = C107820q.f300003a;
        Query a = lVar.mo96253a();
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        C83639ba baVar = (C83639ba) C83640bb.f228003c.createBuilder();
        baVar.copyOnWrite();
        C83640bb bbVar = (C83640bb) baVar.instance;
        bbVar.f228005a |= 1;
        bbVar.f228006b = i;
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        C83640bb bbVar2 = (C83640bb) baVar.build();
        bbVar2.getClass();
        yVar.f228084c = bbVar2;
        yVar.f228083b = 20;
        C58833ax a2 = C107759j.m178903a(a);
        if (a2.mo56113h()) {
            String str = (String) a2.mo56107c();
            wVar.copyOnWrite();
            C83673y yVar2 = (C83673y) wVar.instance;
            str.getClass();
            yVar2.f228082a |= 1;
            yVar2.f228085d = str;
        }
        jVar.mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
    }
}
