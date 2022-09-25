package androidx.media3.exoplayer.p145h;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.p151k.C3232a;

/* renamed from: androidx.media3.exoplayer.h.bz */
/* compiled from: PG */
public final class C3088bz {

    /* renamed from: a */
    public long f9015a;

    /* renamed from: b */
    public long f9016b;

    /* renamed from: c */
    public C3232a f9017c;

    /* renamed from: d */
    public C3088bz f9018d;

    public C3088bz(long j) {
        mo7063c(j);
    }

    /* renamed from: a */
    public final int mo7061a(long j) {
        long j2 = this.f9015a;
        int i = this.f9017c.f9719b;
        return (int) (j - j2);
    }

    /* renamed from: b */
    public final C3088bz mo7062b() {
        this.f9017c = null;
        C3088bz bzVar = this.f9018d;
        this.f9018d = null;
        return bzVar;
    }

    /* renamed from: c */
    public final void mo7063c(long j) {
        C2601a.m6832d(this.f9017c == null);
        this.f9015a = j;
        this.f9016b = j + 65536;
    }
}
