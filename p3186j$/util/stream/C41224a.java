package p3186j$.util.stream;

import java.util.List;
import java.util.Set;
import p3186j$.util.Spliterator;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.LongFunction;
import p3186j$.util.function.Supplier;
import p3186j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.a */
public final /* synthetic */ class C41224a implements Supplier, Function, BiConsumer, LongFunction, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f107843a;

    /* renamed from: b */
    public final /* synthetic */ Object f107844b;

    public /* synthetic */ C41224a(int i, Object obj) {
        this.f107843a = i;
        this.f107844b = obj;
    }

    public final void accept(Object obj) {
        int i = this.f107843a;
        Object obj2 = this.f107844b;
        switch (i) {
            case 6:
                ((C41171L1) obj2).accept(obj);
                return;
            default:
                ((List) obj2).add(obj);
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f107843a) {
            case 6:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(long j) {
        int i = C41301t0.f108025k;
        return C41241e0.m72071C(j, (IntFunction) this.f107844b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object get() {
        int i = this.f107843a;
        Object obj = this.f107844b;
        switch (i) {
            case 0:
                return (Spliterator) obj;
            case 1:
                return ((C41232c) obj).mo43823h0();
            default:
                Set set = Collectors.f107719a;
                return new Object[]{obj};
        }
    }

    public final Object apply(Object obj) {
        Set set = Collectors.f107719a;
        return ((Supplier) this.f107844b).get();
    }

    public final void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        Set set = Collectors.f107719a;
        jArr[0] = ((ToLongFunction) this.f107844b).applyAsLong(obj2) + jArr[0];
    }
}
