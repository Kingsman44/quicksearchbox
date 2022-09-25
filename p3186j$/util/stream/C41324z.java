package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.Predicate;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.z */
final class C41324z implements C41199S2 {

    /* renamed from: a */
    final int f108046a;

    /* renamed from: b */
    final Object f108047b;

    /* renamed from: c */
    final Predicate f108048c;

    /* renamed from: d */
    final Supplier f108049d;

    C41324z(boolean z, C41263j2 j2Var, Object obj, Predicate predicate, C41228b bVar) {
        this.f108046a = (z ? 0 : C41259i2.f107934r) | C41259i2.f107937u;
        this.f108047b = obj;
        this.f108048c = predicate;
        this.f108049d = bVar;
    }

    /* renamed from: a */
    public final Object mo43758a(C41241e0 e0Var, Spliterator spliterator) {
        return new C41141E(this, C41259i2.ORDERED.mo43855g(e0Var.mo43815P()), e0Var, spliterator).invoke();
    }

    /* renamed from: b */
    public final int mo43759b() {
        return this.f108046a;
    }

    /* renamed from: f */
    public final Object mo43760f(C41241e0 e0Var, Spliterator spliterator) {
        C41203T2 t2 = (C41203T2) this.f108049d.get();
        e0Var.mo43816X(spliterator, t2);
        Object obj = t2.get();
        return obj != null ? obj : this.f108047b;
    }
}
