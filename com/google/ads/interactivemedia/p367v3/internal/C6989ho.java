package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ho */
/* compiled from: PG */
final class C6989ho {

    /* renamed from: a */
    private final AudioTrack f22268a;

    /* renamed from: b */
    private final AudioTimestamp f22269b = new AudioTimestamp();

    /* renamed from: c */
    private long f22270c;

    /* renamed from: d */
    private long f22271d;

    /* renamed from: e */
    private long f22272e;

    public C6989ho(AudioTrack audioTrack) {
        this.f22268a = audioTrack;
    }

    /* renamed from: a */
    public final boolean mo15954a() {
        boolean timestamp = this.f22268a.getTimestamp(this.f22269b);
        if (timestamp) {
            long j = this.f22269b.framePosition;
            if (this.f22271d > j) {
                this.f22270c++;
            }
            this.f22271d = j;
            this.f22272e = j + (this.f22270c << 32);
        }
        return timestamp;
    }

    /* renamed from: b */
    public final long mo15955b() {
        return this.f22269b.nanoTime / 1000;
    }

    /* renamed from: c */
    public final long mo15956c() {
        return this.f22272e;
    }
}
