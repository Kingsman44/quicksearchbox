package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.concurrent.C41076m;

/* renamed from: j$.util.stream.d0 */
final class C41237d0 extends C41236d {

    /* renamed from: j */
    private final C41233c0 f107869j;

    C41237d0(C41233c0 c0Var, C41241e0 e0Var, Spliterator spliterator) {
        super(e0Var, spliterator);
        this.f107869j = c0Var;
    }

    C41237d0(C41237d0 d0Var, Spliterator spliterator) {
        super((C41236d) d0Var, spliterator);
        this.f107869j = d0Var.f107869j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo43697a() {
        Boolean valueOf;
        C41233c0 c0Var = this.f107869j;
        C41225a0 a0Var = (C41225a0) c0Var.f107864b.get();
        this.f107893a.mo43816X(this.f107894b, a0Var);
        boolean z = a0Var.f107846b;
        if (z == c0Var.f107863a.f107850b && (valueOf = Boolean.valueOf(z)) != null) {
            C41076m.m71700a(this.f107867h, (Object) null, valueOf);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C41244f mo43698e(Spliterator spliterator) {
        return new C41237d0(this, spliterator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo43699j() {
        return Boolean.valueOf(!this.f107869j.f107863a.f107850b);
    }
}
