package com.bumptech.glide.load.p299c.p300a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bumptech.glide.load.c.a.l */
/* compiled from: PG */
final class C5863l implements C5866o {

    /* renamed from: a */
    private final ByteBuffer f17466a;

    public C5863l(ByteBuffer byteBuffer) {
        this.f17466a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: a */
    public final int mo12328a() {
        return (mo12331d() << 8) | mo12331d();
    }

    /* renamed from: b */
    public final int mo12329b(byte[] bArr, int i) {
        int min = Math.min(i, this.f17466a.remaining());
        if (min == 0) {
            return -1;
        }
        this.f17466a.get(bArr, 0, min);
        return min;
    }

    /* renamed from: c */
    public final long mo12330c(long j) {
        int min = (int) Math.min((long) this.f17466a.remaining(), j);
        ByteBuffer byteBuffer = this.f17466a;
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }

    /* renamed from: d */
    public final short mo12331d() {
        if (this.f17466a.remaining() > 0) {
            return (short) (this.f17466a.get() & 255);
        }
        throw new C5865n();
    }
}
