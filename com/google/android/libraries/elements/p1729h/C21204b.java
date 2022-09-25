package com.google.android.libraries.elements.p1729h;

/* renamed from: com.google.android.libraries.elements.h.b */
/* compiled from: PG */
final class C21204b extends C21200ac {

    /* renamed from: a */
    private final String f59491a;

    /* renamed from: b */
    private final Long f59492b;

    /* renamed from: c */
    private final Long f59493c;

    /* renamed from: d */
    private final Long f59494d;

    /* renamed from: e */
    private final Integer f59495e;

    /* renamed from: f */
    private final C21198aa f59496f;

    public C21204b(String str, Long l, Long l2, Long l3, Integer num, C21198aa aaVar) {
        this.f59491a = str;
        this.f59492b = l;
        this.f59493c = l2;
        this.f59494d = l3;
        this.f59495e = num;
        this.f59496f = aaVar;
    }

    /* renamed from: a */
    public final C21198aa mo26232a() {
        return this.f59496f;
    }

    /* renamed from: b */
    public final Integer mo26233b() {
        return this.f59495e;
    }

    /* renamed from: c */
    public final Long mo26234c() {
        return this.f59493c;
    }

    /* renamed from: d */
    public final Long mo26235d() {
        return this.f59494d;
    }

    /* renamed from: e */
    public final Long mo26236e() {
        return this.f59492b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f59493c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f59494d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r4.f59495e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r1 = r4.f59496f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f59492b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.elements.p1729h.C21200ac
            r2 = 0
            if (r1 == 0) goto L_0x0082
            com.google.android.libraries.elements.h.ac r5 = (com.google.android.libraries.elements.p1729h.C21200ac) r5
            java.lang.String r1 = r4.f59491a
            java.lang.String r3 = r5.mo26237f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0082
            java.lang.Long r1 = r4.f59492b
            if (r1 != 0) goto L_0x0022
            java.lang.Long r1 = r5.mo26236e()
            if (r1 != 0) goto L_0x0082
            goto L_0x002c
        L_0x0022:
            java.lang.Long r3 = r5.mo26236e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0082
        L_0x002c:
            java.lang.Long r1 = r4.f59493c
            if (r1 != 0) goto L_0x0037
            java.lang.Long r1 = r5.mo26234c()
            if (r1 != 0) goto L_0x0082
            goto L_0x0041
        L_0x0037:
            java.lang.Long r3 = r5.mo26234c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0082
        L_0x0041:
            java.lang.Long r1 = r4.f59494d
            if (r1 != 0) goto L_0x004c
            java.lang.Long r1 = r5.mo26235d()
            if (r1 != 0) goto L_0x0082
            goto L_0x0056
        L_0x004c:
            java.lang.Long r3 = r5.mo26235d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0082
        L_0x0056:
            java.lang.Integer r1 = r4.f59495e
            if (r1 != 0) goto L_0x0061
            java.lang.Integer r1 = r5.mo26233b()
            if (r1 != 0) goto L_0x0082
            goto L_0x006b
        L_0x0061:
            java.lang.Integer r3 = r5.mo26233b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0082
        L_0x006b:
            com.google.android.libraries.elements.h.aa r1 = r4.f59496f
            if (r1 != 0) goto L_0x0076
            com.google.android.libraries.elements.h.aa r5 = r5.mo26232a()
            if (r5 != 0) goto L_0x0082
            goto L_0x0081
        L_0x0076:
            com.google.android.libraries.elements.h.aa r5 = r5.mo26232a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            return r0
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1729h.C21204b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo26237f() {
        return this.f59491a;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.f59491a.hashCode() ^ 1000003) * 1000003;
        Long l = this.f59492b;
        int i5 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        Long l2 = this.f59493c;
        if (l2 == null) {
            i2 = 0;
        } else {
            i2 = l2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        Long l3 = this.f59494d;
        if (l3 == null) {
            i3 = 0;
        } else {
            i3 = l3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        Integer num = this.f59495e;
        if (num == null) {
            i4 = 0;
        } else {
            i4 = num.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        C21198aa aaVar = this.f59496f;
        if (aaVar != null) {
            i5 = aaVar.hashCode();
        }
        return i9 ^ i5;
    }

    public final String toString() {
        String str = this.f59491a;
        Long l = this.f59492b;
        Long l2 = this.f59493c;
        Long l3 = this.f59494d;
        Integer num = this.f59495e;
        String valueOf = String.valueOf(this.f59496f);
        return "TimeSpan{name=" + str + ", startTimeUs=" + l + ", endTimeUs=" + l2 + ", spanLengthTimeUs=" + l3 + ", parentId=" + num + ", spanInfo=" + valueOf + "}";
    }
}
