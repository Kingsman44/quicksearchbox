package com.bumptech.glide.p287f.p288a;

import com.bumptech.glide.p291h.C5632s;

@Deprecated
/* renamed from: com.bumptech.glide.f.a.l */
/* compiled from: PG */
public abstract class C5570l extends C5559a {

    /* renamed from: a */
    private final int f16854a;

    /* renamed from: b */
    private final int f16855b;

    public C5570l(int i, int i2) {
        this.f16854a = i;
        this.f16855b = i2;
    }

    /* renamed from: e */
    public final void mo11995e(C5571m mVar) {
        if (C5632s.m14622o(this.f16854a, this.f16855b)) {
            mVar.mo12006g(this.f16854a, this.f16855b);
            return;
        }
        int i = this.f16854a;
        int i2 = this.f16855b;
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2 + ", either provide dimensions in the constructor or call override()");
    }

    /* renamed from: g */
    public final void mo11996g(C5571m mVar) {
    }
}
