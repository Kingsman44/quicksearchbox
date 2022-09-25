package p3186j$.util.stream;

import p3186j$.util.function.IntFunction;
import p3186j$.util.function.IntPredicate;
import p3186j$.util.function.IntToDoubleFunction;

/* renamed from: j$.util.stream.N */
final class C41177N extends C41151G1 {

    /* renamed from: b */
    public final /* synthetic */ int f107767b;

    /* renamed from: c */
    final /* synthetic */ C41232c f107768c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41177N(C41232c cVar, C41171L1 l1, int i) {
        super(l1);
        this.f107767b = i;
        this.f107768c = cVar;
    }

    public final void accept(int i) {
        int i2 = this.f107767b;
        C41171L1 l1 = this.f107734a;
        C41232c cVar = this.f107768c;
        switch (i2) {
            case 0:
                l1.accept(((IntFunction) ((C41181O) cVar).f107775t).apply(i));
                return;
            case 1:
                l1.accept(((IntToDoubleFunction) ((C41308v) cVar).f108039t).applyAsDouble(i));
                return;
            default:
                if (((IntPredicate) ((C41185P) cVar).f107781t).test(i)) {
                    l1.accept(i);
                    return;
                }
                return;
        }
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        int i = this.f107767b;
        C41171L1 l1 = this.f107734a;
        switch (i) {
            case 2:
                l1.mo43663c(-1);
                return;
            default:
                l1.mo43663c(j);
                return;
        }
    }
}
