package com.google.android.apps.gsa.opa.smartspace;

import android.graphics.Bitmap;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d */
/* compiled from: PG */
final class C83757d extends C83802r {

    /* renamed from: a */
    public final C58833ax f228294a;

    /* renamed from: b */
    public final Bitmap f228295b;

    /* renamed from: c */
    public final C58833ax f228296c;

    public C83757d(C58833ax axVar, Bitmap bitmap, C58833ax axVar2) {
        this.f228294a = axVar;
        this.f228295b = bitmap;
        this.f228296c = axVar2;
    }

    /* renamed from: a */
    public final Bitmap mo77091a() {
        return this.f228295b;
    }

    /* renamed from: b */
    public final C83801q mo77092b() {
        return new C83744c(this);
    }

    /* renamed from: c */
    public final C58833ax mo77093c() {
        return this.f228294a;
    }

    /* renamed from: d */
    public final C58833ax mo77094d() {
        return this.f228296c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f228295b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.opa.smartspace.C83802r
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.apps.gsa.opa.smartspace.r r5 = (com.google.android.apps.gsa.opa.smartspace.C83802r) r5
            com.google.common.base.ax r1 = r4.f228294a
            com.google.common.base.ax r3 = r5.mo77093c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            android.graphics.Bitmap r1 = r4.f228295b
            if (r1 != 0) goto L_0x0022
            android.graphics.Bitmap r1 = r5.mo77091a()
            if (r1 != 0) goto L_0x003a
            goto L_0x002d
        L_0x0022:
            android.graphics.Bitmap r3 = r5.mo77091a()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            com.google.common.base.ax r1 = r4.f228296c
            com.google.common.base.ax r5 = r5.mo77094d()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x003a
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.opa.smartspace.C83757d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f228294a.hashCode() ^ 1000003) * 1000003;
        Bitmap bitmap = this.f228295b;
        if (bitmap == null) {
            i = 0;
        } else {
            i = bitmap.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.f228296c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f228294a);
        String valueOf2 = String.valueOf(this.f228295b);
        String valueOf3 = String.valueOf(this.f228296c);
        return "SmartspaceChipContent{pendingIntent=" + valueOf + ", icon=" + valueOf2 + ", smartspaceChip=" + valueOf3 + "}";
    }
}
