package p3186j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p3186j$.util.Spliterator;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.LongFunction;

/* renamed from: j$.util.stream.u0 */
class C41305u0 extends C41244f {

    /* renamed from: h */
    protected final C41241e0 f108032h;

    /* renamed from: i */
    protected final LongFunction f108033i;

    /* renamed from: j */
    protected final BinaryOperator f108034j;

    C41305u0(C41241e0 e0Var, Spliterator spliterator, LongFunction longFunction, C41281o0 o0Var) {
        super(e0Var, spliterator);
        this.f108032h = e0Var;
        this.f108033i = longFunction;
        this.f108034j = o0Var;
    }

    C41305u0(C41305u0 u0Var, Spliterator spliterator) {
        super((C41244f) u0Var, spliterator);
        this.f108032h = u0Var.f108032h;
        this.f108033i = u0Var.f108033i;
        this.f108034j = u0Var.f108034j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo43697a() {
        Spliterator spliterator = this.f107894b;
        C41241e0 e0Var = this.f108032h;
        C41257i0 i0Var = (C41257i0) this.f108033i.apply(e0Var.mo43814K(spliterator));
        e0Var.mo43816X(this.f107894b, i0Var);
        return i0Var.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C41244f mo43698e(Spliterator spliterator) {
        return new C41305u0(this, spliterator);
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z;
        C41244f fVar = this.f107896d;
        if (fVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo43832f((C41277n0) this.f108034j.apply((C41277n0) ((C41305u0) fVar).mo43830c(), (C41277n0) ((C41305u0) this.f107897e).mo43830c()));
        }
        super.onCompletion(countedCompleter);
    }
}
