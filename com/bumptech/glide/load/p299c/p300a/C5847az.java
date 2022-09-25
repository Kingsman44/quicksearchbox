package com.bumptech.glide.load.p299c.p300a;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.c.a.az */
/* compiled from: PG */
final class C5847az extends MediaDataSource {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f17448a;

    public C5847az(ByteBuffer byteBuffer) {
        this.f17448a = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f17448a.limit();
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= ((long) this.f17448a.limit())) {
            return -1;
        }
        this.f17448a.position((int) j);
        int min = Math.min(i2, this.f17448a.remaining());
        this.f17448a.get(bArr, i, min);
        return min;
    }
}
