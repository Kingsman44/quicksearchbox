package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_SourceIdentity  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SourceIdentity extends SourceIdentity {

    /* renamed from: a */
    public final String f110676a;

    /* renamed from: b */
    public final String f110677b;

    /* renamed from: c */
    public final int f110678c;

    public C$AutoValue_SourceIdentity(int i, String str, String str2) {
        if (i != 0) {
            this.f110678c = i;
            this.f110676a = str;
            this.f110677b = str2;
            return;
        }
        throw new NullPointerException("Null containerType");
    }

    /* renamed from: a */
    public final String mo45058a() {
        return this.f110677b;
    }

    /* renamed from: b */
    public final String mo45059b() {
        return this.f110676a;
    }

    /* renamed from: c */
    public final int mo45060c() {
        return this.f110678c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f110677b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f110676a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.core.SourceIdentity
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.libraries.social.populous.core.SourceIdentity r5 = (com.google.android.libraries.social.populous.core.SourceIdentity) r5
            int r1 = r4.f110678c
            int r3 = r5.mo45060c()
            if (r1 != r3) goto L_0x003f
            java.lang.String r1 = r4.f110676a
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo45059b()
            if (r1 != 0) goto L_0x003f
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.mo45059b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0028:
            java.lang.String r1 = r4.f110677b
            if (r1 != 0) goto L_0x0033
            java.lang.String r5 = r5.mo45058a()
            if (r5 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0033:
            java.lang.String r5 = r5.mo45058a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C$AutoValue_SourceIdentity.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String num = Integer.toString(this.f110678c - 1);
        String str = this.f110676a;
        String str2 = this.f110677b;
        return "SourceIdentity{containerType=" + num + ", id=" + str + ", deviceContactLookupKey=" + str2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f110678c ^ 1000003) * 1000003;
        String str = this.f110676a;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        String str2 = this.f110677b;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 ^ i3;
    }
}
