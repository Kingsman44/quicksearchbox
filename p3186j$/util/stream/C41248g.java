package p3186j$.util.stream;

import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.g */
public final /* synthetic */ class C41248g implements Supplier, BinaryOperator, BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ int f107903a;

    /* renamed from: b */
    public final /* synthetic */ BinaryOperator f107904b;

    public /* synthetic */ C41248g(BinaryOperator binaryOperator, int i) {
        this.f107903a = i;
        this.f107904b = binaryOperator;
    }

    public final void accept(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        Set set = Collectors.f107719a;
        objArr[0] = this.f107904b.apply(objArr[0], obj2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f107903a) {
            case 1:
                return BiFunction.CC.$default$andThen(this, function);
            case 2:
                return BiFunction.CC.$default$andThen(this, function);
            case 4:
                return BiFunction.CC.$default$andThen(this, function);
            default:
                return BiFunction.CC.$default$andThen(this, function);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        int i = this.f107903a;
        BinaryOperator binaryOperator = this.f107904b;
        switch (i) {
            case 1:
                Map map = (Map) obj;
                Set set = Collectors.f107719a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Map.EL.merge(map, entry.getKey(), entry.getValue(), binaryOperator);
                }
                return map;
            case 2:
                C41280o oVar = (C41280o) obj;
                C41280o oVar2 = (C41280o) obj2;
                Set set2 = Collectors.f107719a;
                return new C41280o(binaryOperator.apply(oVar.f107987a, oVar2.f107987a), binaryOperator.apply(oVar.f107988b, oVar2.f107988b));
            case 4:
                Object[] objArr = (Object[]) obj;
                Set set3 = Collectors.f107719a;
                objArr[0] = binaryOperator.apply(objArr[0], ((Object[]) obj2)[0]);
                return objArr;
            default:
                Object[] objArr2 = (Object[]) obj;
                Set set4 = Collectors.f107719a;
                objArr2[0] = binaryOperator.apply(objArr2[0], ((Object[]) obj2)[0]);
                return objArr2;
        }
    }

    public final Object get() {
        Set set = Collectors.f107719a;
        return new C41268l(this.f107904b);
    }
}
