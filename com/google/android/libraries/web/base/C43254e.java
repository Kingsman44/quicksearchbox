package com.google.android.libraries.web.base;

import com.google.android.libraries.web.p3353c.C43323b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.web.base.e */
/* compiled from: PG */
final class C43254e extends C43257h {

    /* renamed from: a */
    public final String f113040a;

    /* renamed from: b */
    public final C58495hd f113041b;

    /* renamed from: c */
    public final C43323b f113042c;

    /* renamed from: d */
    public final boolean f113043d;

    /* renamed from: e */
    public final boolean f113044e;

    /* renamed from: f */
    public final boolean f113045f;

    /* renamed from: g */
    public final boolean f113046g;

    /* renamed from: h */
    public final boolean f113047h;

    /* renamed from: i */
    public final C58528ij f113048i;

    /* renamed from: j */
    public final C43256g f113049j;

    /* renamed from: k */
    public final boolean f113050k;

    public C43254e(String str, C58495hd hdVar, C43323b bVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C58528ij ijVar, C43256g gVar, boolean z6) {
        this.f113040a = str;
        this.f113041b = hdVar;
        this.f113042c = bVar;
        this.f113043d = z;
        this.f113044e = z2;
        this.f113045f = z3;
        this.f113046g = z4;
        this.f113047h = z5;
        this.f113048i = ijVar;
        this.f113049j = gVar;
        this.f113050k = z6;
    }

    /* renamed from: a */
    public final C43255f mo46350a() {
        return new C43253d(this);
    }

    /* renamed from: b */
    public final C43256g mo46351b() {
        return this.f113049j;
    }

    /* renamed from: c */
    public final C43323b mo46352c() {
        return this.f113042c;
    }

    /* renamed from: d */
    public final C58495hd mo46353d() {
        return this.f113041b;
    }

    /* renamed from: e */
    public final C58528ij mo46354e() {
        return this.f113048i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        r1 = r4.f113049j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.web.base.C43257h
            r2 = 0
            if (r1 == 0) goto L_0x0082
            com.google.android.libraries.web.base.h r5 = (com.google.android.libraries.web.base.C43257h) r5
            java.lang.String r1 = r4.f113040a
            java.lang.String r3 = r5.mo46356f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0082
            com.google.common.b.hd r1 = r4.f113041b
            com.google.common.b.hd r3 = r5.mo46353d()
            boolean r1 = com.google.common.p4522b.C58662ni.m90356o(r1, r3)
            if (r1 == 0) goto L_0x0082
            com.google.android.libraries.web.c.b r1 = r4.f113042c
            com.google.android.libraries.web.c.b r3 = r5.mo46352c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0082
            boolean r1 = r4.f113043d
            boolean r3 = r5.mo46362k()
            if (r1 != r3) goto L_0x0082
            boolean r1 = r4.f113044e
            boolean r3 = r5.mo46358h()
            if (r1 != r3) goto L_0x0082
            boolean r1 = r4.f113045f
            boolean r3 = r5.mo46361j()
            if (r1 != r3) goto L_0x0082
            boolean r1 = r4.f113046g
            boolean r3 = r5.mo46357g()
            if (r1 != r3) goto L_0x0082
            boolean r1 = r4.f113047h
            boolean r3 = r5.mo46360i()
            if (r1 != r3) goto L_0x0082
            com.google.common.b.ij r1 = r4.f113048i
            com.google.common.b.ij r3 = r5.mo46354e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0082
            com.google.android.libraries.web.base.g r1 = r4.f113049j
            if (r1 != 0) goto L_0x006e
            com.google.android.libraries.web.base.g r1 = r5.mo46351b()
            if (r1 != 0) goto L_0x0082
            goto L_0x0079
        L_0x006e:
            com.google.android.libraries.web.base.g r3 = r5.mo46351b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0079
            goto L_0x0082
        L_0x0079:
            boolean r1 = r4.f113050k
            boolean r5 = r5.mo46363l()
            if (r1 != r5) goto L_0x0082
            return r0
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.base.C43254e.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo46356f() {
        return this.f113040a;
    }

    /* renamed from: g */
    public final boolean mo46357g() {
        return this.f113046g;
    }

    /* renamed from: h */
    public final boolean mo46358h() {
        return this.f113044e;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = (((((((((((((((((this.f113040a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f113041b.entrySet())) * 1000003) ^ this.f113042c.hashCode()) * 1000003) ^ (true != this.f113043d ? 1237 : 1231)) * 1000003) ^ (true != this.f113044e ? 1237 : 1231)) * 1000003) ^ (true != this.f113045f ? 1237 : 1231)) * 1000003) ^ (true != this.f113046g ? 1237 : 1231)) * 1000003) ^ (true != this.f113047h ? 1237 : 1231)) * 1000003) ^ ((C58733pz) this.f113048i).f156499d) * 1000003;
        C43256g gVar = this.f113049j;
        if (gVar == null) {
            i = 0;
        } else {
            i = gVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        if (true == this.f113050k) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    /* renamed from: i */
    public final boolean mo46360i() {
        return this.f113047h;
    }

    /* renamed from: j */
    public final boolean mo46361j() {
        return this.f113045f;
    }

    /* renamed from: k */
    public final boolean mo46362k() {
        return this.f113043d;
    }

    /* renamed from: l */
    public final boolean mo46363l() {
        return this.f113050k;
    }

    public final String toString() {
        String str = this.f113040a;
        String i = C58662ni.m90350i(this.f113041b);
        String obj = this.f113042c.toString();
        boolean z = this.f113043d;
        boolean z2 = this.f113044e;
        boolean z3 = this.f113045f;
        boolean z4 = this.f113046g;
        boolean z5 = this.f113047h;
        String valueOf = String.valueOf(this.f113048i);
        String valueOf2 = String.valueOf(this.f113049j);
        boolean z6 = this.f113050k;
        return "LoadUrlParams{url=" + str + ", additionalHttpHeaders=" + i + ", clientData=" + obj + ", replaceCurrentEntry=" + z + ", isAutoplayEnabled=" + z2 + ", isWebLayerIntentProcessingDisabled=" + z3 + ", allowIntentLaunchesInBackground=" + z4 + ", isUserTyped=" + z5 + ", navigatedPageConsumers=" + valueOf + ", loadUrlResponse=" + valueOf2 + ", triggerRequestBlockCallbacks=" + z6 + "}";
    }
}
