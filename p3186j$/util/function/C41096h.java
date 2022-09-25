package p3186j$.util.function;

import p3186j$.util.function.DoublePredicate;

/* renamed from: j$.util.function.h */
public final /* synthetic */ class C41096h implements DoublePredicate {

    /* renamed from: a */
    public final /* synthetic */ int f107656a;

    /* renamed from: b */
    public final /* synthetic */ DoublePredicate f107657b;

    /* renamed from: c */
    public final /* synthetic */ DoublePredicate f107658c;

    public /* synthetic */ C41096h(DoublePredicate doublePredicate, DoublePredicate doublePredicate2, int i) {
        this.f107656a = i;
        this.f107657b = doublePredicate;
        this.f107658c = doublePredicate2;
    }

    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        switch (this.f107656a) {
            case 0:
                return DoublePredicate.CC.$default$and(this, doublePredicate);
            default:
                return DoublePredicate.CC.$default$and(this, doublePredicate);
        }
    }

    public final /* synthetic */ DoublePredicate negate() {
        switch (this.f107656a) {
            case 0:
                return DoublePredicate.CC.$default$negate(this);
            default:
                return DoublePredicate.CC.$default$negate(this);
        }
    }

    /* renamed from: or */
    public final /* synthetic */ DoublePredicate mo43591or(DoublePredicate doublePredicate) {
        switch (this.f107656a) {
            case 0:
                return DoublePredicate.CC.$default$or(this, doublePredicate);
            default:
                return DoublePredicate.CC.$default$or(this, doublePredicate);
        }
    }

    public final boolean test(double d) {
        int i = this.f107656a;
        DoublePredicate doublePredicate = this.f107658c;
        DoublePredicate doublePredicate2 = this.f107657b;
        switch (i) {
            case 0:
                if (doublePredicate2.test(d) || doublePredicate.test(d)) {
                    return true;
                }
                return false;
            default:
                if (!doublePredicate2.test(d) || !doublePredicate.test(d)) {
                    return false;
                }
                return true;
        }
    }
}
