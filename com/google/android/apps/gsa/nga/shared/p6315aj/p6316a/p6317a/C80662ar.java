package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.app.PendingIntent;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ar */
/* compiled from: PG */
final class C80662ar extends C80705cg {

    /* renamed from: a */
    public final boolean f221437a;

    /* renamed from: b */
    public final boolean f221438b;

    /* renamed from: c */
    public final PendingIntent f221439c;

    /* renamed from: d */
    public final PendingIntent f221440d;

    /* renamed from: e */
    public final String f221441e;

    public C80662ar(boolean z, boolean z2, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str) {
        this.f221437a = z;
        this.f221438b = z2;
        this.f221439c = pendingIntent;
        this.f221440d = pendingIntent2;
        this.f221441e = str;
    }

    @Deprecated
    /* renamed from: a */
    public final PendingIntent mo74456a() {
        return this.f221439c;
    }

    @Deprecated
    /* renamed from: b */
    public final PendingIntent mo74457b() {
        return this.f221440d;
    }

    /* renamed from: c */
    public final C80704cf mo74458c() {
        return new C80661aq(this);
    }

    /* renamed from: d */
    public final String mo74459d() {
        return this.f221441e;
    }

    /* renamed from: e */
    public final boolean mo74460e() {
        return this.f221437a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r1 = r4.f221440d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = r4.f221439c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80705cg
            r2 = 0
            if (r1 == 0) goto L_0x0053
            com.google.android.apps.gsa.nga.shared.aj.a.a.cg r5 = (com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80705cg) r5
            boolean r1 = r4.f221437a
            boolean r3 = r5.mo74460e()
            if (r1 != r3) goto L_0x0053
            boolean r1 = r4.f221438b
            boolean r3 = r5.mo74462f()
            if (r1 != r3) goto L_0x0053
            android.app.PendingIntent r1 = r4.f221439c
            if (r1 != 0) goto L_0x0026
            android.app.PendingIntent r1 = r5.mo74456a()
            if (r1 != 0) goto L_0x0053
            goto L_0x0030
        L_0x0026:
            android.app.PendingIntent r3 = r5.mo74456a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0053
        L_0x0030:
            android.app.PendingIntent r1 = r4.f221440d
            if (r1 != 0) goto L_0x003b
            android.app.PendingIntent r1 = r5.mo74457b()
            if (r1 != 0) goto L_0x0053
            goto L_0x0046
        L_0x003b:
            android.app.PendingIntent r3 = r5.mo74457b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            java.lang.String r1 = r4.f221441e
            java.lang.String r5 = r5.mo74459d()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0053
            return r0
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80662ar.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo74462f() {
        return this.f221438b;
    }

    public final String toString() {
        boolean z = this.f221437a;
        boolean z2 = this.f221438b;
        String valueOf = String.valueOf(this.f221439c);
        String valueOf2 = String.valueOf(this.f221440d);
        String str = this.f221441e;
        return "Configuration{isAvailable=" + z + ", ngaIsAssistant=" + z2 + ", configuration=" + valueOf + ", keyboardShowingChanged=" + valueOf2 + ", assistantLocale=" + str + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int i3 = ((true != this.f221437a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f221438b) {
            i2 = 1231;
        }
        int i4 = (i3 ^ i2) * 1000003;
        PendingIntent pendingIntent = this.f221439c;
        int i5 = 0;
        if (pendingIntent == null) {
            i = 0;
        } else {
            i = pendingIntent.hashCode();
        }
        int i6 = (i4 ^ i) * 1000003;
        PendingIntent pendingIntent2 = this.f221440d;
        if (pendingIntent2 != null) {
            i5 = pendingIntent2.hashCode();
        }
        return ((i6 ^ i5) * 1000003) ^ this.f221441e.hashCode();
    }
}
