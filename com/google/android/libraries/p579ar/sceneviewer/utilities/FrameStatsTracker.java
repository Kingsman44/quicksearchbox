package com.google.android.libraries.p579ar.sceneviewer.utilities;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.FrameStatsTracker */
/* compiled from: PG */
public final class FrameStatsTracker {
    private C10762a clock = new C10763b();
    private long frameCount;
    private long startTimeMilliseconds;

    public void frame() {
        this.frameCount++;
    }

    public float getFrameRate() {
        long a = this.clock.mo19238a() - this.startTimeMilliseconds;
        if (a == 0) {
            return 0.0f;
        }
        return ((float) (this.frameCount * TimeUnit.SECONDS.toMillis(1))) / ((float) a);
    }

    public long getTimeDurationInMilliseconds() {
        return this.clock.mo19238a() - this.startTimeMilliseconds;
    }

    public void reset() {
        this.frameCount = 0;
        this.startTimeMilliseconds = this.clock.mo19238a();
    }

    public void setClock(C10762a aVar) {
        this.clock = aVar;
        reset();
    }
}
