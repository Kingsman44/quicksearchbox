package com.google.android.apps.gsa.opaonboarding;

/* renamed from: com.google.android.apps.gsa.opaonboarding.e */
/* compiled from: PG */
public final class C83938e extends C83818a {

    /* renamed from: a */
    public final int f228598a;

    /* renamed from: b */
    public final String f228599b;

    /* renamed from: c */
    private final String f228600c;

    public C83938e(int i, String str, String str2) {
        this.f228598a = i;
        this.f228599b = str;
        this.f228600c = str2;
    }

    /* renamed from: a */
    public final int mo77201a() {
        return this.f228598a;
    }

    /* renamed from: b */
    public final String mo77202b() {
        return this.f228599b;
    }

    /* renamed from: c */
    public final String mo77203c() {
        return this.f228600c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f228600c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f228599b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.opaonboarding.C83818a
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.apps.gsa.opaonboarding.a r5 = (com.google.android.apps.gsa.opaonboarding.C83818a) r5
            int r1 = r4.f228598a
            int r3 = r5.mo77201a()
            if (r1 != r3) goto L_0x003f
            java.lang.String r1 = r4.f228599b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo77202b()
            if (r1 != 0) goto L_0x003f
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.mo77202b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0028:
            java.lang.String r1 = r4.f228600c
            if (r1 != 0) goto L_0x0033
            java.lang.String r5 = r5.mo77203c()
            if (r5 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0033:
            java.lang.String r5 = r5.mo77203c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.opaonboarding.C83938e.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = this.f228598a;
        String str = this.f228599b;
        String str2 = this.f228600c;
        return "AccountConfig{accountMode=" + i + ", fixedAccountName=" + str + ", impersonatedUserId=" + str2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f228598a ^ 1000003) * 1000003;
        String str = this.f228599b;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        String str2 = this.f228600c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 ^ i3;
    }
}
