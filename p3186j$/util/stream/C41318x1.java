package p3186j$.util.stream;

import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.x1 */
final class C41318x1 extends C41314w1 implements C41310v1 {

    /* renamed from: b */
    long f108043b;

    C41318x1() {
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final void accept(Object obj) {
        this.f108043b++;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f108043b = 0;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* bridge */ /* synthetic */ void end() {
    }

    public final Object get() {
        return Long.valueOf(this.f108043b);
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        this.f108043b += ((C41318x1) v1Var).f108043b;
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }
}
