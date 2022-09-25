package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.dataservice.ea */
/* compiled from: PG */
public final /* synthetic */ class C46813ea implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46814eb f122188a;

    public /* synthetic */ C46813ea(C46814eb ebVar) {
        this.f122188a = ebVar;
    }

    public final void run() {
        C46814eb ebVar = this.f122188a;
        C46781cy cyVar = (C46781cy) ebVar.f122189a.f122195f.getAndSet((Object) null);
        C46815ec ecVar = ebVar.f122189a;
        C46789df dfVar = ecVar.f122197h;
        long b = ecVar.f122190a.mo26870b();
        C46886z zVar = (C46886z) dfVar;
        C58838bb.m90884s(zVar.f122330c != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        C46689ag agVar = zVar.f122328a;
        ecVar.f122197h = new C46886z(agVar, zVar.f122329b, zVar.f122330c, zVar.f122332e, zVar.f122331d.mo50803g(agVar, b));
        if (C46781cy.LOCAL_STATE_CHANGE.equals(cyVar)) {
            C46815ec ecVar2 = ebVar.f122189a;
            ecVar2.mo50821c(((C46886z) ecVar2.f122197h).f122331d);
        } else if (C46781cy.REMOTE_STATE_CHANGE.equals(cyVar)) {
            C46815ec ecVar3 = ebVar.f122189a;
            ecVar3.mo50820b(((C46886z) ecVar3.f122197h).f122331d);
        } else {
            throw new IllegalStateException("Invalidation was ".concat(String.valueOf(String.valueOf(cyVar))));
        }
    }
}
