package p3186j$.util.stream;

import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.H */
final class C41153H extends C41161J implements C41167K1 {

    /* renamed from: b */
    final LongConsumer f107736b;

    C41153H(LongConsumer longConsumer) {
        super(true);
        this.f107736b = longConsumer;
    }

    public final void accept(long j) {
        this.f107736b.accept(j);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43738j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer.CC.$default$andThen(this, longConsumer);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo43738j(Long l) {
        C41241e0.m72091i(this, l);
    }
}
