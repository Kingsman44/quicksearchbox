package androidx.media3.exoplayer.p145h.p147b;

import java.util.NoSuchElementException;

/* renamed from: androidx.media3.exoplayer.h.b.b */
/* compiled from: PG */
public abstract class C3046b implements C3061q {

    /* renamed from: a */
    public long f8824a;

    /* renamed from: c */
    private final long f8825c;

    /* renamed from: d */
    private final long f8826d;

    public C3046b(long j, long j2) {
        this.f8825c = j;
        this.f8826d = j2;
        this.f8824a = j - 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo6980c() {
        long j = this.f8824a;
        if (j < this.f8825c || j > this.f8826d) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public final boolean mo6981d() {
        long j = this.f8824a + 1;
        this.f8824a = j;
        return j <= this.f8826d;
    }
}
