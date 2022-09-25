package p3186j$.util.function;

import p3186j$.util.function.BiPredicate;

/* renamed from: j$.util.function.b */
public final /* synthetic */ class C41090b implements BiPredicate {

    /* renamed from: a */
    public final /* synthetic */ int f107647a;

    /* renamed from: b */
    public final /* synthetic */ BiPredicate f107648b;

    /* renamed from: c */
    public final /* synthetic */ BiPredicate f107649c;

    public /* synthetic */ C41090b(BiPredicate biPredicate, BiPredicate biPredicate2, int i) {
        this.f107647a = i;
        this.f107648b = biPredicate;
        this.f107649c = biPredicate2;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        switch (this.f107647a) {
            case 0:
                return BiPredicate.CC.$default$and(this, biPredicate);
            default:
                return BiPredicate.CC.$default$and(this, biPredicate);
        }
    }

    public final /* synthetic */ BiPredicate negate() {
        switch (this.f107647a) {
            case 0:
                return BiPredicate.CC.$default$negate(this);
            default:
                return BiPredicate.CC.$default$negate(this);
        }
    }

    /* renamed from: or */
    public final /* synthetic */ BiPredicate mo19296or(BiPredicate biPredicate) {
        switch (this.f107647a) {
            case 0:
                return BiPredicate.CC.$default$or(this, biPredicate);
            default:
                return BiPredicate.CC.$default$or(this, biPredicate);
        }
    }

    public final boolean test(Object obj, Object obj2) {
        int i = this.f107647a;
        BiPredicate biPredicate = this.f107649c;
        BiPredicate biPredicate2 = this.f107648b;
        switch (i) {
            case 0:
                if (!biPredicate2.test(obj, obj2) || !biPredicate.test(obj, obj2)) {
                    return false;
                }
                return true;
            default:
                if (biPredicate2.test(obj, obj2) || biPredicate.test(obj, obj2)) {
                    return true;
                }
                return false;
        }
    }
}
