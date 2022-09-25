package androidx.p124l.p126b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.l.b.g */
/* compiled from: PG */
abstract class C2317g {

    /* renamed from: a */
    private static Handler f6480a;

    /* renamed from: c */
    public final FutureTask f6481c = new C2315e(this, new C2314d(this));

    /* renamed from: d */
    final AtomicBoolean f6482d = new AtomicBoolean();

    /* renamed from: e */
    final AtomicBoolean f6483e = new AtomicBoolean();

    /* renamed from: f */
    public volatile int f6484f = 1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo5687a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5688b(Object obj) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo5689c() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5700d(Object obj) {
        Handler handler;
        synchronized (C2317g.class) {
            if (f6480a == null) {
                f6480a = new Handler(Looper.getMainLooper());
            }
            handler = f6480a;
        }
        handler.post(new C2316f(this, obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo5701e(Object obj) {
        if (!this.f6483e.get()) {
            mo5700d(obj);
        }
    }
}
