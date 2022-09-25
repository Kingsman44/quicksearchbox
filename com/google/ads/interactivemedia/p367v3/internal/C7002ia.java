package com.google.ads.interactivemedia.p367v3.internal;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ia */
/* compiled from: PG */
final class C7002ia implements C6991hq {

    /* renamed from: a */
    final /* synthetic */ C7006ie f22351a;

    public /* synthetic */ C7002ia(C7006ie ieVar) {
        this.f22351a = ieVar;
    }

    /* renamed from: a */
    public final void mo15964a(long j) {
        if (this.f22351a.f22396o != null) {
            this.f22351a.f22396o.mo15927a(j);
        }
    }

    /* renamed from: b */
    public final void mo15965b(long j, long j2, long j3, long j4) {
        long C = this.f22351a.m20686R();
        long D = this.f22351a.m20687S();
        StringBuilder sb = new StringBuilder(182);
        sb.append("Spurious audio timestamp (frame position mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(C);
        sb.append(", ");
        sb.append(D);
        Log.w("AudioTrack", sb.toString());
    }

    /* renamed from: c */
    public final void mo15966c(long j, long j2, long j3, long j4) {
        long C = this.f22351a.m20686R();
        long D = this.f22351a.m20687S();
        StringBuilder sb = new StringBuilder(180);
        sb.append("Spurious audio timestamp (system clock mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(C);
        sb.append(", ");
        sb.append(D);
        Log.w("AudioTrack", sb.toString());
    }

    /* renamed from: d */
    public final void mo15967d(long j) {
        StringBuilder sb = new StringBuilder(61);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        Log.w("AudioTrack", sb.toString());
    }

    /* renamed from: e */
    public final void mo15968e(int i, long j) {
        if (this.f22351a.f22396o != null) {
            int i2 = i;
            long j2 = j;
            this.f22351a.f22396o.mo15928b(i2, j2, SystemClock.elapsedRealtime() - this.f22351a.f22378V);
        }
    }
}
