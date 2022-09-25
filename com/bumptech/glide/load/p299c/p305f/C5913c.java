package com.bumptech.glide.load.p299c.p305f;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p299c.p300a.C5856e;
import com.bumptech.glide.load.p299c.p304e.C5900e;

/* renamed from: com.bumptech.glide.load.c.f.c */
/* compiled from: PG */
public final class C5913c implements C5915e {

    /* renamed from: a */
    private final C5642d f17557a;

    /* renamed from: b */
    private final C5915e f17558b;

    /* renamed from: c */
    private final C5915e f17559c;

    public C5913c(C5642d dVar, C5915e eVar, C5915e eVar2) {
        this.f17557a = dVar;
        this.f17558b = eVar;
        this.f17559c = eVar2;
    }

    /* renamed from: a */
    public final C5679av mo12371a(C5679av avVar, C5960s sVar) {
        Drawable drawable = (Drawable) avVar.mo12160c();
        if (drawable instanceof BitmapDrawable) {
            return this.f17558b.mo12371a(C5856e.m15133f(((BitmapDrawable) drawable).getBitmap(), this.f17557a), sVar);
        }
        if (drawable instanceof C5900e) {
            return this.f17559c.mo12371a(avVar, sVar);
        }
        return null;
    }
}
