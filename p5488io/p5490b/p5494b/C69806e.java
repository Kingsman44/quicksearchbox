package p5488io.p5490b.p5494b;

/* renamed from: io.b.b.e */
/* compiled from: PG */
final class C69806e extends C69805d {
    private static final long serialVersionUID = -8219729196779211169L;

    public C69806e(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo61465a(Object obj) {
        ((Runnable) obj).run();
    }

    public final String toString() {
        boolean e = mo25859e();
        String valueOf = String.valueOf(get());
        return "RunnableDisposable(disposed=" + e + ", " + valueOf + ")";
    }
}
