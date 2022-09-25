package com.google.android.libraries.web.base.p3348b.p3349a;

import android.net.Uri;

/* renamed from: com.google.android.libraries.web.base.b.a.a */
/* compiled from: PG */
public final class C43236a extends C43237b {

    /* renamed from: a */
    public final Uri f112991a;

    /* renamed from: b */
    public final String f112992b;

    /* renamed from: c */
    public final Uri f112993c;

    /* renamed from: d */
    private final Uri f112994d;

    /* renamed from: e */
    private final String f112995e;

    public C43236a(Uri uri, Uri uri2, String str, String str2, Uri uri3) {
        if (uri != null) {
            this.f112994d = uri;
            this.f112991a = uri2;
            this.f112992b = str;
            this.f112995e = str2;
            this.f112993c = uri3;
            return;
        }
        throw new NullPointerException("Null pageUri");
    }

    /* renamed from: a */
    public final Uri mo46311a() {
        return this.f112991a;
    }

    /* renamed from: b */
    public final Uri mo46312b() {
        return this.f112994d;
    }

    /* renamed from: c */
    public final Uri mo46313c() {
        return this.f112993c;
    }

    /* renamed from: d */
    public final String mo46314d() {
        return this.f112992b;
    }

    /* renamed from: e */
    public final String mo46315e() {
        return this.f112995e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f112992b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f112995e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r4.f112993c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f112991a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.web.base.p3348b.p3349a.C43237b
            r2 = 0
            if (r1 == 0) goto L_0x006d
            com.google.android.libraries.web.base.b.a.b r5 = (com.google.android.libraries.web.base.p3348b.p3349a.C43237b) r5
            android.net.Uri r1 = r4.f112994d
            android.net.Uri r3 = r5.mo46312b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            android.net.Uri r1 = r4.f112991a
            if (r1 != 0) goto L_0x0022
            android.net.Uri r1 = r5.mo46311a()
            if (r1 != 0) goto L_0x006d
            goto L_0x002c
        L_0x0022:
            android.net.Uri r3 = r5.mo46311a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x002c:
            java.lang.String r1 = r4.f112992b
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r5.mo46314d()
            if (r1 != 0) goto L_0x006d
            goto L_0x0041
        L_0x0037:
            java.lang.String r3 = r5.mo46314d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x0041:
            java.lang.String r1 = r4.f112995e
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = r5.mo46315e()
            if (r1 != 0) goto L_0x006d
            goto L_0x0056
        L_0x004c:
            java.lang.String r3 = r5.mo46315e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x0056:
            android.net.Uri r1 = r4.f112993c
            if (r1 != 0) goto L_0x0061
            android.net.Uri r5 = r5.mo46313c()
            if (r5 != 0) goto L_0x006d
            goto L_0x006c
        L_0x0061:
            android.net.Uri r5 = r5.mo46313c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            return r0
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.base.p3348b.p3349a.C43236a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.f112994d.hashCode() ^ 1000003) * 1000003;
        Uri uri = this.f112991a;
        int i4 = 0;
        if (uri == null) {
            i = 0;
        } else {
            i = uri.hashCode();
        }
        int i5 = (hashCode ^ i) * 1000003;
        String str = this.f112992b;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        String str2 = this.f112995e;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        Uri uri2 = this.f112993c;
        if (uri2 != null) {
            i4 = uri2.hashCode();
        }
        return i7 ^ i4;
    }

    public final String toString() {
        String obj = this.f112994d.toString();
        String valueOf = String.valueOf(this.f112991a);
        String str = this.f112992b;
        String str2 = this.f112995e;
        String valueOf2 = String.valueOf(this.f112993c);
        return "ContextMenuWebLayerParams{pageUri=" + obj + ", linkUri=" + valueOf + ", linkText=" + str + ", titleOrAltText=" + str2 + ", srcUri=" + valueOf2 + "}";
    }
}
