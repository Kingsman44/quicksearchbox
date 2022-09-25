package p3186j$.util.function;

import p3186j$.util.Objects;
import p3186j$.util.concurrent.C41083t;

/* renamed from: j$.util.function.BiConsumer */
public interface BiConsumer<T, U> {

    /* renamed from: j$.util.function.BiConsumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T, U> {
        public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
            Objects.requireNonNull(biConsumer2);
            return new C41083t(1, biConsumer, biConsumer2);
        }
    }

    /* renamed from: j$.util.function.BiConsumer$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiConsumer f107640a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f107640a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C41089a ? ((C41089a) biConsumer).f107646a : new VivifiedWrapper(biConsumer);
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.f107640a.accept(obj, obj2);
        }

        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return convert(this.f107640a.andThen(C41089a.m71719a(biConsumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f107640a;
            }
            return this.f107640a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f107640a.hashCode();
        }
    }

    void accept(T t, U u);

    BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> biConsumer);
}
