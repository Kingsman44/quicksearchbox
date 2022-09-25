package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.z */
/* compiled from: PG */
public final /* synthetic */ class C94902z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94866ao f265448a;

    /* renamed from: b */
    public final /* synthetic */ int f265449b;

    public /* synthetic */ C94902z(C94866ao aoVar, int i) {
        this.f265448a = aoVar;
        this.f265449b = i;
    }

    public final void run() {
        C94866ao aoVar = this.f265448a;
        int i = this.f265449b;
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(aoVar.f265281a.f265313z);
        Thread.currentThread().getName();
        synchronized (aoVar.f265281a.f265311x) {
            aoVar.f265281a.f265312y = false;
        }
        if (i != 0) {
            aoVar.f265281a.mo88704j(i);
            return;
        }
        aoVar.f265281a.mo88701g();
        aoVar.f265281a.f265293f.mo88716f();
    }
}
