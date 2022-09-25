package android.support.p031v4.app;

/* renamed from: android.support.v4.app.y */
/* compiled from: PG */
final class C0262y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Fragment f925a;

    public C0262y(Fragment fragment) {
        this.f925a = fragment;
    }

    public final void run() {
        this.f925a.callStartTransitionListener(false);
    }
}
