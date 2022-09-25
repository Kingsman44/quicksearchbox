package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.IntPredicate */
public interface IntPredicate {

    /* renamed from: j$.util.function.IntPredicate$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntPredicate $default$and(IntPredicate intPredicate, IntPredicate intPredicate2) {
            Objects.requireNonNull(intPredicate2);
            return new C41103o(intPredicate, intPredicate2, 1);
        }

        public static IntPredicate $default$negate(IntPredicate intPredicate) {
            return new C41091c(intPredicate);
        }

        public static IntPredicate $default$or(IntPredicate intPredicate, IntPredicate intPredicate2) {
            Objects.requireNonNull(intPredicate2);
            return new C41103o(intPredicate, intPredicate2, 0);
        }
    }

    IntPredicate and(IntPredicate intPredicate);

    IntPredicate negate();

    /* renamed from: or */
    IntPredicate mo19598or(IntPredicate intPredicate);

    boolean test(int i);
}
