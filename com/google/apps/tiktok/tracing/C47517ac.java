package com.google.apps.tiktok.tracing;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.apps.tiktok.tracing.ac */
/* compiled from: PG */
final class C47517ac {

    /* renamed from: a */
    public static final C47517ac f123357a;

    /* renamed from: b */
    private final UUID f123358b;

    /* renamed from: c */
    private final AtomicLong f123359c;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f123357a = new C47517ac(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public C47517ac(UUID uuid, long j) {
        this.f123358b = uuid;
        this.f123359c = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo51385a() {
        long j;
        long j2;
        long j3;
        do {
            j = this.f123359c.get();
            long j4 = ((j * 25214903917L) + 11) & 281474976710655L;
            j2 = ((25214903917L * j4) + 11) & 281474976710655L;
            j3 = (((long) ((int) (j4 >>> 16))) << 32) + ((long) ((int) (j2 >>> 16)));
        } while (!this.f123359c.compareAndSet(j, j2));
        return j3;
    }

    /* renamed from: b */
    public final UUID mo51386b() {
        long a = mo51385a();
        return new UUID((a & -61441) ^ this.f123358b.getMostSignificantBits(), (mo51385a() >>> 2) ^ this.f123358b.getLeastSignificantBits());
    }
}
