package android.support.p031v4.app;

/* renamed from: android.support.v4.app.cx */
/* compiled from: PG */
final class C0232cx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0233cy f866a;

    /* renamed from: b */
    final /* synthetic */ C0239dd f867b;

    public C0232cx(C0239dd ddVar, C0233cy cyVar) {
        this.f867b = ddVar;
        this.f866a = cyVar;
    }

    public final void run() {
        this.f867b.f880b.remove(this.f866a);
        this.f867b.f881c.remove(this.f866a);
    }
}
