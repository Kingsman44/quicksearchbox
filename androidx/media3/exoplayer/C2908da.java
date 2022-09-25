package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.common.C2640bb;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.da */
/* compiled from: PG */
public final class C2908da implements C2876ce {

    /* renamed from: a */
    public C2640bb f8263a = C2640bb.f7312a;

    /* renamed from: b */
    private boolean f8264b;

    /* renamed from: c */
    private long f8265c;

    /* renamed from: d */
    private long f8266d;

    /* renamed from: a */
    public final long mo6521a() {
        long j = this.f8265c;
        if (!this.f8264b) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8266d;
        C2640bb bbVar = this.f8263a;
        return j + (bbVar.f7313b == 1.0f ? C2612ak.m6998w(elapsedRealtime) : elapsedRealtime * ((long) bbVar.f7315d));
    }

    /* renamed from: b */
    public final C2640bb mo6523b() {
        return this.f8263a;
    }

    /* renamed from: c */
    public final void mo6524c(C2640bb bbVar) {
        if (this.f8264b) {
            mo6742d(mo6521a());
        }
        this.f8263a = bbVar;
    }

    /* renamed from: d */
    public final void mo6742d(long j) {
        this.f8265c = j;
        if (this.f8264b) {
            this.f8266d = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: e */
    public final void mo6743e() {
        if (!this.f8264b) {
            this.f8266d = SystemClock.elapsedRealtime();
            this.f8264b = true;
        }
    }

    /* renamed from: f */
    public final void mo6744f() {
        if (this.f8264b) {
            mo6742d(mo6521a());
            this.f8264b = false;
        }
    }
}
