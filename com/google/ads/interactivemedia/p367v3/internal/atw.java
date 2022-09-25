package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atw */
/* compiled from: PG */
final class atw extends atk implements RunnableFuture {

    /* renamed from: a */
    private volatile atq f21554a;

    public atw(Callable callable) {
        super((byte[]) null);
        this.f21554a = new atq(this, callable);
    }

    /* renamed from: p */
    static atw m19632p(Callable callable) {
        return new atw(callable);
    }

    /* renamed from: q */
    static atw m19633q(Runnable runnable, Object obj) {
        return new atw(Executors.callable(runnable, obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15392c() {
        atq atq;
        if (mo15390a() && (atq = this.f21554a) != null) {
            atq.mo15427a();
        }
        this.f21554a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo15395e() {
        atq atq = this.f21554a;
        if (atq == null) {
            return super.mo15395e();
        }
        String obj = atq.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        atq atq = this.f21554a;
        if (atq != null) {
            atq.run();
        }
        this.f21554a = null;
    }
}
