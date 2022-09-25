package p3186j$.util.function;

import p3186j$.util.Objects;
import p3186j$.util.concurrent.C41083t;

/* renamed from: j$.util.function.Consumer */
public interface Consumer<T> {

    /* renamed from: j$.util.function.Consumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
            Objects.requireNonNull(consumer2);
            return new C41083t(3, consumer, consumer2);
        }
    }

    /* renamed from: j$.util.function.Consumer$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Consumer f107642a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f107642a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof Wrapper ? Consumer.this : new VivifiedWrapper(consumer);
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f107642a.accept(obj);
        }

        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return convert(this.f107642a.andThen(Wrapper.convert(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f107642a;
            }
            return this.f107642a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f107642a.hashCode();
        }
    }

    /* renamed from: j$.util.function.Consumer$Wrapper */
    public final /* synthetic */ class Wrapper implements java.util.function.Consumer {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.function.Consumer convert(Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof VivifiedWrapper ? ((VivifiedWrapper) consumer).f107642a : new Wrapper();
        }

        public final /* synthetic */ void accept(Object obj) {
            Consumer.this.accept(obj);
        }

        public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
            return convert(Consumer.this.andThen(VivifiedWrapper.convert(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof Wrapper) {
                obj = Consumer.this;
            }
            return Consumer.this.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return Consumer.this.hashCode();
        }
    }

    void accept(T t);

    Consumer<T> andThen(Consumer<? super T> consumer);
}
