package com.google.android.apps.gsa.shared.p7195y;

import android.support.rastermill.FrameSequenceDrawable;
import com.bumptech.glide.load.p293a.C5679av;

/* renamed from: com.google.android.apps.gsa.shared.y.e */
/* compiled from: PG */
final class C91213e implements C5679av {

    /* renamed from: a */
    private final FrameSequenceDrawable f254602a;

    public C91213e(FrameSequenceDrawable frameSequenceDrawable) {
        this.f254602a = frameSequenceDrawable;
    }

    /* renamed from: a */
    public final int mo12158a() {
        return this.f254602a.getIntrinsicWidth() * this.f254602a.getIntrinsicHeight();
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return FrameSequenceDrawable.class;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo12160c() {
        return this.f254602a;
    }

    /* renamed from: e */
    public final void mo12162e() {
        if (!this.f254602a.isDestroyed()) {
            this.f254602a.destroy();
        }
    }
}
