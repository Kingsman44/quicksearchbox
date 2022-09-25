package com.google.android.apps.gsa.p8885y.p8886a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.y.a.c */
/* compiled from: PG */
public final class C118830c {

    /* renamed from: a */
    public final C118569b f331435a;

    /* renamed from: b */
    public final C118575h f331436b;

    /* renamed from: c */
    public final C118575h f331437c;

    /* renamed from: d */
    public final int f331438d;

    public C118830c(C118569b bVar, C118575h hVar, C118575h hVar2, int i) {
        this.f331435a = bVar;
        this.f331436b = hVar == null ? C118575h.UNKNOWN_WORKLOAD : hVar;
        this.f331437c = hVar2 == null ? C118575h.UNKNOWN_WORKLOAD : hVar2;
        this.f331438d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C118830c)) {
            return false;
        }
        C118830c cVar = (C118830c) obj;
        if (this.f331435a == cVar.f331435a && this.f331436b == cVar.f331436b && this.f331437c == cVar.f331437c && this.f331438d == cVar.f331438d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f331435a.f329776ks), Integer.valueOf(this.f331436b.f330812sk), Integer.valueOf(this.f331437c.f330812sk), Integer.valueOf(this.f331438d)});
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C118830c(com.google.common.p4552o.C59794fv r4) {
        /*
            r3 = this;
            int r0 = r4.f161575d
            com.google.android.apps.gsa.u.b r0 = com.google.android.apps.gsa.p8852u.C118569b.m196859a(r0)
            if (r0 != 0) goto L_0x000a
            com.google.android.apps.gsa.u.b r0 = com.google.android.apps.gsa.p8852u.C118569b.UNKNOWN_METRIC_TYPE
        L_0x000a:
            int r1 = r4.f161573b
            com.google.android.apps.gsa.u.h r1 = com.google.android.apps.gsa.p8852u.C118575h.m196865a(r1)
            if (r1 != 0) goto L_0x0014
            com.google.android.apps.gsa.u.h r1 = com.google.android.apps.gsa.p8852u.C118575h.ACTIVITY_ACCOUNT_DRAWER
        L_0x0014:
            int r2 = r4.f161574c
            com.google.android.apps.gsa.u.h r2 = com.google.android.apps.gsa.p8852u.C118575h.m196865a(r2)
            if (r2 != 0) goto L_0x001e
            com.google.android.apps.gsa.u.h r2 = com.google.android.apps.gsa.p8852u.C118575h.ACTIVITY_ACCOUNT_DRAWER
        L_0x001e:
            int r4 = r4.f161576e
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8885y.p8886a.C118830c.<init>(com.google.common.o.fv):void");
    }
}
