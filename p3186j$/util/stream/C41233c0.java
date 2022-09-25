package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.c0 */
final class C41233c0 implements C41199S2 {

    /* renamed from: a */
    final C41229b0 f107863a;

    /* renamed from: b */
    final Supplier f107864b;

    C41233c0(C41263j2 j2Var, C41229b0 b0Var, C41252h hVar) {
        this.f107863a = b0Var;
        this.f107864b = hVar;
    }

    /* renamed from: a */
    public final Object mo43758a(C41241e0 e0Var, Spliterator spliterator) {
        return (Boolean) new C41237d0(this, e0Var, spliterator).invoke();
    }

    /* renamed from: b */
    public final int mo43759b() {
        return C41259i2.f107937u | C41259i2.f107934r;
    }

    /* renamed from: f */
    public final Object mo43760f(C41241e0 e0Var, Spliterator spliterator) {
        C41225a0 a0Var = (C41225a0) this.f107864b.get();
        e0Var.mo43816X(spliterator, a0Var);
        return Boolean.valueOf(a0Var.f107846b);
    }
}
