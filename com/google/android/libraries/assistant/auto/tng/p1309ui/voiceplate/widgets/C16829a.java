package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets;

import android.animation.TimeAnimator;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.widgets.a */
/* compiled from: PG */
public final class C16829a implements TimeAnimator.TimeListener {

    /* renamed from: a */
    public int f49286a = -1;

    /* renamed from: b */
    public int f49287b = 0;

    /* renamed from: c */
    private final TimeAnimator.TimeListener f49288c;

    public C16829a(TimeAnimator.TimeListener timeListener) {
        this.f49288c = timeListener;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        int i = this.f49286a;
        if (i == 0) {
            int i2 = C16830b.f49289b;
            return;
        }
        this.f49287b = (int) (((long) this.f49287b) + j2);
        double d = (double) i;
        Double.isNaN(d);
        int round = (int) Math.round(1000.0d / d);
        if (this.f49286a <= 0 || this.f49287b >= round) {
            TimeAnimator.TimeListener timeListener = this.f49288c;
            if (timeListener != null) {
                timeListener.onTimeUpdate(timeAnimator, j, (long) this.f49287b);
            }
            this.f49287b = 0;
        }
    }
}
