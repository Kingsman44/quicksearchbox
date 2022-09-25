package kotlinx.coroutines.p5582h;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.p5579e.C71710ar;
import kotlinx.coroutines.p5579e.C71711as;

/* renamed from: kotlinx.coroutines.h.k */
/* compiled from: PG */
public final class C71771k {

    /* renamed from: a */
    public static final long f191280a = C71711as.m104849a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b */
    public static final int f191281b;

    /* renamed from: c */
    public static final int f191282c = C71711as.m104851c("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: d */
    public static final long f191283d = TimeUnit.SECONDS.toNanos(C71711as.m104849a("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: e */
    public static final C71769i f191284e = new C71769i(0);

    /* renamed from: f */
    public static final C71769i f191285f = new C71769i(1);

    static {
        int i = C71710ar.f191177a;
        if (i < 2) {
            i = 2;
        }
        f191281b = C71711as.m104851c("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
    }
}
