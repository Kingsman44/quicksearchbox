package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aez */
/* compiled from: PG */
final class aez extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    private ado f20491a;

    /* renamed from: b */
    private Handler f20492b;

    /* renamed from: c */
    private Error f20493c;

    /* renamed from: d */
    private RuntimeException f20494d;

    /* renamed from: e */
    private afa f20495e;

    public aez() {
        super("ExoPlayer:DummySurface");
    }

    /* renamed from: a */
    public final afa mo14613a(int i) {
        boolean z;
        start();
        this.f20492b = new Handler(getLooper(), this);
        this.f20491a = new ado(this.f20492b);
        synchronized (this) {
            z = false;
            this.f20492b.obtainMessage(1, i, 0).sendToTarget();
            while (this.f20495e == null && this.f20494d == null && this.f20493c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f20494d;
        if (runtimeException == null) {
            Error error = this.f20493c;
            if (error == null) {
                afa afa = this.f20495e;
                ary.m19467t(afa);
                return afa;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo14614b() {
        ary.m19467t(this.f20492b);
        this.f20492b.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                ary.m19467t(this.f20491a);
                this.f20491a.mo14493a(i2);
                this.f20495e = new afa(this, this.f20491a.mo14495c());
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                adu.m18341b("DummySurface", "Failed to initialize dummy surface", e);
                this.f20494d = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    adu.m18341b("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f20493c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i != 2) {
            return true;
        } else {
            try {
                ary.m19467t(this.f20491a);
                this.f20491a.mo14494b();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }
}
