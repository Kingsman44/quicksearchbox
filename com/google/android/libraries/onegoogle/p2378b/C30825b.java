package com.google.android.libraries.onegoogle.p2378b;

/* renamed from: com.google.android.libraries.onegoogle.b.b */
/* compiled from: PG */
final class C30825b extends C30833j {

    /* renamed from: a */
    private final String f83161a;

    /* renamed from: b */
    private final String f83162b;

    /* renamed from: c */
    private final String f83163c;

    /* renamed from: d */
    private final String f83164d;

    /* renamed from: e */
    private final boolean f83165e;

    /* renamed from: f */
    private final boolean f83166f;

    public C30825b(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        if (str != null) {
            this.f83161a = str;
            if (str2 != null) {
                this.f83162b = str2;
                this.f83163c = str3;
                this.f83164d = str4;
                this.f83165e = z;
                this.f83166f = z2;
                return;
            }
            throw new NullPointerException("Null accountName");
        }
        throw new NullPointerException("Null accountIdentifier");
    }

    /* renamed from: a */
    public final String mo36521a() {
        return this.f83161a;
    }

    /* renamed from: b */
    public final String mo36522b() {
        return this.f83162b;
    }

    /* renamed from: c */
    public final String mo36523c() {
        return this.f83164d;
    }

    /* renamed from: d */
    public final String mo36524d() {
        return this.f83163c;
    }

    /* renamed from: e */
    public final boolean mo36525e() {
        return this.f83165e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f83164d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f83163c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.p2378b.C30833j
            r2 = 0
            if (r1 == 0) goto L_0x005f
            com.google.android.libraries.onegoogle.b.j r5 = (com.google.android.libraries.onegoogle.p2378b.C30833j) r5
            java.lang.String r1 = r4.f83161a
            java.lang.String r3 = r5.mo36521a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.f83162b
            java.lang.String r3 = r5.mo36522b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.f83163c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r5.mo36524d()
            if (r1 != 0) goto L_0x005f
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r5.mo36524d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0038:
            java.lang.String r1 = r4.f83164d
            if (r1 != 0) goto L_0x0043
            java.lang.String r1 = r5.mo36523c()
            if (r1 != 0) goto L_0x005f
            goto L_0x004e
        L_0x0043:
            java.lang.String r3 = r5.mo36523c()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x004e
            goto L_0x005f
        L_0x004e:
            boolean r1 = r4.f83165e
            boolean r3 = r5.mo36525e()
            if (r1 != r3) goto L_0x005f
            boolean r1 = r4.f83166f
            boolean r5 = r5.mo36527f()
            if (r1 != r5) goto L_0x005f
            return r0
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.p2378b.C30825b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo36527f() {
        return this.f83166f;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f83161a.hashCode() ^ 1000003) * 1000003) ^ this.f83162b.hashCode()) * 1000003;
        String str = this.f83163c;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str2 = this.f83164d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i4 = (i3 ^ i2) * 1000003;
        int i5 = 1237;
        int i6 = (i4 ^ (true != this.f83165e ? 1237 : 1231)) * 1000003;
        if (true == this.f83166f) {
            i5 = 1231;
        }
        return i6 ^ i5;
    }

    public final String toString() {
        String str = this.f83161a;
        String str2 = this.f83162b;
        String str3 = this.f83163c;
        String str4 = this.f83164d;
        boolean z = this.f83165e;
        boolean z2 = this.f83166f;
        return "OneGoogleAvatarImageLoaderKey{accountIdentifier=" + str + ", accountName=" + str2 + ", displayName=" + str3 + ", avatarUrl=" + str4 + ", isGaiaAccount=" + z + ", isMetadataAvailable=" + z2 + "}";
    }
}
