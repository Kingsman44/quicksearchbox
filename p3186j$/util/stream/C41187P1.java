package p3186j$.util.stream;

import p3186j$.util.C41039G;
import p3186j$.util.Spliterator;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.P1 */
final class C41187P1 extends C41200T {

    /* renamed from: s */
    final /* synthetic */ long f107782s = 0;

    /* renamed from: t */
    final /* synthetic */ long f107783t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41187P1(C41232c cVar, int i, long j) {
        super(cVar, i);
        this.f107783t = j;
    }

    /* renamed from: s0 */
    static C41039G m71902s0(C41039G g, long j, long j2, long j3) {
        long j4;
        long j5;
        if (j <= j3) {
            long j6 = j3 - j;
            j4 = j2 >= 0 ? Math.min(j2, j6) : j6;
            j5 = 0;
        } else {
            j5 = j;
            j4 = j2;
        }
        return new C41152G2(g, j5, j4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final C41277n0 mo43779i0(Spliterator spliterator, IntFunction intFunction, C41232c cVar) {
        Spliterator spliterator2 = spliterator;
        C41232c cVar2 = cVar;
        long K = cVar2.mo43814K(spliterator);
        if (K > 0 && spliterator.hasCharacteristics(16384)) {
            return C41241e0.m72073E(cVar2, C41241e0.m72070B(cVar.mo43821f0(), spliterator, this.f107782s, this.f107783t), true);
        } else if (!C41259i2.ORDERED.mo43855g(cVar.mo43815P())) {
            return C41241e0.m72073E(this, m71902s0((C41039G) cVar2.mo43825p0(spliterator), this.f107782s, this.f107783t, K), true);
        } else {
            return (C41277n0) new C41194R1(this, cVar, spliterator, intFunction, this.f107782s, this.f107783t).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final Spliterator mo43780j0(C41232c cVar, Spliterator spliterator) {
        long K = cVar.mo43814K(spliterator);
        if (K > 0 && spliterator.hasCharacteristics(16384)) {
            long j = this.f107782s;
            return new C41128A2((C41039G) cVar.mo43825p0(spliterator), j, C41241e0.m72069A(j, this.f107783t));
        } else if (!C41259i2.ORDERED.mo43855g(cVar.mo43815P())) {
            return m71902s0((C41039G) cVar.mo43825p0(spliterator), this.f107782s, this.f107783t, K);
        } else {
            return ((C41277n0) new C41194R1(this, cVar, spliterator, new C41281o0(9), this.f107782s, this.f107783t).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final /* bridge */ /* synthetic */ boolean mo43657k0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final C41171L1 mo43658l0(int i, C41171L1 l1) {
        return new C41183O1(this, l1);
    }
}
