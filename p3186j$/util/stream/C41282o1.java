package p3186j$.util.stream;

import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.o1 */
final class C41282o1 extends C41241e0 {
    C41282o1(C41263j2 j2Var) {
        super(j2Var);
    }

    /* renamed from: W */
    public final C41310v1 mo43844W() {
        return new C41318x1();
    }

    /* renamed from: a */
    public final Object mo43758a(C41241e0 e0Var, Spliterator spliterator) {
        return C41259i2.SIZED.mo43855g(e0Var.mo43815P()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.mo43758a(e0Var, spliterator);
    }

    /* renamed from: b */
    public final int mo43759b() {
        return C41259i2.f107934r;
    }

    /* renamed from: f */
    public final Object mo43760f(C41241e0 e0Var, Spliterator spliterator) {
        return C41259i2.SIZED.mo43855g(e0Var.mo43815P()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.mo43760f(e0Var, spliterator);
    }
}
