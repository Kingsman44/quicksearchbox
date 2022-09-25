package androidx.p114h.p115a;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: androidx.h.a.a */
/* compiled from: PG */
final class C2269a extends MediaDataSource {

    /* renamed from: a */
    long f6362a;

    /* renamed from: b */
    final /* synthetic */ C2274f f6363b;

    public C2269a(C2274f fVar) {
        this.f6363b = fVar;
    }

    public final void close() {
    }

    public final long getSize() {
        return -1;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f6362a;
            if (j2 != j) {
                if (j2 >= 0) {
                    if (j >= j2 + ((long) this.f6363b.f6364a.available())) {
                        return -1;
                    }
                }
                this.f6363b.mo5667c(j);
                this.f6362a = j;
            }
            if (i2 > this.f6363b.f6364a.available()) {
                i2 = this.f6363b.f6364a.available();
            }
            int read = this.f6363b.read(bArr, i, i2);
            if (read >= 0) {
                this.f6362a += (long) read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f6362a = -1;
        return -1;
    }
}
