package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.DoublePredicate */
public interface DoublePredicate {

    /* renamed from: j$.util.function.DoublePredicate$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static DoublePredicate $default$and(DoublePredicate doublePredicate, DoublePredicate doublePredicate2) {
            Objects.requireNonNull(doublePredicate2);
            return new C41096h(doublePredicate, doublePredicate2, 1);
        }

        public static DoublePredicate $default$negate(DoublePredicate doublePredicate) {
            return new C41091c(doublePredicate);
        }

        public static DoublePredicate $default$or(DoublePredicate doublePredicate, DoublePredicate doublePredicate2) {
            Objects.requireNonNull(doublePredicate2);
            return new C41096h(doublePredicate, doublePredicate2, 0);
        }
    }

    DoublePredicate and(DoublePredicate doublePredicate);

    DoublePredicate negate();

    /* renamed from: or */
    DoublePredicate mo43591or(DoublePredicate doublePredicate);

    boolean test(double d);
}
