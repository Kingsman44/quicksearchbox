package p3186j$.util.stream;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: j$.util.stream.s */
public final /* synthetic */ class C41296s implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ int f108016a;

    /* renamed from: b */
    public final /* synthetic */ BiConsumer f108017b;

    public /* synthetic */ C41296s(BiConsumer biConsumer, int i) {
        this.f108016a = i;
        this.f108017b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f108016a) {
            case 0:
                return BiFunction.CC.$default$andThen(this, function);
            default:
                return BiFunction.CC.$default$andThen(this, function);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        int i = this.f108016a;
        BiConsumer biConsumer = this.f108017b;
        switch (i) {
            case 0:
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                biConsumer.accept(obj, obj2);
                return obj;
        }
    }
}
