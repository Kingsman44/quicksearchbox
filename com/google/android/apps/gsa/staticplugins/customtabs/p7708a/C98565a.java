package com.google.android.apps.gsa.staticplugins.customtabs.p7708a;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.a.a */
/* compiled from: PG */
final class C98565a extends C98574j {

    /* renamed from: b */
    private final C58485gu f275293b;

    /* renamed from: c */
    private final String f275294c;

    public C98565a(C58485gu guVar, String str) {
        if (guVar != null) {
            this.f275293b = guVar;
            this.f275294c = str;
            return;
        }
        throw new NullPointerException("Null allBrowserPackages");
    }

    /* renamed from: a */
    public final C58485gu mo91179a() {
        return this.f275293b;
    }

    /* renamed from: b */
    public final String mo91180b() {
        return this.f275294c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f275294c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98574j
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.gsa.staticplugins.customtabs.a.j r5 = (com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98574j) r5
            com.google.common.b.gu r1 = r4.f275293b
            com.google.common.b.gu r3 = r5.mo91179a()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = r4.f275294c
            if (r1 != 0) goto L_0x0022
            java.lang.String r5 = r5.mo91180b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            java.lang.String r5 = r5.mo91180b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98565a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f275293b.hashCode() ^ 1000003) * 1000003;
        String str = this.f275294c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f275293b.toString();
        String str = this.f275294c;
        return "CustomTabsPackages{allBrowserPackages=" + obj + ", chromeCustomTabsPackage=" + str + "}";
    }
}
