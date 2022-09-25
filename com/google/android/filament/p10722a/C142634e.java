package com.google.android.filament.p10722a;

import android.view.Surface;
import android.view.TextureView;

/* renamed from: com.google.android.filament.a.e */
/* compiled from: PG */
public final class C142634e implements C142632c {

    /* renamed from: a */
    final /* synthetic */ C142635f f386964a;

    /* renamed from: b */
    private final TextureView f386965b;

    /* renamed from: c */
    private Surface f386966c;

    public C142634e(C142635f fVar, TextureView textureView) {
        this.f386964a = fVar;
        this.f386965b = textureView;
    }

    /* renamed from: a */
    public final void mo117331a() {
        mo117333c((Surface) null);
    }

    /* renamed from: b */
    public final void mo117332b(int i, int i2) {
        this.f386965b.getSurfaceTexture().setDefaultBufferSize(i, i2);
        this.f386964a.f386973g.mo53130a(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo117333c(Surface surface) {
        Surface surface2;
        if (surface == null && (surface2 = this.f386966c) != null) {
            surface2.release();
        }
        this.f386966c = surface;
    }
}
