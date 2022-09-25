package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.N1 */
final class C41179N1 extends C41135C1 {

    /* renamed from: s */
    final /* synthetic */ long f107769s;

    /* renamed from: t */
    final /* synthetic */ long f107770t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41179N1(C41232c cVar, int i, long j, long j2) {
        super(cVar, i);
        this.f107769s = j;
        this.f107770t = j2;
    }

    /* renamed from: q0 */
    static Spliterator m71888q0(Spliterator spliterator, long j, long j2, long j3) {
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
        return new C41160I2(spliterator, j5, j4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final C41277n0 mo43779i0(Spliterator spliterator, IntFunction intFunction, C41232c cVar) {
        Spliterator spliterator2 = spliterator;
        IntFunction intFunction2 = intFunction;
        C41232c cVar2 = cVar;
        long K = cVar2.mo43814K(spliterator2);
        if (K > 0 && spliterator2.hasCharacteristics(16384)) {
            return C41241e0.m72072D(cVar2, C41241e0.m72070B(cVar.mo43821f0(), spliterator, this.f107769s, this.f107770t), true, intFunction2);
        } else if (!C41259i2.ORDERED.mo43855g(cVar.mo43815P())) {
            return C41241e0.m72072D(this, m71888q0(cVar2.mo43825p0(spliterator2), this.f107769s, this.f107770t, K), true, intFunction2);
        } else {
            return (C41277n0) new C41194R1(this, cVar, spliterator, intFunction, this.f107769s, this.f107770t).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final Spliterator mo43780j0(C41232c cVar, Spliterator spliterator) {
        long K = cVar.mo43814K(spliterator);
        if (K > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator p0 = cVar.mo43825p0(spliterator);
            long j = this.f107769s;
            return new C41144E2(p0, j, C41241e0.m72069A(j, this.f107770t));
        } else if (!C41259i2.ORDERED.mo43855g(cVar.mo43815P())) {
            return m71888q0(cVar.mo43825p0(spliterator), this.f107769s, this.f107770t, K);
        } else {
            return ((C41277n0) new C41194R1(this, cVar, spliterator, new C41281o0(0), this.f107769s, this.f107770t).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final C41171L1 mo43658l0(int i, C41171L1 l1) {
        return new C41175M1(this, l1);
    }
}
