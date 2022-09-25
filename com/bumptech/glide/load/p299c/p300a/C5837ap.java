package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.C5632s;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.c.a.ap */
/* compiled from: PG */
public final class C5837ap extends C5857f {

    /* renamed from: b */
    private static final byte[] f17434b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(f17613a);

    /* renamed from: c */
    private final int f17435c;

    public C5837ap(int i) {
        C5630q.m14604a(i > 0, "roundingRadius must be greater than 0.");
        this.f17435c = i;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(f17434b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f17435c).array());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        return C5841at.m15105g(dVar, bitmap, this.f17435c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5837ap) || this.f17435c != ((C5837ap) obj).f17435c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C5632s.m14611d(-569625254, this.f17435c + 527);
    }
}
