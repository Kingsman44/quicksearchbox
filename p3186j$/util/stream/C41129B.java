package p3186j$.util.stream;

import p3186j$.util.Optional;
import p3186j$.util.function.C41100l;
import p3186j$.util.function.C41105q;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;

/* renamed from: j$.util.stream.B */
public final /* synthetic */ class C41129B implements Predicate, C41100l, IntFunction, C41105q, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f107714a;

    public /* synthetic */ C41129B(int i) {
        this.f107714a = i;
    }

    public final void accept(Object obj) {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object apply(int i) {
        return Integer.valueOf(i);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}
