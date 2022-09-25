package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adg */
/* compiled from: PG */
public final class adg implements abx {

    /* renamed from: a */
    private final abx f20356a;

    /* renamed from: b */
    private long f20357b;

    /* renamed from: c */
    private Uri f20358c = Uri.EMPTY;

    /* renamed from: d */
    private Map f20359d = Collections.emptyMap();

    public adg(abx abx) {
        ary.m19467t(abx);
        this.f20356a = abx;
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        int a = this.f20356a.mo14388a(bArr, i, i2);
        if (a != -1) {
            this.f20357b += (long) a;
        }
        return a;
    }

    /* renamed from: b */
    public final void mo14402b(adh adh) {
        ary.m19467t(adh);
        this.f20356a.mo14402b(adh);
    }

    /* renamed from: c */
    public final long mo14389c(acb acb) {
        this.f20358c = acb.f20241a;
        this.f20359d = Collections.emptyMap();
        long c = this.f20356a.mo14389c(acb);
        Uri d = mo14390d();
        ary.m19467t(d);
        this.f20358c = d;
        this.f20359d = mo14403e();
        return c;
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        return this.f20356a.mo14390d();
    }

    /* renamed from: e */
    public final Map mo14403e() {
        return this.f20356a.mo14403e();
    }

    /* renamed from: f */
    public final void mo14391f() {
        this.f20356a.mo14391f();
    }

    /* renamed from: g */
    public final void mo14482g() {
        this.f20357b = 0;
    }

    /* renamed from: h */
    public final long mo14483h() {
        return this.f20357b;
    }

    /* renamed from: i */
    public final Uri mo14484i() {
        return this.f20358c;
    }

    /* renamed from: j */
    public final Map mo14485j() {
        return this.f20359d;
    }
}
