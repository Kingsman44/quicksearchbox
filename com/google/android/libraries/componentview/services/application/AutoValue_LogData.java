package com.google.android.libraries.componentview.services.application;

/* compiled from: PG */
final class AutoValue_LogData extends LogData {

    /* renamed from: a */
    private final String f57707a;

    /* renamed from: b */
    private final String f57708b;

    /* renamed from: c */
    private final String f57709c;

    /* renamed from: d */
    private final String f57710d;

    /* renamed from: e */
    private final String f57711e;

    /* renamed from: f */
    private final String f57712f;

    /* renamed from: g */
    private final Long f57713g;

    public AutoValue_LogData(String str, String str2, String str3, String str4, String str5, String str6, Long l) {
        this.f57707a = str;
        this.f57708b = str2;
        this.f57709c = str3;
        this.f57710d = str4;
        this.f57711e = str5;
        this.f57712f = str6;
        this.f57713g = l;
    }

    /* renamed from: a */
    public final Long mo25457a() {
        return this.f57713g;
    }

    /* renamed from: b */
    public final String mo25458b() {
        return this.f57711e;
    }

    /* renamed from: c */
    public final String mo25459c() {
        return this.f57709c;
    }

    /* renamed from: d */
    public final String mo25460d() {
        return this.f57710d;
    }

    /* renamed from: e */
    public final String mo25461e() {
        return this.f57707a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f57710d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r1 = r4.f57711e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r1 = r4.f57712f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r1 = r4.f57713g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f57709c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.componentview.services.application.LogData
            r2 = 0
            if (r1 == 0) goto L_0x008e
            com.google.android.libraries.componentview.services.application.LogData r5 = (com.google.android.libraries.componentview.services.application.LogData) r5
            java.lang.String r1 = r4.f57707a
            java.lang.String r3 = r5.mo25461e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = r4.f57708b
            java.lang.String r3 = r5.mo25464g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = r4.f57709c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r5.mo25459c()
            if (r1 != 0) goto L_0x008e
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r5.mo25459c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
        L_0x0038:
            java.lang.String r1 = r4.f57710d
            if (r1 != 0) goto L_0x0043
            java.lang.String r1 = r5.mo25460d()
            if (r1 != 0) goto L_0x008e
            goto L_0x004d
        L_0x0043:
            java.lang.String r3 = r5.mo25460d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
        L_0x004d:
            java.lang.String r1 = r4.f57711e
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = r5.mo25458b()
            if (r1 != 0) goto L_0x008e
            goto L_0x0062
        L_0x0058:
            java.lang.String r3 = r5.mo25458b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
        L_0x0062:
            java.lang.String r1 = r4.f57712f
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = r5.mo25463f()
            if (r1 != 0) goto L_0x008e
            goto L_0x0077
        L_0x006d:
            java.lang.String r3 = r5.mo25463f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
        L_0x0077:
            java.lang.Long r1 = r4.f57713g
            if (r1 != 0) goto L_0x0082
            java.lang.Long r5 = r5.mo25457a()
            if (r5 != 0) goto L_0x008e
            goto L_0x008d
        L_0x0082:
            java.lang.Long r5 = r5.mo25457a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            return r0
        L_0x008e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.services.application.AutoValue_LogData.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo25463f() {
        return this.f57712f;
    }

    /* renamed from: g */
    public final String mo25464g() {
        return this.f57708b;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((this.f57707a.hashCode() ^ 1000003) * 1000003) ^ this.f57708b.hashCode()) * 1000003;
        String str = this.f57709c;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        String str2 = this.f57710d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f57711e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str4 = this.f57712f;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        Long l = this.f57713g;
        if (l != null) {
            i5 = l.hashCode();
        }
        return i9 ^ i5;
    }

    public final String toString() {
        String str = this.f57707a;
        String str2 = this.f57708b;
        String str3 = this.f57709c;
        String str4 = this.f57710d;
        String str5 = this.f57711e;
        String str6 = this.f57712f;
        Long l = this.f57713g;
        return "LogData{url=" + str + ", ved=" + str2 + ", sig2=" + str3 + ", sqi=" + str4 + ", psig=" + str5 + ", ust=" + str6 + ", clickId=" + l + "}";
    }
}
