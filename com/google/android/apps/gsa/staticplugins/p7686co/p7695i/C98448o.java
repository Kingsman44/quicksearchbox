package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.p375ai.p378b.C7641en;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.o */
/* compiled from: PG */
final class C98448o extends C98437dd {

    /* renamed from: a */
    private final int f274863a;

    /* renamed from: b */
    private final boolean f274864b;

    /* renamed from: c */
    private final boolean f274865c;

    /* renamed from: d */
    private final C7641en f274866d;

    /* renamed from: e */
    private final C98444k f274867e;

    public C98448o(int i, boolean z, boolean z2, C98444k kVar, C7641en enVar) {
        this.f274863a = i;
        this.f274864b = z;
        this.f274865c = z2;
        this.f274867e = kVar;
        this.f274866d = enVar;
    }

    /* renamed from: a */
    public final int mo91106a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo91107b() {
        return this.f274863a;
    }

    /* renamed from: c */
    public final C7641en mo91108c() {
        return this.f274866d;
    }

    /* renamed from: d */
    public final boolean mo91109d() {
        return this.f274865c;
    }

    /* renamed from: e */
    public final boolean mo91110e() {
        return this.f274864b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r1 = r4.f274867e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r1 = r4.f274866d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98437dd
            r2 = 0
            if (r1 == 0) goto L_0x0055
            com.google.android.apps.gsa.staticplugins.co.i.dd r5 = (com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98437dd) r5
            int r1 = r4.f274863a
            int r3 = r5.mo91107b()
            if (r1 != r3) goto L_0x0055
            int r1 = r5.mo91106a()
            if (r1 != 0) goto L_0x0055
            boolean r1 = r4.f274864b
            boolean r3 = r5.mo91110e()
            if (r1 != r3) goto L_0x0055
            boolean r1 = r4.f274865c
            boolean r3 = r5.mo91109d()
            if (r1 != r3) goto L_0x0055
            com.google.android.apps.gsa.staticplugins.co.i.k r1 = r4.f274867e
            if (r1 != 0) goto L_0x0034
            com.google.android.apps.gsa.staticplugins.co.i.k r1 = r5.mo91111f()
            if (r1 != 0) goto L_0x0055
            goto L_0x003e
        L_0x0034:
            com.google.android.apps.gsa.staticplugins.co.i.k r3 = r5.mo91111f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
        L_0x003e:
            com.google.ai.b.en r1 = r4.f274866d
            if (r1 != 0) goto L_0x0049
            com.google.ai.b.en r5 = r5.mo91108c()
            if (r5 != 0) goto L_0x0055
            goto L_0x0054
        L_0x0049:
            com.google.ai.b.en r5 = r5.mo91108c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            return r0
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98448o.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C98444k mo91111f() {
        return this.f274867e;
    }

    public final String toString() {
        int i = this.f274863a;
        boolean z = this.f274864b;
        boolean z2 = this.f274865c;
        String valueOf = String.valueOf(this.f274867e);
        String valueOf2 = String.valueOf(this.f274866d);
        return "ThrottlerConfig{timeToLiveSeconds=" + i + ", delaySecs=0, forceSendImmediately=" + z + ", ignoreMainRequestBucketPending=" + z2 + ", requestBatch=" + valueOf + ", directive=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int i3 = (((this.f274863a ^ 1000003) * -721379959) ^ (true != this.f274864b ? 1237 : 1231)) * 1000003;
        if (true == this.f274865c) {
            i2 = 1231;
        }
        int i4 = (i3 ^ i2) * 1000003;
        C98444k kVar = this.f274867e;
        int i5 = 0;
        if (kVar == null) {
            i = 0;
        } else {
            i = kVar.hashCode();
        }
        int i6 = (i4 ^ i) * 1000003;
        C7641en enVar = this.f274866d;
        if (enVar != null) {
            i5 = enVar.hashCode();
        }
        return i6 ^ i5;
    }
}
