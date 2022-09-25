package com.google.common.util.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.dy */
/* compiled from: PG */
final class C60911dy extends C60837br {

    /* renamed from: a */
    public C60870cx f165025a;

    /* renamed from: b */
    public ScheduledFuture f165026b;

    public C60911dy(C60870cx cxVar) {
        cxVar.getClass();
        this.f165025a = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        mo57355m(this.f165025a);
        ScheduledFuture scheduledFuture = this.f165026b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f165025a = null;
        this.f165026b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        C60870cx cxVar = this.f165025a;
        ScheduledFuture scheduledFuture = this.f165026b;
        if (cxVar == null) {
            return null;
        }
        String str = "inputFuture=[" + cxVar + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }
}
