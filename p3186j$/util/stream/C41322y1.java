package p3186j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.y1 */
final class C41322y1 extends C41244f {

    /* renamed from: h */
    private final C41241e0 f108045h;

    C41322y1(C41241e0 e0Var, C41241e0 e0Var2, Spliterator spliterator) {
        super(e0Var2, spliterator);
        this.f108045h = e0Var;
    }

    C41322y1(C41322y1 y1Var, Spliterator spliterator) {
        super((C41244f) y1Var, spliterator);
        this.f108045h = y1Var.f108045h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo43697a() {
        C41310v1 W = this.f108045h.mo43844W();
        this.f107893a.mo43816X(this.f107894b, W);
        return W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C41244f mo43698e(Spliterator spliterator) {
        return new C41322y1(this, spliterator);
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
            C41310v1 v1Var = (C41310v1) ((C41322y1) fVar).mo43830c();
            v1Var.mo43853h((C41310v1) ((C41322y1) this.f107897e).mo43830c());
            mo43832f(v1Var);
        }
        super.onCompletion(countedCompleter);
    }
}
