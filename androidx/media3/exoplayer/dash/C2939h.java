package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.p152l.C3264c;

/* renamed from: androidx.media3.exoplayer.dash.h */
/* compiled from: PG */
public final class C2939h {

    /* renamed from: a */
    public final /* synthetic */ DashMediaSource f8437a;

    public C2939h(DashMediaSource dashMediaSource) {
        this.f8437a = dashMediaSource;
    }

    /* renamed from: a */
    public final void mo6824a() {
        long j;
        DashMediaSource dashMediaSource = this.f8437a;
        synchronized (C3264c.f9800b) {
            j = C3264c.f9801c ? C3264c.f9802d : -9223372036854775807L;
        }
        dashMediaSource.mo6749e(j);
    }
}
