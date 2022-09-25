package com.google.android.apps.gsa.sidekick.shared;

import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7722hn;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.b */
/* compiled from: PG */
final class C91646b extends C91716e {

    /* renamed from: a */
    public final C7722hn f255600a;

    /* renamed from: b */
    public final CardRenderingContext f255601b;

    /* renamed from: c */
    public final long f255602c;

    /* renamed from: d */
    public final C60220t f255603d;

    public C91646b(C7722hn hnVar, CardRenderingContext cardRenderingContext, long j, C60220t tVar) {
        this.f255600a = hnVar;
        this.f255601b = cardRenderingContext;
        this.f255602c = j;
        this.f255603d = tVar;
    }

    /* renamed from: a */
    public final long mo86024a() {
        return this.f255602c;
    }

    /* renamed from: b */
    public final C91712d mo86025b() {
        return new C91642a(this);
    }

    /* renamed from: c */
    public final CardRenderingContext mo86026c() {
        return this.f255601b;
    }

    /* renamed from: d */
    public final C60220t mo86027d() {
        return this.f255603d;
    }

    /* renamed from: e */
    public final C7722hn mo86028e() {
        return this.f255600a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r1 = r7.f255603d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.apps.gsa.sidekick.shared.C91716e
            r2 = 0
            if (r1 == 0) goto L_0x004d
            com.google.android.apps.gsa.sidekick.shared.e r8 = (com.google.android.apps.gsa.sidekick.shared.C91716e) r8
            com.google.ai.b.hn r1 = r7.f255600a
            if (r1 != 0) goto L_0x0016
            com.google.ai.b.hn r1 = r8.mo86028e()
            if (r1 != 0) goto L_0x004d
            goto L_0x0020
        L_0x0016:
            com.google.ai.b.hn r3 = r8.mo86028e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
        L_0x0020:
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r1 = r7.f255601b
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r3 = r8.mo86026c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
            long r3 = r7.f255602c
            long r5 = r8.mo86024a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004d
            com.google.common.o.l.t r1 = r7.f255603d
            if (r1 != 0) goto L_0x0041
            com.google.common.o.l.t r8 = r8.mo86027d()
            if (r8 != 0) goto L_0x004d
            goto L_0x004c
        L_0x0041:
            com.google.common.o.l.t r8 = r8.mo86027d()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            return r0
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.C91646b.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f255600a);
        String obj = this.f255601b.toString();
        long j = this.f255602c;
        String valueOf2 = String.valueOf(this.f255603d);
        return "InterestResponse{entryResponse=" + valueOf + ", cardRenderingContext=" + obj + ", cacheAgeMs=" + j + ", eventIdMessage=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        C7722hn hnVar = this.f255600a;
        int i2 = 0;
        if (hnVar == null) {
            i = 0;
        } else {
            i = hnVar.hashCode();
        }
        int hashCode = this.f255601b.hashCode();
        long j = this.f255602c;
        int i3 = (((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C60220t tVar = this.f255603d;
        if (tVar != null) {
            i2 = tVar.hashCode();
        }
        return i3 ^ i2;
    }
}
