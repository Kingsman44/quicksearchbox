package p3186j$.util.function;

import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.function.m */
public final /* synthetic */ class C41101m implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ IntConsumer f107666a;

    /* renamed from: b */
    public final /* synthetic */ IntConsumer f107667b;

    public /* synthetic */ C41101m(IntConsumer intConsumer, IntConsumer intConsumer2) {
        this.f107666a = intConsumer;
        this.f107667b = intConsumer2;
    }

    public final void accept(int i) {
        this.f107666a.accept(i);
        this.f107667b.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
