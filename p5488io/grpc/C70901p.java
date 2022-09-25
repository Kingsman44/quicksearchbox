package p5488io.grpc;

/* renamed from: io.grpc.p */
/* compiled from: PG */
public abstract class C70901p extends C70161ay {

    /* renamed from: b */
    public C70898m f189092b;

    protected C70901p(C70898m mVar) {
        this.f189092b = mVar;
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        try {
            mo62589e(lVar, deVar);
        } catch (Exception e) {
            this.f189092b = C70903r.f189095a;
            lVar.mo27484b(Status.m102100d(e), new C70334de());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C70898m mo61735c() {
        return this.f189092b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo62589e(C70897l lVar, C70334de deVar);
}
