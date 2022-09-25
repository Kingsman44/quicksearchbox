package p3186j$.util.stream;

import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.G1 */
public abstract class C41151G1 implements C41163J1 {

    /* renamed from: a */
    protected final C41171L1 f107734a;

    public C41151G1(C41171L1 l1) {
        this.f107734a = (C41171L1) Objects.requireNonNull(l1);
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
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

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        C41241e0.m72089g(this, num);
    }

    /* renamed from: e */
    public boolean mo43664e() {
        return this.f107734a.mo43664e();
    }

    public final void end() {
        this.f107734a.end();
    }
}
