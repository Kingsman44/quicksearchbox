package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p293a.C5674aq;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.C5632s;

/* renamed from: com.bumptech.glide.load.c.a.e */
/* compiled from: PG */
public final class C5856e implements C5679av, C5674aq {

    /* renamed from: a */
    private final Bitmap f17459a;

    /* renamed from: b */
    private final C5642d f17460b;

    public C5856e(Bitmap bitmap, C5642d dVar) {
        C5630q.m14607d(bitmap, "Bitmap must not be null");
        this.f17459a = bitmap;
        C5630q.m14607d(dVar, "BitmapPool must not be null");
        this.f17460b = dVar;
    }

    /* renamed from: f */
    public static C5856e m15133f(Bitmap bitmap, C5642d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C5856e(bitmap, dVar);
    }

    /* renamed from: a */
    public final int mo12158a() {
        return C5632s.m14608a(this.f17459a);
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return Bitmap.class;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo12160c() {
        return this.f17459a;
    }

    /* renamed from: d */
    public final void mo12176d() {
        this.f17459a.prepareToDraw();
    }

    /* renamed from: e */
    public final void mo12162e() {
        this.f17460b.mo12116d(this.f17459a);
    }
}
