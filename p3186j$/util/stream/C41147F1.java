package p3186j$.util.stream;

import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.F1 */
public abstract class C41147F1 implements C41159I1 {

    /* renamed from: a */
    protected final C41171L1 f107727a;

    public C41147F1(C41171L1 l1) {
        this.f107727a = (C41171L1) Objects.requireNonNull(l1);
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43666k((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f107727a.mo43663c(j);
    }

    /* renamed from: e */
    public final boolean mo43664e() {
        return this.f107727a.mo43664e();
    }

    public final void end() {
        this.f107727a.end();
    }

    /* renamed from: k */
    public final /* synthetic */ void mo43666k(Double d) {
        C41241e0.m72087d(this, d);
    }
}
