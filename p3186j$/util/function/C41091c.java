package p3186j$.util.function;

import p3186j$.util.function.BiPredicate;
import p3186j$.util.function.DoublePredicate;
import p3186j$.util.function.IntPredicate;
import p3186j$.util.function.Predicate;

/* renamed from: j$.util.function.c */
public final /* synthetic */ class C41091c implements BiPredicate, DoublePredicate, IntPredicate, Predicate {

    /* renamed from: a */
    public final /* synthetic */ Object f107650a;

    public /* synthetic */ C41091c(Object obj) {
        this.f107650a = obj;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return DoublePredicate.CC.$default$and(this, doublePredicate);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    /* renamed from: or */
    public final /* synthetic */ BiPredicate mo19296or(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$or(this, biPredicate);
    }

    /* renamed from: or */
    public final /* synthetic */ DoublePredicate mo43591or(DoublePredicate doublePredicate) {
        return DoublePredicate.CC.$default$or(this, doublePredicate);
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo19598or(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$or(this, intPredicate);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(double d) {
        return !((DoublePredicate) this.f107650a).test(d);
    }

    public final boolean test(int i) {
        return !((IntPredicate) this.f107650a).test(i);
    }

    public final boolean test(Object obj) {
        return !((Predicate) this.f107650a).test(obj);
    }

    public final boolean test(Object obj, Object obj2) {
        return !((BiPredicate) this.f107650a).test(obj, obj2);
    }
}
