package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ato */
/* compiled from: PG */
final class ato implements Runnable {

    /* renamed from: a */
    final Future f21545a;

    /* renamed from: b */
    final atn f21546b;

    public ato(Future future, atn atn) {
        this.f21545a = future;
        this.f21546b = atn;
    }

    public final void run() {
        boolean z;
        Object obj;
        Throwable a;
        Future future = this.f21545a;
        if (!(future instanceof atx) || (a = aty.m19637a((atx) future)) == null) {
            try {
                Future future2 = this.f21545a;
                z = false;
                if (future2.isDone()) {
                    while (true) {
                        obj = future2.get();
                        break;
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    this.f21546b.mo15033b(obj);
                    return;
                }
                throw new IllegalStateException(aqd.m19275c("Future was expected to be done: %s", future2));
            } catch (InterruptedException unused) {
                z = true;
            } catch (ExecutionException e) {
                this.f21546b.mo15032a(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f21546b.mo15032a(e2);
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        } else {
            this.f21546b.mo15032a(a);
        }
    }

    public final String toString() {
        apy a = apz.m19252a(this);
        a.mo15160a(this.f21546b);
        return a.toString();
    }
}
