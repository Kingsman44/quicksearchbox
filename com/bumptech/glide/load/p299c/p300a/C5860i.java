package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.c.a.i */
/* compiled from: PG */
public final class C5860i extends C5857f {

    /* renamed from: b */
    private static final byte[] f17463b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f17613a);

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(f17463b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        return C5841at.m15101c(dVar, bitmap, i, i2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C5860i;
    }

    public final int hashCode() {
        return -599754482;
    }
}
