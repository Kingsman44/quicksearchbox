package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.w */
/* compiled from: PG */
public final class C7379w {

    /* renamed from: a */
    private static C7379w f24133a;

    /* renamed from: b */
    private float f24134b = 0.0f;

    /* renamed from: c */
    private C7163o f24135c;

    /* renamed from: d */
    private C7190p f24136d;

    /* renamed from: e */
    private final C7009ih f24137e;

    /* renamed from: f */
    private final asn f24138f;

    public C7379w(C7009ih ihVar, asn asn, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f24137e = ihVar;
        this.f24138f = asn;
    }

    /* renamed from: a */
    public static C7379w m22239a() {
        if (f24133a == null) {
            f24133a = new C7379w(new C7009ih(), new asn(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        return f24133a;
    }

    /* renamed from: b */
    public final void mo16704b(Context context) {
        this.f24135c = new C7163o(new Handler(), context, new C6904ek(), this, (byte[]) null, (byte[]) null);
    }

    /* renamed from: c */
    public final void mo16705c() {
        C7244r.m21679a().mo16354g(this);
        C7244r.m21679a().mo16351c();
        if (C7244r.m21679a().mo16353e()) {
            C6802aq.m19255b().mo15163c();
        }
        this.f24135c.mo16220a();
    }

    /* renamed from: d */
    public final void mo16706d() {
        C6802aq.m19255b().mo15164d();
        C7244r.m21679a().mo16352d();
        this.f24135c.mo16221b();
    }

    /* renamed from: e */
    public final void mo16707e(float f) {
        this.f24134b = f;
        if (this.f24136d == null) {
            this.f24136d = C7190p.m21443a();
        }
        for (C7001i h : this.f24136d.mo16268f()) {
            h.mo16003h().mo14423j(f);
        }
    }

    /* renamed from: f */
    public final float mo16708f() {
        return this.f24134b;
    }
}
