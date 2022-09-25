package android.support.p033v7.app;

/* renamed from: android.support.v7.app.aw */
/* compiled from: PG */
public final /* synthetic */ class C0362aw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0363ax f1234a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f1235b;

    public /* synthetic */ C0362aw(C0363ax axVar, Runnable runnable) {
        this.f1234a = axVar;
        this.f1235b = runnable;
    }

    public final void run() {
        C0363ax axVar = this.f1234a;
        try {
            this.f1235b.run();
        } finally {
            axVar.mo1217a();
        }
    }
}
