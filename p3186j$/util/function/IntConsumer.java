package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.IntConsumer */
public interface IntConsumer {

    /* renamed from: j$.util.function.IntConsumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntConsumer $default$andThen(IntConsumer intConsumer, IntConsumer intConsumer2) {
            Objects.requireNonNull(intConsumer2);
            return new C41101m(intConsumer, intConsumer2);
        }
    }

    /* renamed from: j$.util.function.IntConsumer$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements IntConsumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.IntConsumer f107645a;

        private /* synthetic */ VivifiedWrapper(java.util.function.IntConsumer intConsumer) {
            this.f107645a = intConsumer;
        }

        public static /* synthetic */ IntConsumer convert(java.util.function.IntConsumer intConsumer) {
            if (intConsumer == null) {
                return null;
            }
            return intConsumer instanceof C41102n ? ((C41102n) intConsumer).f107668a : new VivifiedWrapper(intConsumer);
        }

        public final /* synthetic */ void accept(int i) {
            this.f107645a.accept(i);
        }

        public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
            return convert(this.f107645a.andThen(C41102n.m71728a(intConsumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f107645a;
            }
            return this.f107645a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f107645a.hashCode();
        }
    }

    void accept(int i);

    IntConsumer andThen(IntConsumer intConsumer);
}
