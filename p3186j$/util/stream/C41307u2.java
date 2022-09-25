package p3186j$.util.stream;

import p3186j$.util.C41039G;
import p3186j$.util.C41333y;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.u2 */
final class C41307u2 extends C41267k2 implements C41039G {
    C41307u2(C41241e0 e0Var, Spliterator spliterator, boolean z) {
        super(e0Var, spliterator, z);
    }

    C41307u2(C41241e0 e0Var, C41224a aVar, boolean z) {
        super(e0Var, aVar, z);
    }

    /* renamed from: f */
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        Objects.requireNonNull(intConsumer);
        boolean c = mo43857c();
        if (c) {
            C41227a2 a2Var = (C41227a2) this.f107963h;
            long j = this.f107962g;
            int q = a2Var.mo43845q(j);
            if (a2Var.f107879b == 0 && q == 0) {
                i = ((int[]) a2Var.f107890d)[(int) j];
            } else {
                i = ((int[][]) a2Var.f107891e)[q][(int) (j - a2Var.f107880c[q])];
            }
            intConsumer.accept(i);
        }
        return c;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72296d(this, consumer);
    }

    /* renamed from: g */
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f107963h != null || this.f107964i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        Objects.requireNonNull(intConsumer);
        mo43858e();
        Objects.requireNonNull(intConsumer);
        C41303t2 t2Var = new C41303t2(intConsumer, 1);
        this.f107957b.mo43816X(this.f107959d, t2Var);
        this.f107964i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo43777h() {
        C41227a2 a2Var = new C41227a2();
        this.f107963h = a2Var;
        Objects.requireNonNull(a2Var);
        this.f107960e = this.f107957b.mo43817Y(new C41303t2(a2Var, 0));
        this.f107961f = new C41224a(8, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C41267k2 mo43778j(Spliterator spliterator) {
        return new C41307u2(this.f107957b, spliterator, this.f107956a);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72299j(this, consumer);
    }

    public final Spliterator trySplit() {
        return (C41039G) super.trySplit();
    }
}
