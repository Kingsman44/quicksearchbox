package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.eb */
/* compiled from: PG */
final class C46814eb implements C46784da {

    /* renamed from: a */
    final /* synthetic */ C46815ec f122189a;

    public C46814eb(C46815ec ecVar) {
        this.f122189a = ecVar;
    }

    /* renamed from: a */
    public final void mo50795a(C46782cz czVar) {
        boolean z;
        C46781cy cyVar = C46781cy.LOCAL_STATE_CHANGE;
        int ordinal = czVar.f122144c.ordinal();
        if (ordinal == 0) {
            z = C46811dz.m83389a(this.f122189a.f122195f, (Object) null, C46781cy.LOCAL_STATE_CHANGE);
        } else if (ordinal != 1) {
            throw new IllegalStateException("Unrecognized CallReason: ".concat(String.valueOf(String.valueOf(czVar))));
        } else if (!C46811dz.m83389a(this.f122189a.f122195f, C46781cy.LOCAL_STATE_CHANGE, C46781cy.REMOTE_STATE_CHANGE)) {
            z = C46811dz.m83389a(this.f122189a.f122195f, (Object) null, C46781cy.REMOTE_STATE_CHANGE);
        } else {
            return;
        }
        if (z) {
            this.f122189a.f122192c.execute(new C46813ea(this));
        }
    }
}
