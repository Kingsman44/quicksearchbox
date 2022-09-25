package p3186j$.util.stream;

import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.F2 */
abstract class C41148F2 {

    /* renamed from: a */
    final long f107728a;

    /* renamed from: b */
    final long f107729b;

    /* renamed from: c */
    Spliterator f107730c;

    /* renamed from: d */
    long f107731d;

    /* renamed from: e */
    long f107732e;

    C41148F2(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.f107730c = spliterator;
        this.f107728a = j;
        this.f107729b = j2;
        this.f107731d = j3;
        this.f107732e = j4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Spliterator mo43659c(Spliterator spliterator, long j, long j2, long j3, long j4);

    public final int characteristics() {
        return this.f107730c.characteristics();
    }

    public final long estimateSize() {
        long j = this.f107732e;
        long j2 = this.f107728a;
        if (j2 < j) {
            return j - Math.max(j2, this.f107731d);
        }
        return 0;
    }

    public final Spliterator trySplit() {
        long j = this.f107732e;
        if (this.f107728a >= j || this.f107731d >= j) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f107730c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f107731d;
            long min = Math.min(estimateSize, this.f107729b);
            long j2 = this.f107728a;
            if (j2 >= min) {
                this.f107731d = min;
            } else {
                long j3 = this.f107729b;
                if (min >= j3) {
                    this.f107730c = trySplit;
                    this.f107732e = min;
                } else {
                    long j4 = this.f107731d;
                    if (j4 < j2 || estimateSize > j3) {
                        this.f107731d = min;
                        return mo43659c(trySplit, j2, j3, j4, min);
                    }
                    this.f107731d = min;
                    return trySplit;
                }
            }
        }
    }
}
