package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.f */
/* compiled from: PG */
final class C101766f extends C101779s {

    /* renamed from: a */
    private final int f283868a;

    /* renamed from: b */
    private final Intent f283869b;

    public C101766f(int i, Intent intent) {
        this.f283868a = i;
        this.f283869b = intent;
    }

    /* renamed from: a */
    public final int mo92563a() {
        return this.f283868a;
    }

    /* renamed from: b */
    public final Intent mo92564b() {
        return this.f283869b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f283869b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101779s
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.s r5 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101779s) r5
            int r1 = r4.f283868a
            int r3 = r5.mo92563a()
            if (r1 != r3) goto L_0x002a
            android.content.Intent r1 = r4.f283869b
            if (r1 != 0) goto L_0x001e
            android.content.Intent r5 = r5.mo92564b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            android.content.Intent r5 = r5.mo92564b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101766f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f283868a ^ 1000003) * 1000003;
        Intent intent = this.f283869b;
        return i ^ (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        int i = this.f283868a;
        String valueOf = String.valueOf(this.f283869b);
        return "FinishActivityEvent{enrollmentResult=" + i + ", enrollmentResultData=" + valueOf + "}";
    }
}
