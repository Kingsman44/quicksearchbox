package p3186j$.util.stream;

import p3186j$.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.u */
final class C41304u extends C41147F1 {

    /* renamed from: b */
    final /* synthetic */ C41308v f108031b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41304u(C41308v vVar, C41171L1 l1) {
        super(l1);
        this.f108031b = vVar;
    }

    public final void accept(double d) {
        this.f107727a.accept(((DoubleUnaryOperator) this.f108031b.f108039t).applyAsDouble(d));
    }
}
