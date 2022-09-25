package com.google.android.libraries.notifications.p2261a.p2264b;

/* renamed from: com.google.android.libraries.notifications.a.b.b */
/* compiled from: PG */
public final class C29771b extends C29774e {

    /* renamed from: a */
    private final String f80675a;

    /* renamed from: b */
    private final String f80676b;

    public C29771b(String str, String str2) {
        this.f80675a = str;
        this.f80676b = str2;
    }

    /* renamed from: a */
    public final String mo34939a() {
        return this.f80676b;
    }

    /* renamed from: b */
    public final String mo34940b() {
        return this.f80675a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f80676b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.p2261a.p2264b.C29774e
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.libraries.notifications.a.b.e r5 = (com.google.android.libraries.notifications.p2261a.p2264b.C29774e) r5
            java.lang.String r1 = r4.f80675a
            java.lang.String r3 = r5.mo34940b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = r4.f80676b
            if (r1 != 0) goto L_0x0022
            java.lang.String r5 = r5.mo34939a()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            java.lang.String r5 = r5.mo34939a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2261a.p2264b.C29771b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f80675a.hashCode() ^ 1000003) * 1000003;
        String str = this.f80676b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f80675a;
        String str2 = this.f80676b;
        return "PreferenceKey{key=" + str + ", dynamicKey=" + str2 + "}";
    }
}
