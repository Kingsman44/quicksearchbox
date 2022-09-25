package androidx.p114h.p115a;

import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: androidx.h.a.f */
/* compiled from: PG */
final class C2274f extends C2270b {
    public C2274f(InputStream inputStream) {
        super(inputStream, ByteOrder.BIG_ENDIAN);
        if (inputStream.markSupported()) {
            this.f6364a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }

    /* renamed from: c */
    public final void mo5667c(long j) {
        long j2 = (long) this.f6365b;
        if (j2 > j) {
            this.f6365b = 0;
            this.f6364a.reset();
        } else {
            j -= j2;
        }
        mo5640b((int) j);
    }

    public C2274f(byte[] bArr) {
        super(bArr);
        this.f6364a.mark(Integer.MAX_VALUE);
    }
}
