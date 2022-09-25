package androidx.media3.exoplayer.p151k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.media3.exoplayer.k.q */
/* compiled from: PG */
final class C3251q extends Handler implements Runnable {

    /* renamed from: a */
    public final int f9774a;

    /* renamed from: b */
    public IOException f9775b;

    /* renamed from: c */
    public int f9776c;

    /* renamed from: d */
    final /* synthetic */ C3256v f9777d;

    /* renamed from: e */
    private final C3252r f9778e;

    /* renamed from: f */
    private final long f9779f;

    /* renamed from: g */
    private C3249o f9780g;

    /* renamed from: h */
    private Thread f9781h;

    /* renamed from: i */
    private boolean f9782i;

    /* renamed from: j */
    private volatile boolean f9783j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3251q(C3256v vVar, Looper looper, C3252r rVar, C3249o oVar, int i, long j) {
        super(looper);
        this.f9777d = vVar;
        this.f9778e = rVar;
        this.f9780g = oVar;
        this.f9774a = i;
        this.f9779f = j;
    }

    /* renamed from: a */
    public final void mo7244a(boolean z) {
        this.f9783j = z;
        this.f9775b = null;
        if (hasMessages(0)) {
            this.f9782i = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f9782i = true;
                this.f9778e.mo6996b();
                Thread thread = this.f9781h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f9777d.f9789e = null;
            SystemClock.elapsedRealtime();
            C3249o oVar = this.f9780g;
            oVar.getClass();
            oVar.mo6825eX(this.f9778e, true);
            this.f9780g = null;
        }
    }

    /* renamed from: b */
    public final void mo7245b(long j) {
        C2601a.m6832d(this.f9777d.f9789e == null);
        this.f9777d.f9789e = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m9474c();
        }
    }

    public final void handleMessage(Message message) {
        if (!this.f9783j) {
            if (message.what == 0) {
                m9474c();
            } else if (message.what != 3) {
                this.f9777d.f9789e = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f9779f;
                C3249o oVar = this.f9780g;
                oVar.getClass();
                if (this.f9782i) {
                    oVar.mo6825eX(this.f9778e, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    try {
                        oVar.mo6826fb(this.f9778e, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        C2633u.m7048c("LoadTask", C2633u.m7046a("Unexpected exception handling load completed", e));
                        this.f9777d.f9790f = new C3255u(e);
                    }
                } else if (i == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f9775b = iOException;
                    int i2 = this.f9776c + 1;
                    this.f9776c = i2;
                    C3250p fe = oVar.mo6827fe(this.f9778e, iOException, i2);
                    int i3 = fe.f9772a;
                    if (i3 == 3) {
                        this.f9777d.f9790f = this.f9775b;
                    } else if (i3 != 2) {
                        if (i3 == 1) {
                            this.f9776c = 1;
                        }
                        long j2 = fe.f9773b;
                        if (j2 == -9223372036854775807L) {
                            j2 = (long) Math.min((this.f9776c - 1) * 1000, 5000);
                        }
                        mo7245b(j2);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.f9782i;
                this.f9781h = Thread.currentThread();
            }
            if (z) {
                String str = "load:" + this.f9778e.getClass().getSimpleName();
                int i = C2612ak.f7249a;
                Trace.beginSection(str);
                this.f9778e.mo6997c();
                Trace.endSection();
            }
            synchronized (this) {
                this.f9781h = null;
                Thread.interrupted();
            }
            if (!this.f9783j) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.f9783j) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.f9783j) {
                C2633u.m7048c("LoadTask", C2633u.m7046a("Unexpected exception loading stream", e2));
                obtainMessage(2, new C3255u(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.f9783j) {
                C2633u.m7048c("LoadTask", C2633u.m7046a("OutOfMemory error loading stream", e3));
                obtainMessage(2, new C3255u(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.f9783j) {
                C2633u.m7048c("LoadTask", C2633u.m7046a("Unexpected error loading stream", e4));
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: c */
    private final void m9474c() {
        this.f9775b = null;
        C3256v vVar = this.f9777d;
        ExecutorService executorService = vVar.f9788d;
        C3251q qVar = vVar.f9789e;
        qVar.getClass();
        executorService.execute(qVar);
    }
}
