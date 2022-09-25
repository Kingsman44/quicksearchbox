package p3186j$.util.function;

import p3186j$.util.function.IntPredicate;

/* renamed from: j$.util.function.o */
public final /* synthetic */ class C41103o implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ int f107669a;

    /* renamed from: b */
    public final /* synthetic */ IntPredicate f107670b;

    /* renamed from: c */
    public final /* synthetic */ IntPredicate f107671c;

    public /* synthetic */ C41103o(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
        this.f107669a = i;
        this.f107670b = intPredicate;
        this.f107671c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.f107669a) {
            case 0:
                return IntPredicate.CC.$default$and(this, intPredicate);
            default:
                return IntPredicate.CC.$default$and(this, intPredicate);
        }
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (this.f107669a) {
            case 0:
                return IntPredicate.CC.$default$negate(this);
            default:
                return IntPredicate.CC.$default$negate(this);
        }
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo19598or(IntPredicate intPredicate) {
        switch (this.f107669a) {
            case 0:
                return IntPredicate.CC.$default$or(this, intPredicate);
            default:
                return IntPredicate.CC.$default$or(this, intPredicate);
        }
    }

    public final boolean test(int i) {
        int i2 = this.f107669a;
        IntPredicate intPredicate = this.f107671c;
        IntPredicate intPredicate2 = this.f107670b;
        switch (i2) {
            case 0:
                if (intPredicate2.test(i) || intPredicate.test(i)) {
                    return true;
                }
                return false;
            default:
                if (!intPredicate2.test(i) || !intPredicate.test(i)) {
                    return false;
                }
                return true;
        }
    }
}
