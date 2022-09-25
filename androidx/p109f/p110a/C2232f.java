package androidx.p109f.p110a;

import android.view.Choreographer;

/* renamed from: androidx.f.a.f */
/* compiled from: PG */
public final /* synthetic */ class C2232f implements Choreographer.FrameCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f6292a;

    public /* synthetic */ C2232f(Runnable runnable) {
        this.f6292a = runnable;
    }

    public final void doFrame(long j) {
        this.f6292a.run();
    }
}
