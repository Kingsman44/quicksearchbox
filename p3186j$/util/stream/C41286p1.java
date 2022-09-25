package p3186j$.util.stream;

import p3186j$.util.function.C41100l;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.p1 */
final class C41286p1 implements C41310v1, C41163J1 {

    /* renamed from: a */
    private int f107995a;

    /* renamed from: b */
    final /* synthetic */ int f107996b;

    /* renamed from: c */
    final /* synthetic */ C41100l f107997c;

    C41286p1(int i, C41100l lVar) {
        this.f107996b = i;
        this.f107997c = lVar;
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final void accept(int i) {
        int i2;
        int i3 = this.f107995a;
        switch (((C41129B) this.f107997c).f107714a) {
            case 1:
                i2 = Math.min(i3, i);
                break;
            case 2:
                i2 = i3 + i;
                break;
            default:
                i2 = Math.max(i3, i);
                break;
        }
        this.f107995a = i2;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43736d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f107995a = this.f107996b;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        C41241e0.m72089g(this, num);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    public final Object get() {
        return Integer.valueOf(this.f107995a);
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        accept(((C41286p1) v1Var).f107995a);
    }
}
