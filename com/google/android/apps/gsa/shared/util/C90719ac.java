package com.google.android.apps.gsa.shared.util;

import android.os.SystemClock;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.shared.util.ac */
/* compiled from: PG */
public final class C90719ac {

    /* renamed from: a */
    public static final C90719ac f253778a = new C90719ac();

    /* renamed from: b */
    public final Random f253779b = new Random();

    /* renamed from: c */
    private final AtomicReference f253780c = new AtomicReference();

    /* renamed from: d */
    private long f253781d = -1;

    private C90719ac() {
    }

    /* renamed from: c */
    public static String m148169c() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public final long mo85083a() {
        Random random = (Random) this.f253780c.get();
        if (random == null) {
            Random random2 = new Random(SystemClock.elapsedRealtimeNanos() + (SystemClock.currentThreadTimeMillis() << 24));
            this.f253780c.set(random2);
            random = random2;
        }
        return (this.f253779b.nextLong() ^ random.nextLong()) ^ System.nanoTime();
    }

    /* renamed from: b */
    public final long mo85084b() {
        long j = this.f253781d;
        if (j == -1) {
            j = System.currentTimeMillis();
        }
        this.f253781d = 1 + j;
        return j;
    }
}
