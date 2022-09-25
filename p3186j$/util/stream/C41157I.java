package p3186j$.util.stream;

import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.I */
final class C41157I extends C41161J {

    /* renamed from: b */
    final Consumer f107738b;

    C41157I(Consumer consumer, boolean z) {
        super(z);
        this.f107738b = consumer;
    }

    public final void accept(Object obj) {
        this.f107738b.accept(obj);
    }
}
