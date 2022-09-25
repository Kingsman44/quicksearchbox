package p3186j$.util.stream;

import p3186j$.util.Optional;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.k1 */
final class C41266k1 implements C41310v1 {

    /* renamed from: a */
    private boolean f107953a;

    /* renamed from: b */
    private Object f107954b;

    /* renamed from: c */
    final /* synthetic */ BinaryOperator f107955c;

    C41266k1(BinaryOperator binaryOperator) {
        this.f107955c = binaryOperator;
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final void accept(Object obj) {
        if (this.f107953a) {
            this.f107953a = false;
        } else {
            obj = this.f107955c.apply(this.f107954b, obj);
        }
        this.f107954b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f107953a = true;
        this.f107954b = null;
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    public final Object get() {
        return this.f107953a ? Optional.empty() : Optional.m71637of(this.f107954b);
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        C41266k1 k1Var = (C41266k1) v1Var;
        if (!k1Var.f107953a) {
            accept(k1Var.f107954b);
        }
    }
}
