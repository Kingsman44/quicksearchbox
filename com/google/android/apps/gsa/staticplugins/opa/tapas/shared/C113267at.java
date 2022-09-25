package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.at */
/* compiled from: PG */
final class C113267at extends C113340ck {

    /* renamed from: a */
    private C113286bk f313644a;

    /* renamed from: b */
    private boolean f313645b;

    /* renamed from: c */
    private byte f313646c;

    /* renamed from: a */
    public final C113341cl mo99976a() {
        C113286bk bkVar;
        if (this.f313646c == 1 && (bkVar = this.f313644a) != null) {
            return new C113268au(bkVar, this.f313645b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f313644a == null) {
            sb.append(" iconSource");
        }
        if (this.f313646c == 0) {
            sb.append(" isGeneric");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo99977b(C113286bk bkVar) {
        if (bkVar != null) {
            this.f313644a = bkVar;
            return;
        }
        throw new NullPointerException("Null iconSource");
    }

    /* renamed from: c */
    public final void mo99978c(boolean z) {
        this.f313645b = z;
        this.f313646c = 1;
    }
}
