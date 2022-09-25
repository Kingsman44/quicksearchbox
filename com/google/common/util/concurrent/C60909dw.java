package com.google.common.util.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.dw */
/* compiled from: PG */
final class C60909dw implements Runnable {

    /* renamed from: a */
    C60911dy f165024a;

    public C60909dw(C60911dy dyVar) {
        this.f165024a = dyVar;
    }

    public final void run() {
        C60870cx cxVar;
        String str;
        C60911dy dyVar = this.f165024a;
        if (dyVar != null && (cxVar = dyVar.f165025a) != null) {
            this.f165024a = null;
            if (!cxVar.isDone()) {
                try {
                    ScheduledFuture scheduledFuture = dyVar.f165026b;
                    dyVar.f165026b = null;
                    str = "Timed out";
                    if (scheduledFuture != null) {
                        long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                        }
                    }
                    dyVar.mo57357o(new C60910dx(str + ": " + cxVar));
                    cxVar.cancel(true);
                } catch (Throwable th) {
                    cxVar.cancel(true);
                    throw th;
                }
            } else {
                dyVar.mo57358p(cxVar);
            }
        }
    }
}
