package p3186j$.util.stream;

import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.H1 */
public abstract class C41155H1 implements C41171L1 {

    /* renamed from: a */
    protected final C41171L1 f107737a;

    public C41155H1(C41171L1 l1) {
        this.f107737a = (C41171L1) Objects.requireNonNull(l1);
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: e */
    public boolean mo43664e() {
        return this.f107737a.mo43664e();
    }

    public void end() {
        this.f107737a.end();
    }
}
