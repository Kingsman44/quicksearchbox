package com.bumptech.glide.load.p299c.p300a;

import com.bumptech.glide.load.C5958q;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.c.a.aw */
/* compiled from: PG */
final class C5844aw implements C5958q {

    /* renamed from: a */
    private final ByteBuffer f17446a = ByteBuffer.allocate(8);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12320a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f17446a) {
            this.f17446a.position(0);
            messageDigest.update(this.f17446a.putLong(l.longValue()).array());
        }
    }
}
