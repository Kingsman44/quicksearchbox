package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.u */
/* compiled from: PG */
public final /* synthetic */ class C94897u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94868aq f265437a;

    /* renamed from: b */
    public final /* synthetic */ int f265438b;

    public /* synthetic */ C94897u(C94868aq aqVar, int i) {
        this.f265437a = aqVar;
        this.f265438b = i;
    }

    public final void run() {
        C94868aq aqVar = this.f265437a;
        int i = this.f265438b;
        C59104x c = C94868aq.f265285a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoGattHelper");
        ((C59052c) ((C59052c) c).mo56372aa(17421)).mo56354G("[%s] Operation %s timeout", C94876ay.m156555d(aqVar.f265313z), C94871at.m156532a(i));
        aqVar.mo88708n();
    }
}
