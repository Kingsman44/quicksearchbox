package com.google.apps.tiktok.nav.gateway;

import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.apps.tiktok.nav.gateway.b */
/* compiled from: PG */
final class C47495b extends C47503i {

    /* renamed from: a */
    private final List f123321a;

    /* renamed from: b */
    private final List f123322b;

    /* renamed from: c */
    private final C58485gu f123323c;

    public C47495b(List list, List list2, C58485gu guVar) {
        this.f123321a = list;
        this.f123322b = list2;
        this.f123323c = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo51353a() {
        return this.f123323c;
    }

    /* renamed from: b */
    public final List mo51354b() {
        return this.f123322b;
    }

    /* renamed from: c */
    public final List mo51355c() {
        return this.f123321a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f123323c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.apps.tiktok.nav.gateway.C47503i
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.apps.tiktok.nav.gateway.i r5 = (com.google.apps.tiktok.nav.gateway.C47503i) r5
            java.util.List r1 = r4.f123321a
            java.util.List r3 = r5.mo51355c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.util.List r1 = r4.f123322b
            java.util.List r3 = r5.mo51354b()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x003a
            com.google.common.b.gu r1 = r4.f123323c
            if (r1 != 0) goto L_0x002e
            com.google.common.b.gu r5 = r5.mo51353a()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            com.google.common.b.gu r5 = r5.mo51353a()
            boolean r5 = com.google.common.p4522b.C58597ky.m90218i(r1, r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.nav.gateway.C47495b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f123321a.hashCode() ^ 1000003) * 1000003) ^ this.f123322b.hashCode()) * 1000003;
        C58485gu guVar = this.f123323c;
        if (guVar == null) {
            i = 0;
        } else {
            i = guVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f123321a.toString();
        String obj2 = this.f123322b.toString();
        String valueOf = String.valueOf(this.f123323c);
        return "GatewayAccountConfig{initialSelectors=" + obj + ", accountUiCallbacks=" + obj2 + ", overrideRequirements=" + valueOf + "}";
    }
}
