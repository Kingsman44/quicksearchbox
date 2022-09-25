package p3186j$.util.function;

import java.util.function.IntConsumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.function.n */
public final /* synthetic */ class C41102n implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ IntConsumer f107668a;

    private /* synthetic */ C41102n(IntConsumer intConsumer) {
        this.f107668a = intConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ IntConsumer m71728a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof IntConsumer.VivifiedWrapper ? ((IntConsumer.VivifiedWrapper) intConsumer).f107645a : new C41102n(intConsumer);
    }

    public final /* synthetic */ void accept(int i) {
        this.f107668a.accept(i);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return m71728a(this.f107668a.andThen(IntConsumer.VivifiedWrapper.convert(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C41102n) {
            obj = ((C41102n) obj).f107668a;
        }
        return this.f107668a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f107668a.hashCode();
    }
}
