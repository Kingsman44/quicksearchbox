package p5488io.p5490b.p5497e.p5510g;

/* renamed from: io.b.e.g.af */
/* compiled from: PG */
final class C70045af implements Comparable {

    /* renamed from: a */
    final Runnable f186715a;

    /* renamed from: b */
    final long f186716b;

    /* renamed from: c */
    final int f186717c;

    /* renamed from: d */
    volatile boolean f186718d;

    public C70045af(Runnable runnable, Long l, int i) {
        this.f186715a = runnable;
        this.f186716b = l.longValue();
        this.f186717c = i;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C70045af afVar = (C70045af) obj;
        long j = this.f186716b;
        long j2 = afVar.f186716b;
        int i = j < j2 ? -1 : j > j2 ? 1 : 0;
        if (i != 0) {
            return i;
        }
        int i2 = this.f186717c;
        int i3 = afVar.f186717c;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        return 0;
    }
}
