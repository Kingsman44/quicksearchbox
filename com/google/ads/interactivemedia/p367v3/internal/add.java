package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.add */
/* compiled from: PG */
public final class add implements acw {

    /* renamed from: a */
    public final long f20343a = C7313to.m21860a();

    /* renamed from: b */
    public final acb f20344b;

    /* renamed from: c */
    public final int f20345c;

    /* renamed from: d */
    private final adg f20346d;

    /* renamed from: e */
    private final adc f20347e;

    /* renamed from: f */
    private volatile Object f20348f;

    public add(abx abx, Uri uri, int i, adc adc) {
        aca aca = new aca();
        aca.mo14431g(uri);
        aca.mo14426b(1);
        acb a = aca.mo14425a();
        this.f20346d = new adg(abx);
        this.f20344b = a;
        this.f20345c = i;
        this.f20347e = adc;
    }

    /* renamed from: a */
    public final Object mo14478a() {
        return this.f20348f;
    }

    /* renamed from: b */
    public final void mo14464b() {
    }

    /* renamed from: c */
    public final void mo14465c() {
        this.f20346d.mo14482g();
        abz abz = new abz(this.f20346d, this.f20344b);
        try {
            abz.mo14409a();
            Uri d = this.f20346d.mo14390d();
            ary.m19467t(d);
            this.f20348f = this.f20347e.mo14477a(d, abz);
        } finally {
            aeu.m18548r(abz);
        }
    }

    /* renamed from: d */
    public final long mo14479d() {
        return this.f20346d.mo14483h();
    }

    /* renamed from: e */
    public final Uri mo14480e() {
        return this.f20346d.mo14484i();
    }

    /* renamed from: f */
    public final Map mo14481f() {
        return this.f20346d.mo14485j();
    }
}
