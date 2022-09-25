package p3186j$.util.stream;

import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.G */
final class C41149G extends C41161J implements C41163J1 {

    /* renamed from: b */
    final IntConsumer f107733b;

    C41149G(IntConsumer intConsumer, boolean z) {
        super(z);
        this.f107733b = intConsumer;
    }

    public final void accept(int i) {
        this.f107733b.accept(i);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43736d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        C41241e0.m72089g(this, num);
    }
}
