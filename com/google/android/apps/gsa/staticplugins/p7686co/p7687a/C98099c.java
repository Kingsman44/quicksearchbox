package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.p375ai.p378b.C7744ii;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.c */
/* compiled from: PG */
final class C98099c extends C98058am {

    /* renamed from: a */
    private boolean f273872a;

    /* renamed from: b */
    private C7744ii f273873b;

    /* renamed from: c */
    private byte f273874c;

    /* renamed from: a */
    public final C98059an mo90908a() {
        C7744ii iiVar;
        if (this.f273874c == 1 && (iiVar = this.f273873b) != null) {
            return new C98122d(this.f273872a, iiVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f273874c == 0) {
            sb.append(" hasUnparks");
        }
        if (this.f273873b == null) {
            sb.append(" entryTree");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo90909b(C7744ii iiVar) {
        if (iiVar != null) {
            this.f273873b = iiVar;
            return;
        }
        throw new NullPointerException("Null entryTree");
    }

    /* renamed from: c */
    public final void mo90910c(boolean z) {
        this.f273872a = z;
        this.f273874c = 1;
    }
}
