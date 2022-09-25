package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.Predicate */
public interface Predicate<T> {

    /* renamed from: j$.util.function.Predicate$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
            Objects.requireNonNull(predicate2);
            return new C41109u(predicate, predicate2, 0);
        }

        public static Predicate $default$negate(Predicate predicate) {
            return new C41091c(predicate);
        }

        public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
            Objects.requireNonNull(predicate2);
            return new C41109u(predicate, predicate2, 1);
        }

        public static <T> Predicate<T> not(Predicate<? super T> predicate) {
            Objects.requireNonNull(predicate);
            return predicate.negate();
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    /* renamed from: or */
    Predicate<T> mo17950or(Predicate<? super T> predicate);

    boolean test(T t);
}
