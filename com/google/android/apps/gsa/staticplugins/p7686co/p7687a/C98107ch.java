package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7713he;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.ch */
/* compiled from: PG */
public final class C98107ch extends C91953ad {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C7718hj mo85623c(C7718hj hjVar) {
        if ((hjVar.f26955a & 1073741824) == 0) {
            return hjVar;
        }
        int a = C7713he.m22812a(hjVar.f26985z);
        if (a != 0 && a == 4) {
            return hjVar;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (hjVar.f26938J == null) {
            C7874nd ndVar = C7874nd.f27577J;
        }
        C7711hc hcVar = (C7711hc) hjVar.toBuilder();
        hcVar.copyOnWrite();
        C7718hj hjVar2 = (C7718hj) hcVar.instance;
        hjVar2.f26938J = null;
        hjVar2.f26955a &= -1073741825;
        return (C7718hj) hcVar.build();
    }
}
