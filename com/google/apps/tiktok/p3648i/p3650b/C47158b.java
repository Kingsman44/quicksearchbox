package com.google.apps.tiktok.p3648i.p3650b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42882ah;
import com.google.common.base.C58833ax;
import com.google.protos.p4874ap.p4877b.p4878a.C63691b;

/* renamed from: com.google.apps.tiktok.i.b.b */
/* compiled from: PG */
final class C47158b extends C47162f {

    /* renamed from: b */
    private final C42882ah f122787b;

    /* renamed from: c */
    private final C63691b f122788c;

    /* renamed from: d */
    private final C21370a f122789d;

    /* renamed from: e */
    private final C58833ax f122790e;

    /* renamed from: f */
    private final C58833ax f122791f;

    /* renamed from: g */
    private final int f122792g;

    public C47158b(C42882ah ahVar, C63691b bVar, C21370a aVar, int i, C58833ax axVar, C58833ax axVar2) {
        this.f122787b = ahVar;
        this.f122788c = bVar;
        this.f122789d = aVar;
        this.f122792g = i;
        this.f122790e = axVar;
        this.f122791f = axVar2;
    }

    /* renamed from: a */
    public final C21370a mo51058a() {
        return this.f122789d;
    }

    /* renamed from: b */
    public final C42882ah mo51059b() {
        return this.f122787b;
    }

    /* renamed from: c */
    public final C58833ax mo51060c() {
        return this.f122790e;
    }

    /* renamed from: d */
    public final C58833ax mo51061d() {
        return this.f122791f;
    }

    /* renamed from: e */
    public final C63691b mo51062e() {
        return this.f122788c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f122788c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.apps.tiktok.p3648i.p3650b.C47162f
            r2 = 0
            if (r1 == 0) goto L_0x005a
            com.google.apps.tiktok.i.b.f r5 = (com.google.apps.tiktok.p3648i.p3650b.C47162f) r5
            com.google.android.libraries.storage.protostore.ah r1 = r4.f122787b
            com.google.android.libraries.storage.protostore.ah r3 = r5.mo51059b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005a
            com.google.protos.ap.b.a.b r1 = r4.f122788c
            if (r1 != 0) goto L_0x0022
            com.google.protos.ap.b.a.b r1 = r5.mo51062e()
            if (r1 != 0) goto L_0x005a
            goto L_0x002d
        L_0x0022:
            com.google.protos.ap.b.a.b r3 = r5.mo51062e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x005a
        L_0x002d:
            com.google.android.libraries.f.a r1 = r4.f122789d
            com.google.android.libraries.f.a r3 = r5.mo51058a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005a
            int r1 = r4.f122792g
            int r3 = r5.mo51064f()
            if (r1 != r3) goto L_0x005a
            com.google.common.base.ax r1 = r4.f122790e
            com.google.common.base.ax r3 = r5.mo51060c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005a
            com.google.common.base.ax r1 = r4.f122791f
            com.google.common.base.ax r5 = r5.mo51061d()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x005a
            return r0
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.p3648i.p3650b.C47158b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final int mo51064f() {
        return this.f122792g;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f122787b.hashCode() ^ 1000003) * 1000003;
        C63691b bVar = this.f122788c;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        return ((((((((hashCode ^ i) * 1000003) ^ this.f122789d.hashCode()) * 1000003) ^ this.f122792g) * 1000003) ^ this.f122790e.hashCode()) * 1000003) ^ this.f122791f.hashCode();
    }

    public final String toString() {
        String obj = this.f122787b.toString();
        String valueOf = String.valueOf(this.f122788c);
        String obj2 = this.f122789d.toString();
        String num = Integer.toString(this.f122792g - 1);
        String valueOf2 = String.valueOf(this.f122790e);
        String valueOf3 = String.valueOf(this.f122791f);
        return "LamsConfig{adapter=" + obj + ", stub=" + valueOf + ", clock=" + obj2 + ", clientId=" + num + ", minSyncPeriod=" + valueOf2 + ", minSyncTimeUnit=" + valueOf3 + "}";
    }
}
