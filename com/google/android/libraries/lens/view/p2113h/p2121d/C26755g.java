package com.google.android.libraries.lens.view.p2113h.p2121d;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.lens.view.h.d.g */
/* compiled from: PG */
final class C26755g extends C26750b {

    /* renamed from: a */
    private final boolean f72890a;

    /* renamed from: b */
    private final boolean f72891b;

    /* renamed from: c */
    private final boolean f72892c;

    /* renamed from: d */
    private final long f72893d;

    /* renamed from: e */
    private final boolean f72894e;

    /* renamed from: f */
    private final SettableFuture f72895f;

    public C26755g(boolean z, boolean z2, boolean z3, long j, boolean z4, SettableFuture settableFuture) {
        this.f72890a = z;
        this.f72891b = z2;
        this.f72892c = z3;
        this.f72893d = j;
        this.f72894e = z4;
        this.f72895f = settableFuture;
    }

    /* renamed from: a */
    public final long mo32082a() {
        return this.f72893d;
    }

    /* renamed from: d */
    public final SettableFuture mo32083d() {
        return this.f72895f;
    }

    /* renamed from: e */
    public final boolean mo32084e() {
        return this.f72894e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r1 = r7.f72895f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.libraries.lens.view.p2113h.p2121d.C26750b
            r2 = 0
            if (r1 == 0) goto L_0x004c
            com.google.android.libraries.lens.view.h.d.b r8 = (com.google.android.libraries.lens.view.p2113h.p2121d.C26750b) r8
            boolean r1 = r7.f72890a
            boolean r3 = r8.mo32086g()
            if (r1 != r3) goto L_0x004c
            boolean r1 = r7.f72891b
            boolean r3 = r8.mo32087h()
            if (r1 != r3) goto L_0x004c
            boolean r1 = r7.f72892c
            boolean r3 = r8.mo32085f()
            if (r1 != r3) goto L_0x004c
            long r3 = r7.f72893d
            long r5 = r8.mo32082a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004c
            boolean r1 = r7.f72894e
            boolean r3 = r8.mo32084e()
            if (r1 != r3) goto L_0x004c
            com.google.common.util.concurrent.SettableFuture r1 = r7.f72895f
            if (r1 != 0) goto L_0x0040
            com.google.common.util.concurrent.SettableFuture r8 = r8.mo32083d()
            if (r8 != 0) goto L_0x004c
            goto L_0x004b
        L_0x0040:
            com.google.common.util.concurrent.SettableFuture r8 = r8.mo32083d()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            return r0
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2121d.C26755g.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo32085f() {
        return this.f72892c;
    }

    /* renamed from: g */
    public final boolean mo32086g() {
        return this.f72890a;
    }

    /* renamed from: h */
    public final boolean mo32087h() {
        return this.f72891b;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f72890a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f72891b ? 1237 : 1231)) * 1000003;
        int i3 = true != this.f72892c ? 1237 : 1231;
        long j = this.f72893d;
        int i4 = (((i2 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        if (true == this.f72894e) {
            i = 1231;
        }
        int i5 = (i4 ^ i) * 1000003;
        SettableFuture settableFuture = this.f72895f;
        return i5 ^ (settableFuture == null ? 0 : settableFuture.hashCode());
    }
}
