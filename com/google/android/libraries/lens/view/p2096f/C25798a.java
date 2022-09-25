package com.google.android.libraries.lens.view.p2096f;

/* renamed from: com.google.android.libraries.lens.view.f.a */
/* compiled from: PG */
public final class C25798a extends C25800c {

    /* renamed from: a */
    private final String f70084a;

    /* renamed from: b */
    private final String f70085b;

    public C25798a(String str, String str2) {
        this.f70084a = str;
        this.f70085b = str2;
    }

    /* renamed from: a */
    public final String mo30935a() {
        return this.f70084a;
    }

    /* renamed from: b */
    public final String mo30936b() {
        return this.f70085b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f70085b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.lens.view.p2096f.C25800c
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.libraries.lens.view.f.c r5 = (com.google.android.libraries.lens.view.p2096f.C25800c) r5
            java.lang.String r1 = r4.f70084a
            java.lang.String r3 = r5.mo30935a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = r4.f70085b
            if (r1 != 0) goto L_0x0022
            java.lang.String r5 = r5.mo30936b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            java.lang.String r5 = r5.mo30936b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2096f.C25798a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f70084a.hashCode() ^ 1000003) * 1000003;
        String str = this.f70085b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f70084a;
        String str2 = this.f70085b;
        return "CallerPackageAndEntryData{callerPackage=" + str + ", entryPoint=" + str2 + "}";
    }
}
