package androidx.camera.camera2.p063b;

import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.b.ak */
/* compiled from: PG */
final class C1088ak implements Runnable {

    /* renamed from: a */
    public boolean f3233a = false;

    /* renamed from: b */
    final /* synthetic */ C1089al f3234b;

    /* renamed from: c */
    private final Executor f3235c;

    public C1088ak(C1089al alVar, Executor executor) {
        this.f3234b = alVar;
        this.f3235c = executor;
    }

    public final void run() {
        this.f3235c.execute(new C1087aj(this));
    }
}
