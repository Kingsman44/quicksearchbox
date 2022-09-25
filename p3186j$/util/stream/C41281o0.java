package p3186j$.util.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p3186j$.util.OptionalInt;
import p3186j$.util.StringJoiner;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.C41094f;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.LongFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.o0 */
public final /* synthetic */ class C41281o0 implements IntFunction, LongFunction, BinaryOperator, Consumer, BiConsumer, Supplier, Function, C41094f, Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f107989a;

    public /* synthetic */ C41281o0(int i) {
        this.f107989a = i;
    }

    public final void accept(Object obj) {
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f107989a) {
            case 12:
                ((Collection) obj).add(obj2);
                return;
            case 14:
                ((Set) obj).add(obj2);
                return;
            case 15:
                ((StringJoiner) obj).add((CharSequence) obj2);
                return;
            case 20:
                ((List) obj).add(obj2);
                return;
            case 22:
                ((StringBuilder) obj).append((CharSequence) obj2);
                return;
            case 25:
                ((LinkedHashSet) obj).add(obj2);
                return;
            default:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f107989a) {
            case 12:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 14:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 15:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 20:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 22:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 25:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    public final Object apply(int i) {
        switch (this.f107989a) {
            case 0:
                return new Object[i];
            case 8:
                return new Object[i];
            default:
                return new Integer[i];
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f107989a) {
            case 17:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }

    public final Object get() {
        switch (this.f107989a) {
            case 13:
                return new HashSet();
            case 18:
                return new HashMap();
            case 19:
                return new ArrayList();
            case 21:
                return new StringBuilder();
            default:
                return new LinkedHashSet();
        }
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return ((OptionalInt) obj).isPresent();
    }

    public final Object apply(long j) {
        switch (this.f107989a) {
            case 1:
                return C41241e0.m72075I(j);
            case 3:
                return C41241e0.m72081Q(j);
            default:
                return C41241e0.m72082R(j);
        }
    }

    public final Object apply(Object obj) {
        switch (this.f107989a) {
            case 17:
                return ((StringJoiner) obj).toString();
            default:
                return ((StringBuilder) obj).toString();
        }
    }

    public final Object apply(Object obj, Object obj2) {
        switch (this.f107989a) {
            case 2:
                return new C41309v0((C41261j0) obj, (C41261j0) obj2);
            case 4:
                return new C41313w0((C41265k0) obj, (C41265k0) obj2);
            case 6:
                return new C41317x0((C41269l0) obj, (C41269l0) obj2);
            case 7:
                return new C41325z0((C41277n0) obj, (C41277n0) obj2);
            default:
                return ((StringJoiner) obj).mo43519c((StringJoiner) obj2);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f107989a) {
            case 10:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }
}
