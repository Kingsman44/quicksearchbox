package com.google.android.libraries.glide.p1824c;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.load.p293a.C5679av;

/* renamed from: com.google.android.libraries.glide.c.a */
/* compiled from: PG */
final class C22008a implements C5679av {

    /* renamed from: a */
    private final PictureDrawable f60719a;

    public C22008a(PictureDrawable pictureDrawable) {
        this.f60719a = pictureDrawable;
    }

    /* renamed from: a */
    public final int mo12158a() {
        return this.f60719a.getIntrinsicHeight() * this.f60719a.getIntrinsicWidth() * 4;
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return PictureDrawable.class;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo12160c() {
        return this.f60719a;
    }

    /* renamed from: e */
    public final void mo12162e() {
        this.f60719a.setPicture((Picture) null);
    }
}
