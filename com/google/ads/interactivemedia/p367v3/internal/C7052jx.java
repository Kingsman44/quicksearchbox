package com.google.ads.interactivemedia.p367v3.internal;

import java.io.EOFException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jx */
/* compiled from: PG */
public final class C7052jx implements C7073kr {

    /* renamed from: a */
    private final byte[] f22589a = new byte[4096];

    /* renamed from: a */
    public final void mo16102a(C6864cy cyVar) {
    }

    /* renamed from: b */
    public final void mo16103b(long j, int i, int i2, int i3, C7072kq kqVar) {
    }

    /* renamed from: c */
    public final int mo16104c(abu abu, int i, boolean z) {
        return atv.m19625q(this, abu, i, z);
    }

    /* renamed from: d */
    public final void mo16105d(aee aee, int i) {
        atv.m19626r(this, aee, i);
    }

    /* renamed from: e */
    public final int mo16106e(abu abu, int i, boolean z) {
        int a = abu.mo14388a(this.f22589a, 0, Math.min(4096, i));
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: f */
    public final void mo16107f(aee aee, int i) {
        aee.mo14557k(i);
    }
}
