package com.bumptech.glide.load.p299c.p300a;

import com.bumptech.glide.load.C5958q;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.c.a.ax */
/* compiled from: PG */
final class C5845ax implements C5958q {

    /* renamed from: a */
    private final ByteBuffer f17447a = ByteBuffer.allocate(4);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12320a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.f17447a) {
                this.f17447a.position(0);
                messageDigest.update(this.f17447a.putInt(num.intValue()).array());
            }
        }
    }
}
