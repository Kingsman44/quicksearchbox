package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ans */
/* compiled from: PG */
public final class ans {

    /* renamed from: a */
    private final Handler f21060a;

    public ans(Handler handler) {
        this.f21060a = handler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15042a() {
        this.f21060a.removeMessages(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo15043b() {
        this.f21060a.sendEmptyMessage(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15044c() {
        Handler handler = this.f21060a;
        handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo15045d(long j) {
        this.f21060a.sendEmptyMessageDelayed(1, j);
    }
}
