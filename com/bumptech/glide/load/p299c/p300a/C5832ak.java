package com.bumptech.glide.load.p299c.p300a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.p293a.C5674aq;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.p291h.C5630q;

/* renamed from: com.bumptech.glide.load.c.a.ak */
/* compiled from: PG */
public final class C5832ak implements C5679av, C5674aq {

    /* renamed from: a */
    private final Resources f17423a;

    /* renamed from: b */
    private final C5679av f17424b;

    private C5832ak(Resources resources, C5679av avVar) {
        C5630q.m14607d(resources, "Argument must not be null");
        this.f17423a = resources;
        this.f17424b = avVar;
    }

    /* renamed from: f */
    public static C5679av m15079f(Resources resources, C5679av avVar) {
        if (avVar == null) {
            return null;
        }
        return new C5832ak(resources, avVar);
    }

    /* renamed from: a */
    public final int mo12158a() {
        return this.f17424b.mo12158a();
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return BitmapDrawable.class;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12160c() {
        return new BitmapDrawable(this.f17423a, (Bitmap) this.f17424b.mo12160c());
    }

    /* renamed from: d */
    public final void mo12176d() {
        C5679av avVar = this.f17424b;
        if (avVar instanceof C5674aq) {
            ((C5674aq) avVar).mo12176d();
        }
    }

    /* renamed from: e */
    public final void mo12162e() {
        this.f17424b.mo12162e();
    }
}
