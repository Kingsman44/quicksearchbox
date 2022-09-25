package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.populous.core.PersonFieldMetadata;

/* renamed from: com.google.android.libraries.social.populous.e.b.b */
/* compiled from: PG */
public final class C42423b extends C42440s {

    /* renamed from: a */
    private final String f111266a;

    /* renamed from: b */
    private final String f111267b;

    /* renamed from: c */
    private final String f111268c;

    /* renamed from: d */
    private final String f111269d;

    /* renamed from: e */
    private final PersonFieldMetadata f111270e;

    /* renamed from: f */
    private final int f111271f = 2;

    public C42423b(String str, String str2, String str3, String str4, int i, PersonFieldMetadata personFieldMetadata) {
        this.f111266a = str;
        this.f111267b = str2;
        this.f111268c = str3;
        this.f111269d = str4;
        this.f111270e = personFieldMetadata;
    }

    /* renamed from: a */
    public final String mo45447a() {
        return this.f111268c;
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo44976b() {
        return this.f111270e;
    }

    /* renamed from: c */
    public final String mo45448c() {
        return this.f111267b;
    }

    /* renamed from: d */
    public final String mo45449d() {
        return this.f111269d;
    }

    /* renamed from: e */
    public final String mo45450e() {
        return this.f111266a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f111268c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f111267b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.p3296e.p3298b.C42440s
            r2 = 0
            if (r1 == 0) goto L_0x0062
            com.google.android.libraries.social.populous.e.b.s r5 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42440s) r5
            java.lang.String r1 = r4.f111266a
            java.lang.String r3 = r5.mo45450e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = r4.f111267b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo45448c()
            if (r1 != 0) goto L_0x0062
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.mo45448c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0062
        L_0x002c:
            java.lang.String r1 = r4.f111268c
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r5.mo45447a()
            if (r1 != 0) goto L_0x0062
            goto L_0x0042
        L_0x0037:
            java.lang.String r3 = r5.mo45447a()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0042
            goto L_0x0062
        L_0x0042:
            java.lang.String r1 = r4.f111269d
            java.lang.String r3 = r5.mo45449d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0062
            int r1 = r5.mo45452f()
            r3 = 2
            if (r1 != r3) goto L_0x0062
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r1 = r4.f111270e
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r5 = r5.mo44976b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0062
            return r0
        L_0x0062:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.p3298b.C42423b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final int mo45452f() {
        return 2;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f111266a.hashCode() ^ 1000003) * 1000003;
        String str = this.f111267b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str2 = this.f111268c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((((i3 ^ i2) * 1000003) ^ this.f111269d.hashCode()) * 1000003) ^ 2) * 1000003) ^ this.f111270e.hashCode();
    }

    public final String toString() {
        String str = this.f111266a;
        String str2 = this.f111267b;
        String str3 = this.f111268c;
        String str4 = this.f111269d;
        String obj = this.f111270e.toString();
        return "InternalResultDisplayName{value=" + str + ", givenName=" + str2 + ", familyName=" + str3 + ", label=" + str4 + ", source=DEVICE, metadata=" + obj + "}";
    }
}
