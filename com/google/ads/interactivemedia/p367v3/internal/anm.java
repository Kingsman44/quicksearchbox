package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6743bi;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anm */
/* compiled from: PG */
final class anm implements atn {

    /* renamed from: a */
    final /* synthetic */ String f21045a;

    /* renamed from: b */
    final /* synthetic */ anp f21046b;

    public anm(anp anp, String str) {
        this.f21046b = anp;
        this.f21045a = str;
    }

    /* renamed from: a */
    public final void mo15032a(Throwable th) {
        C7458yy.m22582e("Failure to make Native-layer network request", th);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15033b(Object obj) {
        this.f21046b.f21048b.mo15008n(new amx(amv.nativeXhr, amw.nativeResponse, this.f21045a, (C6743bi) obj));
    }
}
