package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.J */
abstract class C41161J implements C41199S2, C41203T2 {

    /* renamed from: a */
    private final boolean f107740a;

    protected C41161J(boolean z) {
        this.f107740a = z;
    }

    /* renamed from: a */
    public final Object mo43758a(C41241e0 e0Var, Spliterator spliterator) {
        (this.f107740a ? new C41165K(e0Var, spliterator, (C41171L1) this) : new C41169L(e0Var, spliterator, e0Var.mo43817Y(this))).invoke();
        return null;
    }

    public /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final int mo43759b() {
        if (this.f107740a) {
            return 0;
        }
        return C41259i2.f107934r;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo43663c(long j) {
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final Object mo43760f(C41241e0 e0Var, Spliterator spliterator) {
        e0Var.mo43816X(spliterator, this);
        return null;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }
}
