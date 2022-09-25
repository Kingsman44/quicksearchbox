package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.gsa.shared.p7041h.C89778j;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.p */
/* compiled from: PG */
public final /* synthetic */ class C110556p implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110559s f308216a;

    public /* synthetic */ C110556p(C110559s sVar) {
        this.f308216a = sVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110559s sVar = this.f308216a;
        C58833ax axVar = (C58833ax) obj;
        C58480gp gpVar = new C58480gp(4);
        if (axVar.mo56113h()) {
            for (C89776h hVar : ((C89778j) axVar.mo56107c()).f242998a) {
                if (!sVar.mo98765f(hVar, true)) {
                    gpVar.mo55395g(hVar);
                }
            }
        }
        return C58833ax.m90833j(gpVar.mo55394f());
    }
}
