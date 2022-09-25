package com.google.apps.tiktok.account.api.controller;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.apps.tiktok.account.api.controller.bv */
/* compiled from: PG */
final class C46011bv extends C46013bx {

    /* renamed from: a */
    private final boolean f120858a;

    /* renamed from: b */
    private final C58485gu f120859b;

    /* renamed from: c */
    private final C58485gu f120860c;

    public C46011bv(boolean z, C58485gu guVar, C58485gu guVar2) {
        this.f120858a = z;
        this.f120859b = guVar;
        this.f120860c = guVar2;
    }

    /* renamed from: a */
    public final C58485gu mo50149a() {
        return this.f120859b;
    }

    /* renamed from: b */
    public final C58485gu mo50150b() {
        return this.f120860c;
    }

    /* renamed from: c */
    public final boolean mo50151c() {
        return this.f120858a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r1 = r4.f120860c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.apps.tiktok.account.api.controller.C46013bx
            r2 = 0
            if (r1 == 0) goto L_0x0036
            com.google.apps.tiktok.account.api.controller.bx r5 = (com.google.apps.tiktok.account.api.controller.C46013bx) r5
            boolean r1 = r4.f120858a
            boolean r3 = r5.mo50151c()
            if (r1 != r3) goto L_0x0036
            com.google.common.b.gu r1 = r4.f120859b
            com.google.common.b.gu r3 = r5.mo50149a()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x0036
            com.google.common.b.gu r1 = r4.f120860c
            if (r1 != 0) goto L_0x002a
            com.google.common.b.gu r5 = r5.mo50150b()
            if (r5 != 0) goto L_0x0036
            goto L_0x0035
        L_0x002a:
            com.google.common.b.gu r5 = r5.mo50150b()
            boolean r5 = com.google.common.p4522b.C58597ky.m90218i(r1, r5)
            if (r5 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            return r0
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.account.api.controller.C46011bv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((true != this.f120858a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f120859b.hashCode()) * 1000003;
        C58485gu guVar = this.f120860c;
        if (guVar == null) {
            i = 0;
        } else {
            i = guVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.f120858a;
        String valueOf = String.valueOf(this.f120859b);
        String valueOf2 = String.valueOf(this.f120860c);
        return "Config{canSwitchAccounts=" + z + ", initialSelectors=" + valueOf + ", overrideRequirements=" + valueOf2 + "}";
    }
}
