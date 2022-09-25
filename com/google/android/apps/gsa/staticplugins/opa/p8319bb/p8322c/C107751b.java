package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.c.b */
/* compiled from: PG */
public final /* synthetic */ class C107751b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107759j f299818a;

    /* renamed from: b */
    public final /* synthetic */ Query f299819b;

    public /* synthetic */ C107751b(C107759j jVar, Query query) {
        this.f299818a = jVar;
        this.f299819b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C58833ax axVar;
        C107759j jVar = this.f299818a;
        Query query = this.f299819b;
        C58833ax axVar2 = (C58833ax) obj;
        if (axVar2.mo56113h()) {
            C51195j jVar2 = (C51195j) axVar2.mo56107c();
            if ((jVar2.f133266a & 32) != 0) {
                C52091ex exVar = jVar2.f133273h;
                if (exVar == null) {
                    exVar = C52091ex.f136710b;
                }
                axVar = C58833ax.m90834k(exVar);
            } else {
                axVar = C58836b.f156633a;
            }
            jVar.mo96266b(query, axVar);
        }
    }
}
