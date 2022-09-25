package androidx.media3.exoplayer;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2601a;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.media3.exoplayer.ct */
/* compiled from: PG */
public final class C2891ct {

    /* renamed from: a */
    public final C2890cs f8182a;

    /* renamed from: b */
    public final C2651bm f8183b;

    /* renamed from: c */
    public int f8184c;

    /* renamed from: d */
    public Object f8185d;

    /* renamed from: e */
    public Looper f8186e;

    /* renamed from: f */
    public final int f8187f;

    /* renamed from: g */
    public long f8188g = -9223372036854775807L;

    /* renamed from: h */
    public final boolean f8189h = true;

    /* renamed from: i */
    public boolean f8190i;

    /* renamed from: j */
    private final C2889cr f8191j;

    /* renamed from: k */
    private boolean f8192k;

    /* renamed from: l */
    private boolean f8193l;

    public C2891ct(C2889cr crVar, C2890cs csVar, C2651bm bmVar, int i, Looper looper) {
        this.f8191j = crVar;
        this.f8182a = csVar;
        this.f8183b = bmVar;
        this.f8186e = looper;
        this.f8187f = i;
    }

    /* renamed from: a */
    public final synchronized void mo6674a(boolean z) {
        this.f8192k = z | this.f8192k;
        this.f8193l = true;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void mo6675b(long j) {
        C2601a.m6832d(this.f8190i);
        C2601a.m6832d(this.f8186e.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.f8193l) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
    }

    /* renamed from: c */
    public final void mo6676c() {
        C2601a.m6832d(!this.f8190i);
        this.f8190i = true;
        this.f8191j.mo6618d(this);
    }

    /* renamed from: d */
    public final void mo6677d(Object obj) {
        C2601a.m6832d(!this.f8190i);
        this.f8185d = obj;
    }

    /* renamed from: e */
    public final void mo6678e(int i) {
        C2601a.m6832d(!this.f8190i);
        this.f8184c = i;
    }

    /* renamed from: f */
    public final synchronized void mo6679f() {
    }
}
