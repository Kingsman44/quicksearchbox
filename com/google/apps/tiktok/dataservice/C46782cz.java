package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.cz */
/* compiled from: PG */
public final class C46782cz {

    /* renamed from: a */
    public static final C46782cz f122142a = new C46782cz(C46781cy.LOCAL_STATE_CHANGE);

    /* renamed from: b */
    public static final C46782cz f122143b = new C46782cz(C46781cy.REMOTE_STATE_CHANGE);

    /* renamed from: c */
    public final C46781cy f122144c;

    private C46782cz(C46781cy cyVar) {
        this.f122144c = cyVar;
    }

    public final String toString() {
        return "ResultPropagator.Update for CallReason ".concat(String.valueOf(String.valueOf(this.f122144c)));
    }
}
