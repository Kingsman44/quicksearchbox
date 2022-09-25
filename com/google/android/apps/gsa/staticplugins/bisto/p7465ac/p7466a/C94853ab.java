package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C94853ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94866ao f265252a;

    /* renamed from: b */
    public final /* synthetic */ int f265253b;

    public /* synthetic */ C94853ab(C94866ao aoVar, int i) {
        this.f265252a = aoVar;
        this.f265253b = i;
    }

    public final void run() {
        C94866ao aoVar = this.f265252a;
        int i = this.f265253b;
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(aoVar.f265281a.f265313z);
        Thread.currentThread().getName();
        synchronized (aoVar.f265281a.f265311x) {
            aoVar.f265281a.f265312y = false;
        }
        if (aoVar.f265281a.f265298k.get()) {
            aoVar.f265281a.mo88703i();
        } else if (i != 0) {
            aoVar.f265281a.mo88704j(i);
        } else {
            aoVar.f265281a.mo88701g();
            aoVar.f265281a.f265293f.mo88716f();
        }
    }
}
