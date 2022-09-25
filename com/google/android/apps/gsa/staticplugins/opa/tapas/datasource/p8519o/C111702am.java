package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import android.util.Pair;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88639l;
import com.google.android.apps.gsa.shared.p6990an.C89208aa;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.base.C58832aw;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.am */
/* compiled from: PG */
public final /* synthetic */ class C111702am implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C111703an f310521a;

    /* renamed from: b */
    public final /* synthetic */ String f310522b;

    public /* synthetic */ C111702am(C111703an anVar, String str) {
        this.f310521a = anVar;
        this.f310522b = str;
    }

    public final void run() {
        C111703an anVar = this.f310521a;
        String str = this.f310522b;
        anVar.f310526d = str;
        Pair a = anVar.f310524b.mo82297a(C89208aa.TAPAS, C49728r.f128339j);
        if (a == null) {
            anVar.f310527e = null;
        } else if (a.second == null) {
            anVar.f310527e = null;
        } else if (((C88639l) a.second).f239627a == null) {
            anVar.f310527e = null;
        } else if (!(((C88639l) a.second).f239627a instanceof C49728r)) {
            anVar.mo82241j();
        } else if (anVar.f310523a.mo26870b() - ((C88639l) a.second).f239628b > TimeUnit.MILLISECONDS.convert(anVar.f310525c, TimeUnit.DAYS)) {
            anVar.mo82241j();
        } else if (!C58832aw.m90831a(str, a.first)) {
            anVar.f310527e = null;
        } else {
            anVar.f310527e = (C88639l) a.second;
        }
    }
}
