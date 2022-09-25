package com.google.android.libraries.notifications.platform.p2335g;

/* renamed from: com.google.android.libraries.notifications.platform.g.a */
/* compiled from: PG */
public final class C30141a extends C30143b {

    /* renamed from: a */
    public final String f81511a;

    /* renamed from: b */
    public final String f81512b;

    /* renamed from: c */
    public final Integer f81513c;

    /* renamed from: d */
    public final Integer f81514d;

    /* renamed from: e */
    public final Boolean f81515e;

    /* renamed from: f */
    public final Boolean f81516f;

    public C30141a(String str, String str2, Integer num, Integer num2, Boolean bool, Boolean bool2) {
        this.f81511a = str;
        this.f81512b = str2;
        this.f81513c = num;
        this.f81514d = num2;
        this.f81515e = bool;
        this.f81516f = bool2;
    }

    /* renamed from: a */
    public final Boolean mo35528a() {
        return this.f81516f;
    }

    /* renamed from: b */
    public final Boolean mo35529b() {
        return this.f81515e;
    }

    /* renamed from: c */
    public final Integer mo35530c() {
        return this.f81514d;
    }

    /* renamed from: d */
    public final Integer mo35531d() {
        return this.f81513c;
    }

    /* renamed from: e */
    public final String mo35532e() {
        return this.f81512b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f81512b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.platform.p2335g.C30143b
            r2 = 0
            if (r1 == 0) goto L_0x005e
            com.google.android.libraries.notifications.platform.g.b r5 = (com.google.android.libraries.notifications.platform.p2335g.C30143b) r5
            java.lang.String r1 = r4.f81511a
            java.lang.String r3 = r5.mo35534f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = r4.f81512b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo35532e()
            if (r1 != 0) goto L_0x005e
            goto L_0x002d
        L_0x0022:
            java.lang.String r3 = r5.mo35532e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x005e
        L_0x002d:
            java.lang.Integer r1 = r4.f81513c
            java.lang.Integer r3 = r5.mo35531d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            java.lang.Integer r1 = r4.f81514d
            java.lang.Integer r3 = r5.mo35530c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            java.lang.Boolean r1 = r4.f81515e
            java.lang.Boolean r3 = r5.mo35529b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            java.lang.Boolean r1 = r4.f81516f
            java.lang.Boolean r5 = r5.mo35528a()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.platform.p2335g.C30141a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo35534f() {
        return this.f81511a;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f81511a.hashCode() ^ 1000003) * 1000003;
        String str = this.f81512b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((((((((hashCode ^ i) * 1000003) ^ this.f81513c.hashCode()) * 1000003) ^ this.f81514d.hashCode()) * 1000003) ^ this.f81515e.hashCode()) * 1000003) ^ this.f81516f.hashCode();
    }

    public final String toString() {
        String str = this.f81511a;
        String str2 = this.f81512b;
        Integer num = this.f81513c;
        Integer num2 = this.f81514d;
        Boolean bool = this.f81515e;
        Boolean bool2 = this.f81516f;
        return "GnpMedia{url=" + str + ", accountName=" + str2 + ", width=" + num + ", height=" + num2 + ", shouldAuthenticateFifeUrls=" + bool + ", shouldApplyFifeOptions=" + bool2 + "}";
    }
}
