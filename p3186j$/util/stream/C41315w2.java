package p3186j$.util.stream;

import p3186j$.util.C41040H;
import p3186j$.util.C41333y;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.w2 */
final class C41315w2 extends C41267k2 implements C41040H {
    C41315w2(C41241e0 e0Var, Spliterator spliterator, boolean z) {
        super(e0Var, spliterator, z);
    }

    C41315w2(C41241e0 e0Var, C41224a aVar, boolean z) {
        super(e0Var, aVar, z);
    }

    /* renamed from: a */
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f107963h != null || this.f107964i) {
            do {
            } while (tryAdvance(longConsumer));
            return;
        }
        Objects.requireNonNull(longConsumer);
        mo43858e();
        Objects.requireNonNull(longConsumer);
        C41311v2 v2Var = new C41311v2(longConsumer, 1);
        this.f107957b.mo43816X(this.f107959d, v2Var);
        this.f107964i = true;
    }

    /* renamed from: b */
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean c = mo43857c();
        if (c) {
            C41235c2 c2Var = (C41235c2) this.f107963h;
            long j2 = this.f107962g;
            int q = c2Var.mo43845q(j2);
            if (c2Var.f107879b == 0 && q == 0) {
                j = ((long[]) c2Var.f107890d)[(int) j2];
            } else {
                j = ((long[][]) c2Var.f107891e)[q][(int) (j2 - c2Var.f107880c[q])];
            }
            longConsumer.accept(j);
        }
        return c;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72297e(this, consumer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo43777h() {
        C41235c2 c2Var = new C41235c2();
        this.f107963h = c2Var;
        Objects.requireNonNull(c2Var);
        this.f107960e = this.f107957b.mo43817Y(new C41311v2(c2Var, 0));
        this.f107961f = new C41224a(9, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C41267k2 mo43778j(Spliterator spliterator) {
        return new C41315w2(this.f107957b, spliterator, this.f107956a);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72300k(this, consumer);
    }

    public final Spliterator trySplit() {
        return (C41040H) super.trySplit();
    }
}
