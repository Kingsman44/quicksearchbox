package androidx.p109f.p110a;

import android.os.Looper;
import android.view.Choreographer;

/* renamed from: androidx.f.a.g */
/* compiled from: PG */
final class C2233g {

    /* renamed from: a */
    private final Choreographer f6293a = Choreographer.getInstance();

    /* renamed from: b */
    private final Looper f6294b = Looper.myLooper();

    /* renamed from: a */
    public final void mo5577a(Runnable runnable) {
        this.f6293a.postFrameCallback(new C2232f(runnable));
    }

    /* renamed from: b */
    public final boolean mo5578b() {
        return Thread.currentThread() == this.f6294b.getThread();
    }
}
