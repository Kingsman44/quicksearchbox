package com.google.android.apps.gsa.sidekick.main.actions;

import com.google.android.apps.gsa.sidekick.main.entry.C91326bd;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.n */
/* compiled from: PG */
public final class C91255n implements C91326bd {

    /* renamed from: a */
    private final C7718hj f254694a;

    public C91255n(C7718hj hjVar) {
        this.f254694a = hjVar;
    }

    /* renamed from: a */
    public final C58833ax mo85522a(C7718hj hjVar) {
        if (!this.f254694a.equals(hjVar)) {
            return C58836b.f156633a;
        }
        C7711hc hcVar = (C7711hc) hjVar.toBuilder();
        hcVar.copyOnWrite();
        C7718hj hjVar2 = (C7718hj) hcVar.instance;
        hjVar2.f26955a &= Integer.MAX_VALUE;
        hjVar2.f26939K = C7718hj.f26927af.f26939K;
        hcVar.copyOnWrite();
        C7718hj hjVar3 = (C7718hj) hcVar.instance;
        hjVar3.f26942N = null;
        hjVar3.f26961b &= -9;
        return C58833ax.m90834k((C7718hj) hcVar.build());
    }
}
