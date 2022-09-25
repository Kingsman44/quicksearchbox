package com.google.android.libraries.lens.view.utils;

import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.lens.view.utils.t */
/* compiled from: PG */
public final class C28131t {

    /* renamed from: a */
    public static final C28131t f76545a = new C28131t();

    /* renamed from: b */
    private final Random f76546b = new Random();

    /* renamed from: c */
    private final AtomicReference f76547c = new AtomicReference();

    private C28131t() {
    }

    /* renamed from: a */
    public final long mo33577a() {
        Random random = (Random) this.f76547c.get();
        if (random == null) {
            Random random2 = new Random(SystemClock.elapsedRealtimeNanos() + (SystemClock.currentThreadTimeMillis() << 24));
            this.f76547c.set(random2);
            random = random2;
        }
        return (this.f76546b.nextLong() ^ random.nextLong()) ^ System.nanoTime();
    }
}
