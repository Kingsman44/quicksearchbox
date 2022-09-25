package com.bumptech.glide.load.p299c.p300a;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.p291h.C5632s;

/* renamed from: com.bumptech.glide.load.c.a.f */
/* compiled from: PG */
public abstract class C5857f implements C5964w {
    /* renamed from: b */
    public final C5679av mo12295b(Context context, C5679av avVar, int i, int i2) {
        if (C5632s.m14622o(i, i2)) {
            C5642d dVar = C5543d.m14321a(context).f16788a;
            Bitmap bitmap = (Bitmap) avVar.mo12160c();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo12296c(dVar, bitmap, i, i2);
            if (bitmap.equals(c)) {
                return avVar;
            }
            return C5856e.m15133f(c, dVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2);
}
