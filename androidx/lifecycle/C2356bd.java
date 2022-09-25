package androidx.lifecycle;

/* renamed from: androidx.lifecycle.bd */
/* compiled from: PG */
final class C2356bd implements Runnable {

    /* renamed from: a */
    final C2382m f6567a;

    /* renamed from: b */
    private final C2393x f6568b;

    /* renamed from: c */
    private boolean f6569c = false;

    public C2356bd(C2393x xVar, C2382m mVar) {
        this.f6568b = xVar;
        this.f6567a = mVar;
    }

    public final void run() {
        if (!this.f6569c) {
            this.f6568b.mo5793e(this.f6567a);
            this.f6569c = true;
        }
    }
}
