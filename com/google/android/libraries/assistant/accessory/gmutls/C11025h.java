package com.google.android.libraries.assistant.accessory.gmutls;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.google.android.libraries.assistant.accessory.gmutls.h */
/* compiled from: PG */
public abstract class C11025h {

    /* renamed from: a */
    private final long f36221a;

    /* renamed from: b */
    public final long f36222b;

    /* renamed from: c */
    public long f36223c;

    /* renamed from: d */
    public boolean f36224d = false;

    /* renamed from: e */
    public final Handler f36225e;

    public C11025h(Looper looper, long j, long j2) {
        this.f36221a = j;
        this.f36222b = j2;
        this.f36225e = new Handler(looper == null ? Looper.getMainLooper() : looper, new C11024g(this));
    }

    /* renamed from: a */
    public abstract void mo19470a();

    /* renamed from: b */
    public abstract void mo19471b();

    /* renamed from: c */
    public final synchronized void mo19487c() {
        this.f36224d = true;
        this.f36225e.removeMessages(1);
    }

    /* renamed from: d */
    public final synchronized boolean mo19488d() {
        return this.f36224d;
    }

    /* renamed from: e */
    public final synchronized void mo19489e() {
        this.f36224d = false;
        if (this.f36221a <= 0) {
            mo19470a();
            return;
        }
        this.f36223c = SystemClock.elapsedRealtime() + this.f36221a;
        Handler handler = this.f36225e;
        handler.sendMessage(handler.obtainMessage(1));
    }
}
