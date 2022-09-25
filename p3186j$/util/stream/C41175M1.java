package p3186j$.util.stream;

/* renamed from: j$.util.stream.M1 */
final class C41175M1 extends C41155H1 {

    /* renamed from: b */
    long f107764b;

    /* renamed from: c */
    long f107765c;

    /* renamed from: d */
    final /* synthetic */ C41179N1 f107766d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41175M1(C41179N1 n1, C41171L1 l1) {
        super(l1);
        this.f107766d = n1;
        this.f107764b = n1.f107769s;
        long j = n1.f107770t;
        this.f107765c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(Object obj) {
        long j = this.f107764b;
        if (j == 0) {
            long j2 = this.f107765c;
            if (j2 > 0) {
                this.f107765c = j2 - 1;
                this.f107737a.accept(obj);
                return;
            }
            return;
        }
        this.f107764b = j - 1;
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        long j2 = this.f107766d.f107769s;
        long j3 = this.f107765c;
        long j4 = -1;
        if (j >= 0) {
            j4 = Math.max(-1, Math.min(j - j2, j3));
        }
        this.f107737a.mo43663c(j4);
    }

    /* renamed from: e */
    public final boolean mo43664e() {
        return this.f107765c == 0 || this.f107737a.mo43664e();
    }
}
