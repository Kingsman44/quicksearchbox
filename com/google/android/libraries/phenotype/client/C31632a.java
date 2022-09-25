package com.google.android.libraries.phenotype.client;

import android.content.Context;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.phenotype.client.a */
/* compiled from: PG */
final class C31632a extends C31653ai {

    /* renamed from: a */
    public final Context f85105a;

    /* renamed from: b */
    public final C58881cr f85106b;

    public C31632a(Context context, C58881cr crVar) {
        if (context != null) {
            this.f85105a = context;
            this.f85106b = crVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: a */
    public final Context mo37281a() {
        return this.f85105a;
    }

    /* renamed from: b */
    public final C58881cr mo37282b() {
        return this.f85106b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f85106b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.phenotype.client.C31653ai
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.libraries.phenotype.client.ai r5 = (com.google.android.libraries.phenotype.client.C31653ai) r5
            android.content.Context r1 = r4.f85105a
            android.content.Context r3 = r5.mo37281a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.common.base.cr r1 = r4.f85106b
            if (r1 != 0) goto L_0x0022
            com.google.common.base.cr r5 = r5.mo37282b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.common.base.cr r5 = r5.mo37282b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.C31632a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f85105a.hashCode() ^ 1000003) * 1000003;
        C58881cr crVar = this.f85106b;
        if (crVar == null) {
            i = 0;
        } else {
            i = crVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f85105a.toString();
        String valueOf = String.valueOf(this.f85106b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
