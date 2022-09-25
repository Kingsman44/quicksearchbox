package p3186j$.util.stream;

/* renamed from: j$.util.stream.O1 */
final class C41183O1 extends C41151G1 {

    /* renamed from: b */
    long f107776b;

    /* renamed from: c */
    long f107777c;

    /* renamed from: d */
    final /* synthetic */ C41187P1 f107778d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41183O1(C41187P1 p1, C41171L1 l1) {
        super(l1);
        this.f107778d = p1;
        this.f107776b = p1.f107782s;
        long j = p1.f107783t;
        this.f107777c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(int i) {
        long j = this.f107776b;
        if (j == 0) {
            long j2 = this.f107777c;
            if (j2 > 0) {
                this.f107777c = j2 - 1;
                this.f107734a.accept(i);
                return;
            }
            return;
        }
        this.f107776b = j - 1;
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        long j2 = this.f107778d.f107782s;
        long j3 = this.f107777c;
        long j4 = -1;
        if (j >= 0) {
            j4 = Math.max(-1, Math.min(j - j2, j3));
        }
        this.f107734a.mo43663c(j4);
    }

    /* renamed from: e */
    public final boolean mo43664e() {
        return this.f107777c == 0 || this.f107734a.mo43664e();
    }
}
