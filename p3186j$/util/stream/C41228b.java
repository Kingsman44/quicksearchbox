package p3186j$.util.stream;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p3186j$.util.List;
import p3186j$.util.Optional;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.C41108t;
import p3186j$.util.function.Function;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Supplier;
import p3186j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.b */
public final /* synthetic */ class C41228b implements IntFunction, Function, BiConsumer, BinaryOperator, ToLongFunction, Supplier, C41108t {

    /* renamed from: a */
    public final /* synthetic */ int f107847a;

    public /* synthetic */ C41228b(int i) {
        this.f107847a = i;
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f107847a) {
            case 2:
                ((C41268l) obj).accept(obj2);
                return;
            case 20:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.m71778c(dArr, dArr2[0]);
                Collectors.m71778c(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            default:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.m71778c(dArr3, dArr4[0]);
                Collectors.m71778c(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f107847a) {
            case 2:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 20:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    public final Object apply(int i) {
        switch (this.f107847a) {
            case 0:
                return new Object[i];
            case 18:
                return new Double[i];
            case 27:
                int i2 = C41165K.f107744h;
                return new Object[i];
            case 28:
                return new Integer[i];
            default:
                return new Long[i];
        }
    }

    public final long applyAsLong(Object obj) {
        Set set = Collectors.f107719a;
        return 1;
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f107847a) {
            case 1:
                return Function.CC.$default$compose(this, function);
            case 4:
                return Function.CC.$default$compose(this, function);
            case 6:
                return Function.CC.$default$compose(this, function);
            case 7:
                return Function.CC.$default$compose(this, function);
            case 10:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }

    public final Object get() {
        switch (this.f107847a) {
            case 14:
                Set set = Collectors.f107719a;
                return new long[1];
            case 21:
                return new double[4];
            case 24:
                return new double[3];
            case 25:
                return new C41125A();
            default:
                return new C41133C();
        }
    }

    public final Object apply(Object obj) {
        switch (this.f107847a) {
            case 1:
                Set set = Collectors.f107719a;
                return obj;
            case 4:
                Set set2 = Collectors.f107719a;
                return Optional.ofNullable(((C41268l) obj).f107965a);
            case 6:
                Set set3 = Collectors.f107719a;
                return ((Object[]) obj)[0];
            case 7:
                Set set4 = Collectors.f107719a;
                return ((Object[]) obj)[0];
            case 10:
                Set set5 = Collectors.f107719a;
                return List.CC.m71632c(((java.util.List) obj).toArray());
            default:
                Set set6 = Collectors.f107719a;
                return Long.valueOf(((long[]) obj)[0]);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        switch (this.f107847a) {
            case 3:
                C41268l lVar = (C41268l) obj;
                C41268l lVar2 = (C41268l) obj2;
                Set set = Collectors.f107719a;
                if (lVar2.f107966b) {
                    lVar.accept(lVar2.f107965a);
                }
                return lVar;
            case 5:
                Collection collection = (Collection) obj;
                Set set2 = Collectors.f107719a;
                collection.addAll((Collection) obj2);
                return collection;
            case 8:
                java.util.List list = (java.util.List) obj;
                Set set3 = Collectors.f107719a;
                list.addAll((java.util.List) obj2);
                return list;
            case 9:
                java.util.List list2 = (java.util.List) obj;
                Set set4 = Collectors.f107719a;
                list2.addAll((java.util.List) obj2);
                return list2;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                Set set5 = Collectors.f107719a;
                sb.append((StringBuilder) obj2);
                return sb;
            case 13:
                Set set6 = (Set) obj;
                Set set7 = (Set) obj2;
                Set set8 = Collectors.f107719a;
                if (set6.size() < set7.size()) {
                    set7.addAll(set6);
                    return set7;
                }
                set6.addAll(set7);
                return set6;
            case 15:
                long[] jArr = (long[]) obj;
                Set set9 = Collectors.f107719a;
                jArr[0] = jArr[0] + ((long[]) obj2)[0];
                return jArr;
            default:
                Map map = (Map) obj;
                Collectors.m71777b(map, (Map) obj2);
                return map;
        }
    }
}
