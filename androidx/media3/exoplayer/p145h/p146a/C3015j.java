package androidx.media3.exoplayer.p145h.p146a;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C2659c;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.p132b.C2510n;

/* renamed from: androidx.media3.exoplayer.h.a.j */
/* compiled from: PG */
public final class C3015j {

    /* renamed from: a */
    public final Handler f8731a = C2612ak.m6922E((Handler.Callback) null);

    /* renamed from: b */
    public volatile boolean f8732b;

    /* renamed from: c */
    final /* synthetic */ C3016k f8733c;

    public C3015j(C3016k kVar) {
        this.f8733c = kVar;
    }

    /* renamed from: a */
    public final void mo6960a(C3009d dVar, C2510n nVar) {
        if (!this.f8732b) {
            C3065bc q = this.f8733c.mo6944q((C3036as) null);
            C3027aj.f8771a.getAndIncrement();
            SystemClock.elapsedRealtime();
            q.mo7009h(new C3027aj(nVar), 6, dVar, true);
        }
    }

    /* renamed from: b */
    public final void mo6961b(C2659c cVar) {
        if (!this.f8732b) {
            this.f8731a.post(new C3014i(this, cVar));
        }
    }
}
