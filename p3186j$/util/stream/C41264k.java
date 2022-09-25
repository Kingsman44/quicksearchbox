package p3186j$.util.stream;

import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: j$.util.stream.k */
public final /* synthetic */ class C41264k implements Function, BiFunction {

    /* renamed from: a */
    public final /* synthetic */ Function f107952a;

    public /* synthetic */ C41264k(Function function) {
        this.f107952a = function;
    }

    public final Object apply(Object obj) {
        Map map = (Map) obj;
        Set set = Collectors.f107719a;
        Map.EL.m71635a(map, new C41264k(this.f107952a));
        return map;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Set set = Collectors.f107719a;
        return this.f107952a.apply(obj2);
    }
}
