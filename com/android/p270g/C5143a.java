package com.android.p270g;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.android.g.a */
/* compiled from: PG */
final class C5143a implements C5144b {

    /* renamed from: a */
    private final ByteBuffer f16347a;

    public C5143a(ByteBuffer byteBuffer) {
        this.f16347a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final long mo10195a() {
        return (long) this.f16347a.capacity();
    }

    /* renamed from: b */
    public final void mo10196b(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.f16347a) {
            int i2 = (int) j;
            this.f16347a.position(i2);
            this.f16347a.limit(i2 + i);
            slice = this.f16347a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }
}
