package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acv */
/* compiled from: PG */
final class acv extends Handler implements Runnable {

    /* renamed from: a */
    public final int f20327a;

    /* renamed from: b */
    final /* synthetic */ ada f20328b;

    /* renamed from: c */
    private final acw f20329c;

    /* renamed from: d */
    private final long f20330d;

    /* renamed from: e */
    private act f20331e;

    /* renamed from: f */
    private IOException f20332f;

    /* renamed from: g */
    private int f20333g;

    /* renamed from: h */
    private Thread f20334h;

    /* renamed from: i */
    private boolean f20335i;

    /* renamed from: j */
    private volatile boolean f20336j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acv(ada ada, Looper looper, acw acw, act act, int i, long j) {
        super(looper);
        this.f20328b = ada;
        this.f20329c = acw;
        this.f20331e = act;
        this.f20327a = i;
        this.f20330d = j;
    }

    /* renamed from: d */
    private final void m18261d() {
        this.f20332f = null;
        ExecutorService l = this.f20328b.f20340c;
        acv k = this.f20328b.f20341d;
        ary.m19467t(k);
        l.execute(k);
    }

    /* renamed from: e */
    private final void m18262e() {
        this.f20328b.f20341d = null;
    }

    /* renamed from: a */
    public final void mo14459a(int i) {
        IOException iOException = this.f20332f;
        if (iOException != null && this.f20333g > i) {
            throw iOException;
        }
    }

    /* renamed from: b */
    public final void mo14460b(long j) {
        ary.m19464q(this.f20328b.f20341d == null);
        this.f20328b.f20341d = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m18261d();
        }
    }

    /* renamed from: c */
    public final void mo14461c(boolean z) {
        this.f20336j = z;
        this.f20332f = null;
        if (hasMessages(0)) {
            this.f20335i = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f20335i = true;
                this.f20329c.mo14464b();
                Thread thread = this.f20334h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            m18262e();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            act act = this.f20331e;
            ary.m19467t(act);
            act.mo14456w(this.f20329c, elapsedRealtime, elapsedRealtime - this.f20330d, true);
            this.f20331e = null;
        }
    }

    public final void handleMessage(Message message) {
        long j;
        if (!this.f20336j) {
            if (message.what == 0) {
                m18261d();
            } else if (message.what != 3) {
                m18262e();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.f20330d;
                act act = this.f20331e;
                ary.m19467t(act);
                if (this.f20335i) {
                    act.mo14456w(this.f20329c, elapsedRealtime, j2, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    try {
                        act.mo14457x(this.f20329c, elapsedRealtime, j2);
                    } catch (RuntimeException e) {
                        adu.m18341b("LoadTask", "Unexpected exception handling load completed", e);
                        this.f20328b.f20342e = new acz(e);
                    }
                } else if (i == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f20332f = iOException;
                    int i2 = this.f20333g + 1;
                    this.f20333g = i2;
                    acu v = act.mo14455v(this.f20329c, elapsedRealtime, j2, iOException, i2);
                    if (v.f20325a == 3) {
                        this.f20328b.f20342e = this.f20332f;
                    } else if (v.f20325a != 2) {
                        if (v.f20325a == 1) {
                            this.f20333g = 1;
                        }
                        if (v.f20326b != -9223372036854775807L) {
                            j = v.f20326b;
                        } else {
                            j = (long) Math.min((this.f20333g - 1) * 1000, 5000);
                        }
                        mo14460b(j);
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
                z = !this.f20335i;
                this.f20334h = Thread.currentThread();
            }
            if (z) {
                String valueOf = String.valueOf(this.f20329c.getClass().getSimpleName());
                atv.m19619k(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                this.f20329c.mo14465c();
                atv.m19620l();
            }
            synchronized (this) {
                this.f20334h = null;
                Thread.interrupted();
            }
            if (!this.f20336j) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.f20336j) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            adu.m18341b("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.f20336j) {
                obtainMessage(2, new acz(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            adu.m18341b("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.f20336j) {
                obtainMessage(2, new acz(e3)).sendToTarget();
            }
        } catch (Error e4) {
            adu.m18341b("LoadTask", "Unexpected error loading stream", e4);
            if (!this.f20336j) {
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            atv.m19620l();
            throw th;
        }
    }
}
