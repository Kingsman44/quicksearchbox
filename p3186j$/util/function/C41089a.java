package p3186j$.util.function;

import java.util.function.BiConsumer;
import p3186j$.util.function.BiConsumer;

/* renamed from: j$.util.function.a */
public final /* synthetic */ class C41089a implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f107646a;

    private /* synthetic */ C41089a(BiConsumer biConsumer) {
        this.f107646a = biConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ BiConsumer m71719a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).f107640a : new C41089a(biConsumer);
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.f107646a.accept(obj, obj2);
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return m71719a(this.f107646a.andThen(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C41089a) {
            obj = ((C41089a) obj).f107646a;
        }
        return this.f107646a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f107646a.hashCode();
    }
}
