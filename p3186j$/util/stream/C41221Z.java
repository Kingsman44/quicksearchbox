package p3186j$.util.stream;

import p3186j$.util.function.IntConsumer;
import p3186j$.util.function.IntPredicate;

/* renamed from: j$.util.stream.Z */
final class C41221Z extends C41225a0 implements C41163J1 {

    /* renamed from: c */
    final /* synthetic */ C41229b0 f107833c;

    /* renamed from: d */
    final /* synthetic */ IntPredicate f107834d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41221Z(IntPredicate intPredicate, C41229b0 b0Var) {
        super(b0Var);
        this.f107833c = b0Var;
        this.f107834d = intPredicate;
    }

    public final void accept(int i) {
        if (!this.f107845a) {
            boolean test = this.f107834d.test(i);
            C41229b0 b0Var = this.f107833c;
            if (test == b0Var.f107849a) {
                this.f107845a = true;
                this.f107846b = b0Var.f107850b;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43736d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        C41241e0.m72089g(this, num);
    }
}
