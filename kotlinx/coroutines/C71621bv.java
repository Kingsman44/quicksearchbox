package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.bv */
/* compiled from: PG */
final class C71621bv extends C71622bw {

    /* renamed from: a */
    private final Runnable f191059a;

    public C71621bv(long j, Runnable runnable) {
        super(j);
        this.f191059a = runnable;
    }

    public final void run() {
        this.f191059a.run();
    }

    public final String toString() {
        String bwVar = super.toString();
        Runnable runnable = this.f191059a;
        StringBuilder sb = new StringBuilder();
        sb.append(bwVar);
        sb.append(runnable);
        return String.valueOf(bwVar).concat(runnable.toString());
    }
}
