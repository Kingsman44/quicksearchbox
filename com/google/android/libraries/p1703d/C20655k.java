package com.google.android.libraries.p1703d;

import android.net.Uri;

/* renamed from: com.google.android.libraries.d.k */
/* compiled from: PG */
public final class C20655k extends C20642af {

    /* renamed from: a */
    public final String f57914a;

    /* renamed from: b */
    public final Uri f57915b;

    /* renamed from: c */
    public final Uri f57916c;

    public C20655k(String str, Uri uri, Uri uri2) {
        this.f57914a = str;
        this.f57915b = uri;
        this.f57916c = uri2;
    }

    /* renamed from: a */
    public final Uri mo25591a() {
        return this.f57916c;
    }

    /* renamed from: b */
    public final Uri mo25592b() {
        return this.f57915b;
    }

    /* renamed from: c */
    public final String mo25593c() {
        return this.f57914a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f57916c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.p1703d.C20642af
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.libraries.d.af r5 = (com.google.android.libraries.p1703d.C20642af) r5
            java.lang.String r1 = r4.f57914a
            java.lang.String r3 = r5.mo25593c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            android.net.Uri r1 = r4.f57915b
            android.net.Uri r3 = r5.mo25592b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            android.net.Uri r1 = r4.f57916c
            if (r1 != 0) goto L_0x002e
            android.net.Uri r5 = r5.mo25591a()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            android.net.Uri r5 = r5.mo25591a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1703d.C20655k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f57914a.hashCode() ^ 1000003) * 1000003) ^ this.f57915b.hashCode()) * 1000003;
        Uri uri = this.f57916c;
        if (uri == null) {
            i = 0;
        } else {
            i = uri.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f57914a;
        String obj = this.f57915b.toString();
        String valueOf = String.valueOf(this.f57916c);
        return "CustomTabsNavigationInfo{title=" + str + ", uri=" + obj + ", screenshotUri=" + valueOf + "}";
    }
}
