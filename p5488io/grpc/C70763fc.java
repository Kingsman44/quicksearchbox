package p5488io.grpc;

/* renamed from: io.grpc.fc */
/* compiled from: PG */
final class C70763fc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70764fd f188574a;

    /* renamed from: b */
    final /* synthetic */ Runnable f188575b;

    /* renamed from: c */
    final /* synthetic */ C70766ff f188576c;

    public C70763fc(C70766ff ffVar, C70764fd fdVar, Runnable runnable) {
        this.f188576c = ffVar;
        this.f188574a = fdVar;
        this.f188575b = runnable;
    }

    public final void run() {
        C70766ff ffVar = this.f188576c;
        ffVar.mo62446c(this.f188574a);
        ffVar.mo62445b();
    }

    public final String toString() {
        return String.valueOf(this.f188575b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
