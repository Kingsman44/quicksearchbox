package androidx.media3.exoplayer.p151k;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.media3.exoplayer.k.v */
/* compiled from: PG */
public final class C3256v implements C3257w {

    /* renamed from: a */
    public static final C3250p f9785a = new C3250p(0, -9223372036854775807L);

    /* renamed from: b */
    public static final C3250p f9786b = new C3250p(2, -9223372036854775807L);

    /* renamed from: c */
    public static final C3250p f9787c = new C3250p(3, -9223372036854775807L);

    /* renamed from: d */
    public final ExecutorService f9788d;

    /* renamed from: e */
    public C3251q f9789e;

    /* renamed from: f */
    public IOException f9790f;

    public C3256v(String str) {
        this.f9788d = C2612ak.m6940W("ExoPlayer:Loader:".concat(str));
    }

    /* renamed from: a */
    public final void mo6828a() {
        throw null;
    }

    /* renamed from: b */
    public final void mo7249b() {
        C3251q qVar = this.f9789e;
        C2601a.m6829a(qVar);
        qVar.mo7244a(false);
    }

    /* renamed from: c */
    public final void mo7250c(int i) {
        IOException iOException = this.f9790f;
        if (iOException == null) {
            C3251q qVar = this.f9789e;
            if (qVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = qVar.f9774a;
                }
                IOException iOException2 = qVar.f9775b;
                if (iOException2 != null && qVar.f9776c > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: d */
    public final void mo7251d(C3253s sVar) {
        C3251q qVar = this.f9789e;
        if (qVar != null) {
            qVar.mo7244a(true);
        }
        if (sVar != null) {
            this.f9788d.execute(new C3254t(sVar));
        }
        this.f9788d.shutdown();
    }

    /* renamed from: e */
    public final boolean mo7252e() {
        return this.f9790f != null;
    }

    /* renamed from: f */
    public final boolean mo7253f() {
        return this.f9789e != null;
    }

    /* renamed from: g */
    public final void mo7254g(C3252r rVar, C3249o oVar, int i) {
        Looper myLooper = Looper.myLooper();
        C2601a.m6829a(myLooper);
        this.f9790f = null;
        new C3251q(this, myLooper, rVar, oVar, i, SystemClock.elapsedRealtime()).mo7245b(0);
    }
}
