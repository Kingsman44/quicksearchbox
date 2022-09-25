package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.au */
/* compiled from: PG */
enum C135823au {
    FULFILLMENT_LINK_DISABLED(-1),
    FULFILLMENT_LINK_WEB_PAGE(0),
    FULFILLMENT_LINK_GOC(1),
    FULFILLMENT_LINK_WEBX(2);
    

    /* renamed from: f */
    private final long f369950f;

    private C135823au(long j) {
        this.f369950f = j;
    }

    /* renamed from: a */
    static C135823au m220362a(long j) {
        for (C135823au auVar : values()) {
            if (auVar.f369950f == j) {
                return auVar;
            }
        }
        return FULFILLMENT_LINK_DISABLED;
    }
}
