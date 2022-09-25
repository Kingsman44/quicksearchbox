package p5488io.p5490b.p5497e.p5513j;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.b.e.j.c */
/* compiled from: PG */
public final class C70082c {
    /* renamed from: a */
    public static long m101981a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m101982b(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m101982b(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }
}
