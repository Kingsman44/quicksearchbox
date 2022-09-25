package p3186j$.util.stream;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;
import p3186j$.util.function.IntPredicate;
import p3186j$.util.function.Predicate;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.h */
public final /* synthetic */ class C41252h implements BiConsumer, Consumer, Supplier {

    /* renamed from: a */
    public final /* synthetic */ int f107909a;

    /* renamed from: b */
    public final /* synthetic */ Object f107910b;

    /* renamed from: c */
    public final /* synthetic */ Object f107911c;

    public /* synthetic */ C41252h(int i, Object obj, Object obj2) {
        this.f107909a = i;
        this.f107910b = obj;
        this.f107911c = obj2;
    }

    public final void accept(Object obj) {
        int i = this.f107909a;
        Object obj2 = this.f107911c;
        Object obj3 = this.f107910b;
        switch (i) {
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 7:
                ((BiConsumer) obj3).accept(obj2, obj);
                return;
            default:
                ((C41287p2) obj3).mo43864m((Consumer) obj2, obj);
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f107909a) {
            case 0:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 1:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 2:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    public final Object get() {
        int i = this.f107909a;
        Object obj = this.f107911c;
        Object obj2 = this.f107910b;
        switch (i) {
            case 5:
                return new C41221Z((IntPredicate) obj, (C41229b0) obj2);
            default:
                return new C41218Y((Predicate) obj, (C41229b0) obj2);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f107909a) {
            case 4:
                return Consumer.CC.$default$andThen(this, consumer);
            case 7:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final void accept(Object obj, Object obj2) {
        int i = this.f107909a;
        Object obj3 = this.f107911c;
        Object obj4 = this.f107910b;
        switch (i) {
            case 0:
                BiConsumer biConsumer = (BiConsumer) obj4;
                C41280o oVar = (C41280o) obj;
                Set set = Collectors.f107719a;
                biConsumer.accept(((Predicate) obj3).test(obj2) ? oVar.f107987a : oVar.f107988b, obj2);
                return;
            case 1:
                Set set2 = Collectors.f107719a;
                ((BiConsumer) obj4).accept(obj, ((Function) obj3).apply(obj2));
                return;
            case 2:
                Object[] objArr = (Object[]) obj;
                Set set3 = Collectors.f107719a;
                objArr[0] = ((BinaryOperator) obj4).apply(objArr[0], ((Function) obj3).apply(obj2));
                return;
            default:
                Collectors.m71776a((Function) obj4, (Function) obj3, (Map) obj, obj2);
                return;
        }
    }
}
