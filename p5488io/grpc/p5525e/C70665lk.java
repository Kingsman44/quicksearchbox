package p5488io.grpc.p5525e;

/* renamed from: io.grpc.e.lk */
/* compiled from: PG */
final class C70665lk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70666ll f188389a;

    /* renamed from: b */
    final /* synthetic */ C70667lm f188390b;

    /* renamed from: c */
    final /* synthetic */ Object f188391c;

    /* renamed from: d */
    final /* synthetic */ C70668ln f188392d;

    public C70665lk(C70668ln lnVar, C70666ll llVar, C70667lm lmVar, Object obj) {
        this.f188392d = lnVar;
        this.f188389a = llVar;
        this.f188390b = lmVar;
        this.f188391c = obj;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        synchronized (this.f188392d) {
            if (this.f188389a.f188394b == 0) {
                try {
                    this.f188390b.mo62177b(this.f188391c);
                    this.f188392d.f188397b.remove(this.f188390b);
                    if (this.f188392d.f188397b.isEmpty()) {
                        this.f188392d.f188398c.shutdown();
                        this.f188392d.f188398c = null;
                    }
                } catch (Throwable th) {
                    this.f188392d.f188397b.remove(this.f188390b);
                    if (this.f188392d.f188397b.isEmpty()) {
                        this.f188392d.f188398c.shutdown();
                        this.f188392d.f188398c = null;
                    }
                    throw th;
                }
            }
        }
    }
}
