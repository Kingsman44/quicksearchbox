package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.BiPredicate */
public interface BiPredicate<T, U> {

    /* renamed from: j$.util.function.BiPredicate$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T, U> {
        public static BiPredicate $default$and(BiPredicate biPredicate, BiPredicate biPredicate2) {
            Objects.requireNonNull(biPredicate2);
            return new C41090b(biPredicate, biPredicate2, 0);
        }

        public static BiPredicate $default$negate(BiPredicate biPredicate) {
            return new C41091c(biPredicate);
        }

        public static BiPredicate $default$or(BiPredicate biPredicate, BiPredicate biPredicate2) {
            Objects.requireNonNull(biPredicate2);
            return new C41090b(biPredicate, biPredicate2, 1);
        }
    }

    BiPredicate<T, U> and(BiPredicate<? super T, ? super U> biPredicate);

    BiPredicate<T, U> negate();

    /* renamed from: or */
    BiPredicate<T, U> mo19296or(BiPredicate<? super T, ? super U> biPredicate);

    boolean test(T t, U u);
}
