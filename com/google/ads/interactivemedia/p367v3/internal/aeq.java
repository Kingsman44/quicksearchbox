package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aeq */
/* compiled from: PG */
final class aeq implements adp {

    /* renamed from: a */
    private final Handler f20457a;

    public aeq(Handler handler) {
        this.f20457a = handler;
    }

    /* renamed from: a */
    public final Message mo14498a(int i) {
        return this.f20457a.obtainMessage(i);
    }

    /* renamed from: b */
    public final Message mo14499b(int i, Object obj) {
        return this.f20457a.obtainMessage(i, obj);
    }

    /* renamed from: c */
    public final Message mo14500c(int i, int i2, int i3, Object obj) {
        return this.f20457a.obtainMessage(16, i2, 0, obj);
    }

    /* renamed from: d */
    public final Message mo14501d(int i, int i2) {
        return this.f20457a.obtainMessage(1, i, i2);
    }

    /* renamed from: e */
    public final void mo14502e() {
        this.f20457a.removeMessages(2);
    }

    /* renamed from: f */
    public final void mo14503f(int i) {
        this.f20457a.sendEmptyMessage(i);
    }

    /* renamed from: g */
    public final void mo14504g(long j) {
        this.f20457a.sendEmptyMessageAtTime(2, j);
    }
}
