package p3186j$.util.stream;

import com.google.common.p4535g.C59203do;
import p3186j$.util.OptionalDouble;
import p3186j$.util.function.C41094f;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.g1 */
final class C41250g1 implements C41310v1, C41159I1 {

    /* renamed from: a */
    private boolean f107905a;

    /* renamed from: b */
    private double f107906b;

    /* renamed from: c */
    final /* synthetic */ C41094f f107907c;

    C41250g1(C41094f fVar) {
        this.f107907c = fVar;
    }

    public final void accept(double d) {
        if (!this.f107905a) {
            double d2 = this.f107906b;
            switch (((C41281o0) this.f107907c).f107989a) {
                case 27:
                    d = Math.min(d2, d);
                    break;
                default:
                    d = Math.max(d2, d);
                    break;
            }
        } else {
            this.f107905a = false;
        }
        this.f107906b = d;
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43666k((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f107905a = true;
        this.f107906b = C59203do.f157270a;
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    public final Object get() {
        return this.f107905a ? OptionalDouble.empty() : OptionalDouble.m71639of(this.f107906b);
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        C41250g1 g1Var = (C41250g1) v1Var;
        if (!g1Var.f107905a) {
            accept(g1Var.f107906b);
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void mo43666k(Double d) {
        C41241e0.m72087d(this, d);
    }
}
