package p3186j$.util.function;

import p3186j$.util.function.Predicate;

/* renamed from: j$.util.function.u */
public final /* synthetic */ class C41109u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f107680a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f107681b;

    /* renamed from: c */
    public final /* synthetic */ Predicate f107682c;

    public /* synthetic */ C41109u(Predicate predicate, Predicate predicate2, int i) {
        this.f107680a = i;
        this.f107681b = predicate;
        this.f107682c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f107680a) {
            case 0:
                return Predicate.CC.$default$and(this, predicate);
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f107680a) {
            case 0:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        switch (this.f107680a) {
            case 0:
                return Predicate.CC.$default$or(this, predicate);
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    public final boolean test(Object obj) {
        int i = this.f107680a;
        Predicate predicate = this.f107682c;
        Predicate predicate2 = this.f107681b;
        switch (i) {
            case 0:
                if (!predicate2.test(obj) || !predicate.test(obj)) {
                    return false;
                }
                return true;
            default:
                if (predicate2.test(obj) || predicate.test(obj)) {
                    return true;
                }
                return false;
        }
    }
}
