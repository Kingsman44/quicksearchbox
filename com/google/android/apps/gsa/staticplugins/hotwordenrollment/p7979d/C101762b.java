package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.b */
/* compiled from: PG */
final class C101762b extends C101775o {

    /* renamed from: a */
    private final C101773m f283858a;

    /* renamed from: b */
    private final Boolean f283859b;

    /* renamed from: c */
    private final Integer f283860c;

    /* renamed from: d */
    private final Intent f283861d;

    public C101762b(C101773m mVar, Boolean bool, Integer num, Intent intent) {
        this.f283858a = mVar;
        this.f283859b = bool;
        this.f283860c = num;
        this.f283861d = intent;
    }

    /* renamed from: a */
    public final Intent mo92548a() {
        return this.f283861d;
    }

    /* renamed from: b */
    public final C101773m mo92549b() {
        return this.f283858a;
    }

    /* renamed from: c */
    public final Boolean mo92550c() {
        return this.f283859b;
    }

    /* renamed from: d */
    public final Integer mo92551d() {
        return this.f283860c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.f283861d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r5 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o) r5
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = r4.f283858a
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r3 = r5.mo92549b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0046
            java.lang.Boolean r1 = r4.f283859b
            java.lang.Boolean r3 = r5.mo92550c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0046
            java.lang.Integer r1 = r4.f283860c
            java.lang.Integer r3 = r5.mo92551d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0046
            android.content.Intent r1 = r4.f283861d
            if (r1 != 0) goto L_0x003a
            android.content.Intent r5 = r5.mo92548a()
            if (r5 != 0) goto L_0x0046
            goto L_0x0045
        L_0x003a:
            android.content.Intent r5 = r5.mo92548a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101762b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f283858a.hashCode() ^ 1000003) * 1000003) ^ this.f283859b.hashCode()) * 1000003) ^ this.f283860c.hashCode()) * 1000003;
        Intent intent = this.f283861d;
        if (intent == null) {
            i = 0;
        } else {
            i = intent.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f283858a.toString();
        Boolean bool = this.f283859b;
        Integer num = this.f283860c;
        String valueOf = String.valueOf(this.f283861d);
        return "EnrollmentScreenInfo{enrollmentScreenId=" + obj + ", smoothScroll=" + bool + ", enrollmentResult=" + num + ", resultData=" + valueOf + "}";
    }
}
