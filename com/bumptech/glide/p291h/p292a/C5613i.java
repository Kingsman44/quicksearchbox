package com.bumptech.glide.p291h.p292a;

/* renamed from: com.bumptech.glide.h.a.i */
/* compiled from: PG */
public final class C5613i extends C5614j {

    /* renamed from: a */
    private volatile boolean f16947a;

    /* renamed from: a */
    public final void mo12056a(boolean z) {
        this.f16947a = z;
    }

    /* renamed from: b */
    public final void mo12057b() {
        if (this.f16947a) {
            throw new IllegalStateException("Already released");
        }
    }
}
