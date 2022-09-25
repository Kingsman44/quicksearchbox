package p3186j$.util.stream;

import p3186j$.util.C41038F;
import p3186j$.util.C41333y;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.r2 */
final class C41295r2 extends C41267k2 implements C41038F {
    C41295r2(C41241e0 e0Var, Spliterator spliterator, boolean z) {
        super(e0Var, spliterator, z);
    }

    C41295r2(C41241e0 e0Var, C41224a aVar, boolean z) {
        super(e0Var, aVar, z);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72295c(this, consumer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo43777h() {
        C41220Y1 y1 = new C41220Y1();
        this.f107963h = y1;
        Objects.requireNonNull(y1);
        this.f107960e = this.f107957b.mo43817Y(new C41291q2(y1, 0));
        this.f107961f = new C41224a(7, this);
    }

    /* renamed from: i */
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        Objects.requireNonNull(doubleConsumer);
        boolean c = mo43857c();
        if (c) {
            C41220Y1 y1 = (C41220Y1) this.f107963h;
            long j = this.f107962g;
            int q = y1.mo43845q(j);
            if (y1.f107879b == 0 && q == 0) {
                d = ((double[]) y1.f107890d)[(int) j];
            } else {
                d = ((double[][]) y1.f107891e)[q][(int) (j - y1.f107880c[q])];
            }
            doubleConsumer.accept(d);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C41267k2 mo43778j(Spliterator spliterator) {
        return new C41295r2(this.f107957b, spliterator, this.f107956a);
    }

    /* renamed from: l */
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f107963h != null || this.f107964i) {
            do {
            } while (tryAdvance(doubleConsumer));
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        mo43858e();
        Objects.requireNonNull(doubleConsumer);
        C41291q2 q2Var = new C41291q2(doubleConsumer, 1);
        this.f107957b.mo43816X(this.f107959d, q2Var);
        this.f107964i = true;
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72298h(this, consumer);
    }

    public final Spliterator trySplit() {
        return (C41038F) super.trySplit();
    }
}
