package com.google.apps.tiktok.p3643g;

import android.os.Bundle;

/* renamed from: com.google.apps.tiktok.g.d */
/* compiled from: PG */
public final class C47088d extends C47100p {

    /* renamed from: a */
    public final int f122684a;

    /* renamed from: b */
    public final String f122685b;

    /* renamed from: c */
    public final Bundle f122686c;

    public C47088d(int i, String str, Bundle bundle) {
        this.f122684a = i;
        this.f122685b = str;
        this.f122686c = bundle;
    }

    /* renamed from: a */
    public final int mo51010a() {
        return this.f122684a;
    }

    /* renamed from: b */
    public final Bundle mo51011b() {
        return this.f122686c;
    }

    /* renamed from: c */
    public final String mo51012c() {
        return this.f122685b;
    }

    /* renamed from: d */
    public final boolean mo51013d() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f122686c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f122685b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.apps.tiktok.p3643g.C47100p
            r2 = 0
            if (r1 == 0) goto L_0x0045
            com.google.apps.tiktok.g.p r5 = (com.google.apps.tiktok.p3643g.C47100p) r5
            int r1 = r4.f122684a
            int r3 = r5.mo51010a()
            if (r1 != r3) goto L_0x0045
            java.lang.String r1 = r4.f122685b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo51012c()
            if (r1 != 0) goto L_0x0045
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.mo51012c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
        L_0x0028:
            android.os.Bundle r1 = r4.f122686c
            if (r1 != 0) goto L_0x0033
            android.os.Bundle r1 = r5.mo51011b()
            if (r1 != 0) goto L_0x0045
            goto L_0x003e
        L_0x0033:
            android.os.Bundle r3 = r5.mo51011b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x003e
            goto L_0x0045
        L_0x003e:
            boolean r5 = r5.mo51013d()
            if (r5 != 0) goto L_0x0045
            return r0
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.p3643g.C47088d.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = this.f122684a;
        String str = this.f122685b;
        String valueOf = String.valueOf(this.f122686c);
        return "OrderedResult{resultCode=" + i + ", resultData=" + str + ", resultExtras=" + valueOf + ", isAbort=false}";
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f122684a ^ 1000003) * 1000003;
        String str = this.f122685b;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        Bundle bundle = this.f122686c;
        if (bundle != null) {
            i3 = bundle.hashCode();
        }
        return ((i4 ^ i3) * 1000003) ^ 1237;
    }
}
