package com.google.android.libraries.notifications.p2293h;

import android.os.Bundle;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.notifications.h.a */
/* compiled from: PG */
final class C30008a extends C30011d {

    /* renamed from: a */
    private final C58485gu f81226a;

    /* renamed from: b */
    private final int f81227b;

    public C30008a(int i, C58485gu guVar) {
        this.f81227b = i;
        this.f81226a = guVar;
    }

    /* renamed from: a */
    public final Bundle mo35313a() {
        return null;
    }

    /* renamed from: b */
    public final C58485gu mo35314b() {
        return this.f81226a;
    }

    /* renamed from: c */
    public final int mo35315c() {
        return this.f81227b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f81226a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.p2293h.C30011d
            r2 = 0
            if (r1 == 0) goto L_0x0030
            com.google.android.libraries.notifications.h.d r5 = (com.google.android.libraries.notifications.p2293h.C30011d) r5
            int r1 = r4.f81227b
            int r3 = r5.mo35315c()
            if (r1 != r3) goto L_0x0030
            com.google.common.b.gu r1 = r4.f81226a
            if (r1 != 0) goto L_0x001e
            com.google.common.b.gu r1 = r5.mo35314b()
            if (r1 != 0) goto L_0x0030
            goto L_0x0029
        L_0x001e:
            com.google.common.b.gu r3 = r5.mo35314b()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0030
        L_0x0029:
            android.os.Bundle r5 = r5.mo35313a()
            if (r5 != 0) goto L_0x0030
            return r0
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2293h.C30008a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f81227b ^ 1000003) * 1000003;
        C58485gu guVar = this.f81226a;
        return (i ^ (guVar == null ? 0 : guVar.hashCode())) * 1000003;
    }

    public final String toString() {
        String str = this.f81227b != 1 ? "BACKGROUND" : "APP_ACTIVITY";
        String valueOf = String.valueOf(this.f81226a);
        return "ClickBehavior{behaviorType=" + str + ", activityIntents=" + valueOf + ", appProvidedData=null}";
    }
}
